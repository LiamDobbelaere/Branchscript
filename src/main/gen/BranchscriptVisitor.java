// Generated from D:/GitHub/Branchscript/src/main/resources\Branchscript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BranchscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BranchscriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(BranchscriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversation(BranchscriptParser.ConversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversationPerson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversationPerson(BranchscriptParser.ConversationPersonContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversationId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversationId(BranchscriptParser.ConversationIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#triggerId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerId(BranchscriptParser.TriggerIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversationHeader(BranchscriptParser.ConversationHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversationBody(BranchscriptParser.ConversationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversationFragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversationFragment(BranchscriptParser.ConversationFragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conversationLink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversationLink(BranchscriptParser.ConversationLinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#linkCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkCondition(BranchscriptParser.LinkConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(BranchscriptParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#ifAndCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfAndCondition(BranchscriptParser.IfAndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#ifOrCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfOrCondition(BranchscriptParser.IfOrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conditionCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionCollection(BranchscriptParser.ConditionCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#flagCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagCondition(BranchscriptParser.FlagConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conditionTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionTrue(BranchscriptParser.ConditionTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conditionEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionEqual(BranchscriptParser.ConditionEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conditionGreater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionGreater(BranchscriptParser.ConditionGreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#conditionLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionLess(BranchscriptParser.ConditionLessContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#fragmentDialogue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentDialogue(BranchscriptParser.FragmentDialogueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#fragmentAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentAnswer(BranchscriptParser.FragmentAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#fragmentTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentTrigger(BranchscriptParser.FragmentTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#triggerOptionsCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOptionsCollection(BranchscriptParser.TriggerOptionsCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#setFlags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFlags(BranchscriptParser.SetFlagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#flagAssignmentCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagAssignmentCollection(BranchscriptParser.FlagAssignmentCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#flagAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagAssignment(BranchscriptParser.FlagAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#assignmentTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentTrue(BranchscriptParser.AssignmentTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#assignmentAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAssign(BranchscriptParser.AssignmentAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#assignmentIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentIncrement(BranchscriptParser.AssignmentIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#assignmentDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentDecrement(BranchscriptParser.AssignmentDecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BranchscriptParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(BranchscriptParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BranchscriptParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(BranchscriptParser.IntValueContext ctx);
}