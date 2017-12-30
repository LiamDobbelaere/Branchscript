package com.digaly.branchscript.example;

import com.digaly.branchscript.grammar.BranchscriptParser;

import java.util.List;

public interface BranchingStoryNotifier {
    void notifyDialogue(String contents, List<BranchscriptParser.FragmentAnswerContext> answers);
    void notifyTrigger(String name, List<String> parameters);
    void notifyLink(BranchscriptParser.ConversationContext oldConversation, BranchscriptParser.ConversationContext newConversation);
    void addBranchingStoryListener(BranchingStoryListener listener);
    void removeBranchingStoryListener(BranchingStoryListener listener);
}
