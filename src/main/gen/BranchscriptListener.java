// Generated from D:/GitHub/Branchscript/src/main/resources\Branchscript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BranchscriptParser}.
 */
public interface BranchscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(BranchscriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(BranchscriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversation}.
	 * @param ctx the parse tree
	 */
	void enterConversation(BranchscriptParser.ConversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversation}.
	 * @param ctx the parse tree
	 */
	void exitConversation(BranchscriptParser.ConversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversationPerson}.
	 * @param ctx the parse tree
	 */
	void enterConversationPerson(BranchscriptParser.ConversationPersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversationPerson}.
	 * @param ctx the parse tree
	 */
	void exitConversationPerson(BranchscriptParser.ConversationPersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversationId}.
	 * @param ctx the parse tree
	 */
	void enterConversationId(BranchscriptParser.ConversationIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversationId}.
	 * @param ctx the parse tree
	 */
	void exitConversationId(BranchscriptParser.ConversationIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#triggerId}.
	 * @param ctx the parse tree
	 */
	void enterTriggerId(BranchscriptParser.TriggerIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#triggerId}.
	 * @param ctx the parse tree
	 */
	void exitTriggerId(BranchscriptParser.TriggerIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversationHeader}.
	 * @param ctx the parse tree
	 */
	void enterConversationHeader(BranchscriptParser.ConversationHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversationHeader}.
	 * @param ctx the parse tree
	 */
	void exitConversationHeader(BranchscriptParser.ConversationHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversationBody}.
	 * @param ctx the parse tree
	 */
	void enterConversationBody(BranchscriptParser.ConversationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversationBody}.
	 * @param ctx the parse tree
	 */
	void exitConversationBody(BranchscriptParser.ConversationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversationFragment}.
	 * @param ctx the parse tree
	 */
	void enterConversationFragment(BranchscriptParser.ConversationFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversationFragment}.
	 * @param ctx the parse tree
	 */
	void exitConversationFragment(BranchscriptParser.ConversationFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conversationLink}.
	 * @param ctx the parse tree
	 */
	void enterConversationLink(BranchscriptParser.ConversationLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conversationLink}.
	 * @param ctx the parse tree
	 */
	void exitConversationLink(BranchscriptParser.ConversationLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#linkCondition}.
	 * @param ctx the parse tree
	 */
	void enterLinkCondition(BranchscriptParser.LinkConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#linkCondition}.
	 * @param ctx the parse tree
	 */
	void exitLinkCondition(BranchscriptParser.LinkConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(BranchscriptParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(BranchscriptParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#ifAndCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfAndCondition(BranchscriptParser.IfAndConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#ifAndCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfAndCondition(BranchscriptParser.IfAndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#ifOrCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfOrCondition(BranchscriptParser.IfOrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#ifOrCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfOrCondition(BranchscriptParser.IfOrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conditionCollection}.
	 * @param ctx the parse tree
	 */
	void enterConditionCollection(BranchscriptParser.ConditionCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conditionCollection}.
	 * @param ctx the parse tree
	 */
	void exitConditionCollection(BranchscriptParser.ConditionCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#flagCondition}.
	 * @param ctx the parse tree
	 */
	void enterFlagCondition(BranchscriptParser.FlagConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#flagCondition}.
	 * @param ctx the parse tree
	 */
	void exitFlagCondition(BranchscriptParser.FlagConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conditionTrue}.
	 * @param ctx the parse tree
	 */
	void enterConditionTrue(BranchscriptParser.ConditionTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conditionTrue}.
	 * @param ctx the parse tree
	 */
	void exitConditionTrue(BranchscriptParser.ConditionTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conditionEqual}.
	 * @param ctx the parse tree
	 */
	void enterConditionEqual(BranchscriptParser.ConditionEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conditionEqual}.
	 * @param ctx the parse tree
	 */
	void exitConditionEqual(BranchscriptParser.ConditionEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conditionGreater}.
	 * @param ctx the parse tree
	 */
	void enterConditionGreater(BranchscriptParser.ConditionGreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conditionGreater}.
	 * @param ctx the parse tree
	 */
	void exitConditionGreater(BranchscriptParser.ConditionGreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#conditionLess}.
	 * @param ctx the parse tree
	 */
	void enterConditionLess(BranchscriptParser.ConditionLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#conditionLess}.
	 * @param ctx the parse tree
	 */
	void exitConditionLess(BranchscriptParser.ConditionLessContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#fragmentDialogue}.
	 * @param ctx the parse tree
	 */
	void enterFragmentDialogue(BranchscriptParser.FragmentDialogueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#fragmentDialogue}.
	 * @param ctx the parse tree
	 */
	void exitFragmentDialogue(BranchscriptParser.FragmentDialogueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#fragmentAnswer}.
	 * @param ctx the parse tree
	 */
	void enterFragmentAnswer(BranchscriptParser.FragmentAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#fragmentAnswer}.
	 * @param ctx the parse tree
	 */
	void exitFragmentAnswer(BranchscriptParser.FragmentAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#fragmentTrigger}.
	 * @param ctx the parse tree
	 */
	void enterFragmentTrigger(BranchscriptParser.FragmentTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#fragmentTrigger}.
	 * @param ctx the parse tree
	 */
	void exitFragmentTrigger(BranchscriptParser.FragmentTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#triggerOptionsCollection}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOptionsCollection(BranchscriptParser.TriggerOptionsCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#triggerOptionsCollection}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOptionsCollection(BranchscriptParser.TriggerOptionsCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#setFlags}.
	 * @param ctx the parse tree
	 */
	void enterSetFlags(BranchscriptParser.SetFlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#setFlags}.
	 * @param ctx the parse tree
	 */
	void exitSetFlags(BranchscriptParser.SetFlagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#flagAssignmentCollection}.
	 * @param ctx the parse tree
	 */
	void enterFlagAssignmentCollection(BranchscriptParser.FlagAssignmentCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#flagAssignmentCollection}.
	 * @param ctx the parse tree
	 */
	void exitFlagAssignmentCollection(BranchscriptParser.FlagAssignmentCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#flagAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFlagAssignment(BranchscriptParser.FlagAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#flagAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFlagAssignment(BranchscriptParser.FlagAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#assignmentTrue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentTrue(BranchscriptParser.AssignmentTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#assignmentTrue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentTrue(BranchscriptParser.AssignmentTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#assignmentAssign}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAssign(BranchscriptParser.AssignmentAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#assignmentAssign}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAssign(BranchscriptParser.AssignmentAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#assignmentIncrement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentIncrement(BranchscriptParser.AssignmentIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#assignmentIncrement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentIncrement(BranchscriptParser.AssignmentIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#assignmentDecrement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDecrement(BranchscriptParser.AssignmentDecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#assignmentDecrement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDecrement(BranchscriptParser.AssignmentDecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BranchscriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BranchscriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(BranchscriptParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(BranchscriptParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BranchscriptParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(BranchscriptParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BranchscriptParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(BranchscriptParser.IntValueContext ctx);
}