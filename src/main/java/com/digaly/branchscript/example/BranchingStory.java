package com.digaly.branchscript.example;

import com.digaly.branchscript.grammar.BranchscriptParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BranchingStory implements BranchingStoryNotifier {
    private Map<String, BranchscriptParser.ConversationContext> conversations;
    private Map<String, Integer> flags;

    private BranchscriptParser.ConversationContext currentConversation;
    private int currentFragment;
    private boolean expectingAnswer;
    private BranchscriptParser.FragmentAnswerContext chosenAnswer;

    private List<BranchingStoryListener> branchingStoryListeners;

    private enum CheckMode {
        IF,
        IF_AND,
        IF_OR
    }

    public BranchingStory(BranchscriptParser.ScriptContext scriptContext) {
        this.conversations = new HashMap<>();
        this.flags = new HashMap<>();
        this.branchingStoryListeners = new ArrayList<>();
        this.expectingAnswer = false;

        loadConversations(scriptContext.conversation());
        switchConversation(scriptContext.conversation(0));
    }

    private void loadConversations(List<BranchscriptParser.ConversationContext> ctxConversationList) {
        for (BranchscriptParser.ConversationContext ctxConv : ctxConversationList) {
            conversations.put(ctxConv.conversationHeader().conversationId().getText(), ctxConv);
        }
    }

    private void switchConversation(BranchscriptParser.ConversationContext newContext) {
        this.currentConversation = newContext;
        this.currentFragment = 0;
    }

    public boolean isExpectingAnswer() {
        return expectingAnswer;
    }

    public void setChosenAnswer(BranchscriptParser.FragmentAnswerContext chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public void next() {
        BranchscriptParser.ConversationFragmentContext fragmentContext = getCurrentFragment();

        if (fragmentContext.fragmentDialogue() != null) { //Dealing with dialogue, so move to next
            if (fragmentContext.fragmentDialogue().fragmentAnswer().size() > 0) {
                if (chosenAnswer != null) {
                    //If it has any flags to set, we process them now
                    if (getCurrentFragment().fragmentDialogue().setFlags() != null) {
                        setFlags(getCurrentFragment().fragmentDialogue().setFlags());
                    }

                    //Also process the answer's flags
                    if (chosenAnswer.setFlags() != null) {
                        setFlags(chosenAnswer.setFlags());
                    }

                    chosenAnswer = null;

                    advanceConversation();
                } else {
                    notifyDialogue(fragmentContext.fragmentDialogue().STRING().getText(), fragmentContext.fragmentDialogue().fragmentAnswer());
                }
            } else {
                //If it has any flags to set, we process them now
                if (getCurrentFragment().fragmentDialogue().setFlags() != null) {
                    setFlags(getCurrentFragment().fragmentDialogue().setFlags());
                }

                notifyDialogue(getCurrentFragment().fragmentDialogue().STRING().getText(), null);

                advanceConversation();
            }
        } else if (fragmentContext.conversationLink() != null) {
            boolean canFollowLink = true;

            //We check the link conditions first
            if (fragmentContext.conversationLink().linkCondition() != null) {
                canFollowLink = checkFlags(fragmentContext.conversationLink().linkCondition());
            }

            if (canFollowLink)
            {
                BranchscriptParser.ConversationContext newContext = conversations.get(fragmentContext.conversationLink().conversationId().ID().getText());

                notifyLink(currentConversation, newContext);

                switchConversation(newContext);
                next();
            } else advanceConversation();
        } else if (fragmentContext.fragmentTrigger() != null) {
            List<String> triggerParameters = new ArrayList<>();

            if (fragmentContext.fragmentTrigger().triggerOptionsCollection() != null) {
                for (int i = 0; i < fragmentContext.fragmentTrigger().triggerOptionsCollection().STRING().size(); i++) {
                    triggerParameters.add(fragmentContext.fragmentTrigger().triggerOptionsCollection().STRING(i).getText());
                }
            }

            notifyTrigger(fragmentContext.fragmentTrigger().triggerId().ID().getText(), triggerParameters);

            advanceConversation();
        }
    }

    private void setFlags(BranchscriptParser.SetFlagsContext ctxFlags) {
        for (BranchscriptParser.FlagAssignmentContext ctxFlag : ctxFlags.flagAssignmentCollection().flagAssignment()) {
            if (ctxFlag.assignmentTrue() != null) {
                flags.put(ctxFlag.assignmentTrue().ID().getText(), 1);
            } else if (ctxFlag.assignmentIncrement() != null) {
                if (flags.containsKey(ctxFlag.assignmentIncrement().ID().getText())) {
                    flags.put(ctxFlag.assignmentIncrement().ID().getText(), flags.get(ctxFlag.assignmentIncrement().ID().getText()) + 1);
                } else {
                    flags.put(ctxFlag.assignmentIncrement().ID().getText(), 1);
                }
            } else if (ctxFlag.assignmentDecrement() != null) {
                if (flags.containsKey(ctxFlag.assignmentDecrement().ID().getText())) {
                    flags.put(ctxFlag.assignmentDecrement().ID().getText(), flags.get(ctxFlag.assignmentDecrement().ID().getText()) - 1);
                } else {
                    flags.put(ctxFlag.assignmentDecrement().ID().getText(), -1);
                }
            } else if (ctxFlag.assignmentAssign() != null) {
                flags.put(ctxFlag.assignmentAssign().ID().getText(), parseValue(ctxFlag.assignmentAssign().value()));
            }
        }
    }

    private int parseValue(BranchscriptParser.ValueContext valueContext) {
        if (valueContext.boolValue() != null) {
            return valueContext.boolValue().BOOL_TRUE() != null ? 1 : 0;
        } else if (valueContext.intValue() != null) {
            return Integer.parseInt(valueContext.intValue().NUMBER().getText());
        }

        System.err.println("Unknown value!");

        return 0;
    }

    private boolean checkFlags(BranchscriptParser.LinkConditionContext ctxLinks) {
        CheckMode checkMode = ctxLinks.ifCondition() != null ? CheckMode.IF :
                ctxLinks.ifAndCondition() != null ? CheckMode.IF_AND : ctxLinks.ifOrCondition() != null ? CheckMode.IF_OR : null;

        if (checkMode == CheckMode.IF) {
            BranchscriptParser.IfConditionContext ifCtx = ctxLinks.ifCondition();

            return evaluateFlagCondition(ifCtx.flagCondition());
        } else if (checkMode == CheckMode.IF_AND) {
            BranchscriptParser.IfAndConditionContext ifAndCtx = ctxLinks.ifAndCondition();

            for (BranchscriptParser.FlagConditionContext flagCond : ifAndCtx.conditionCollection().flagCondition()) {
                if (!evaluateFlagCondition(flagCond)) {
                    return false;
                }
            }

            return true;
        } else if (checkMode == CheckMode.IF_OR) {
            BranchscriptParser.IfOrConditionContext ifOrCtx = ctxLinks.ifOrCondition();


            for (BranchscriptParser.FlagConditionContext flagCond : ifOrCtx.conditionCollection().flagCondition()) {
                if (evaluateFlagCondition(flagCond)) {
                    return true;
                }
            }

            return false;
        }

        System.err.println("Unknown flag checking mode!");

        return false;
    }

    private boolean evaluateFlagCondition(BranchscriptParser.FlagConditionContext condCtx) {
        if (condCtx.conditionEqual() != null) {
            String flagName = condCtx.conditionEqual().ID().getText();

            if (!flags.containsKey(flagName)) flags.put(flagName, 0);

            return flags.get(flagName).equals(parseValue(condCtx.conditionEqual().value()));
        } else if (condCtx.conditionGreater() != null) {
            String flagName = condCtx.conditionGreater().ID().getText();

            if (!flags.containsKey(flagName)) flags.put(flagName, 0);

            return flags.get(flagName) > parseValue(condCtx.conditionGreater().value());
        } else if (condCtx.conditionLess() != null) {
            String flagName = condCtx.conditionLess().ID().getText();

            if (!flags.containsKey(flagName)) flags.put(flagName, 0);

            return flags.get(flagName) < parseValue(condCtx.conditionLess().value());
        } else if (condCtx.conditionTrue() != null) {
            String flagName = condCtx.conditionTrue().ID().getText();

            if (!flags.containsKey(flagName)) flags.put(flagName, 0);

            return flags.get(flagName) >= 1;
        }

        System.err.println("Unknown flag condition!");

        return false;
    }

    public BranchscriptParser.ConversationFragmentContext getCurrentFragment() {
        return this.currentConversation.conversationBody().conversationFragment(this.currentFragment);
    }

    private void advanceConversation() {
        if (this.currentFragment < this.currentConversation.conversationBody().conversationFragment().size() - 1) {
            this.currentFragment++;

            //if (getCurrentFragment().conversationLink() != null || getCurrentFragment().fragmentTrigger() != null)
            next();
        }
    }

    @Override
    public void notifyDialogue(String contents, List<BranchscriptParser.FragmentAnswerContext> answers) {
        for (BranchingStoryListener listener : branchingStoryListeners)
            listener.onDialogue(contents, answers);
    }

    @Override
    public void notifyTrigger(String name, List<String> parameters) {
        for (BranchingStoryListener listener : branchingStoryListeners)
            listener.onTrigger(name, parameters);
    }

    @Override
    public void notifyLink(BranchscriptParser.ConversationContext oldConversation, BranchscriptParser.ConversationContext newConversation) {
        for (BranchingStoryListener listener : branchingStoryListeners)
            listener.onLink(oldConversation, newConversation);
    }

    @Override
    public void addBranchingStoryListener(BranchingStoryListener listener) {
        this.branchingStoryListeners.add(listener);
    }

    @Override
    public void removeBranchingStoryListener(BranchingStoryListener listener) {
        this.branchingStoryListeners.remove(listener);
    }
}
