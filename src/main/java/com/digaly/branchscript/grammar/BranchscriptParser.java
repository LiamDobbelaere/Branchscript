// Generated from D:/GitHub/Contact/src/main/resources\Branchscript.g4 by ANTLR 4.7
package com.digaly.branchscript.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BranchscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_HEADER=1, CLOSE_HEADER=2, HEADER_SEPARATOR=3, OPEN_ANSWER=4, OPEN_LINK=5, 
		OPEN_COLLECTION=6, CLOSE_COLLECTION=7, COLLECTION_DELIMITER=8, BOOL_TRUE=9, 
		BOOL_FALSE=10, INCREMENT=11, DECREMENT=12, ASSIGN=13, EQUAL=14, GREATER=15, 
		LESS=16, TRIGGER_KEYWORD=17, OPTIONS_KEYWORD=18, SETFLAGS_KEYWORD=19, 
		IF_KEYWORD=20, IF_AND_KEYWORD=21, IF_OR_KEYWORD=22, ID=23, NUMBER=24, 
		STRING=25, WS=26;
	public static final int
		RULE_script = 0, RULE_conversation = 1, RULE_conversationPerson = 2, RULE_conversationId = 3, 
		RULE_triggerId = 4, RULE_conversationHeader = 5, RULE_conversationBody = 6, 
		RULE_conversationFragment = 7, RULE_conversationLink = 8, RULE_linkCondition = 9, 
		RULE_ifCondition = 10, RULE_ifAndCondition = 11, RULE_ifOrCondition = 12, 
		RULE_conditionCollection = 13, RULE_flagCondition = 14, RULE_conditionTrue = 15, 
		RULE_conditionEqual = 16, RULE_conditionGreater = 17, RULE_conditionLess = 18, 
		RULE_fragmentDialogue = 19, RULE_fragmentAnswer = 20, RULE_fragmentTrigger = 21, 
		RULE_triggerOptionsCollection = 22, RULE_setFlags = 23, RULE_flagAssignmentCollection = 24, 
		RULE_flagAssignment = 25, RULE_assignmentTrue = 26, RULE_assignmentAssign = 27, 
		RULE_assignmentIncrement = 28, RULE_assignmentDecrement = 29, RULE_value = 30, 
		RULE_boolValue = 31, RULE_intValue = 32;
	public static final String[] ruleNames = {
		"script", "conversation", "conversationPerson", "conversationId", "triggerId", 
		"conversationHeader", "conversationBody", "conversationFragment", "conversationLink", 
		"linkCondition", "ifCondition", "ifAndCondition", "ifOrCondition", "conditionCollection", 
		"flagCondition", "conditionTrue", "conditionEqual", "conditionGreater", 
		"conditionLess", "fragmentDialogue", "fragmentAnswer", "fragmentTrigger", 
		"triggerOptionsCollection", "setFlags", "flagAssignmentCollection", "flagAssignment", 
		"assignmentTrue", "assignmentAssign", "assignmentIncrement", "assignmentDecrement", 
		"value", "boolValue", "intValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'/'", "'-'", "'->'", "'('", "')'", "','", "'true'", 
		"'false'", "'++'", "'--'", "'='", "'=='", "'>'", "'<'", "'TRIGGER'", "'OPTIONS'", 
		"'SET'", "'IF'", "'IF_AND'", "'IF_OR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_HEADER", "CLOSE_HEADER", "HEADER_SEPARATOR", "OPEN_ANSWER", 
		"OPEN_LINK", "OPEN_COLLECTION", "CLOSE_COLLECTION", "COLLECTION_DELIMITER", 
		"BOOL_TRUE", "BOOL_FALSE", "INCREMENT", "DECREMENT", "ASSIGN", "EQUAL", 
		"GREATER", "LESS", "TRIGGER_KEYWORD", "OPTIONS_KEYWORD", "SETFLAGS_KEYWORD", 
		"IF_KEYWORD", "IF_AND_KEYWORD", "IF_OR_KEYWORD", "ID", "NUMBER", "STRING", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Branchscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BranchscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<ConversationContext> conversation() {
			return getRuleContexts(ConversationContext.class);
		}
		public ConversationContext conversation(int i) {
			return getRuleContext(ConversationContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				conversation();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_HEADER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationContext extends ParserRuleContext {
		public ConversationHeaderContext conversationHeader() {
			return getRuleContext(ConversationHeaderContext.class,0);
		}
		public ConversationBodyContext conversationBody() {
			return getRuleContext(ConversationBodyContext.class,0);
		}
		public ConversationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversation; }
	}

	public final ConversationContext conversation() throws RecognitionException {
		ConversationContext _localctx = new ConversationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_conversation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			conversationHeader();
			setState(72);
			conversationBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationPersonContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public ConversationPersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversationPerson; }
	}

	public final ConversationPersonContext conversationPerson() throws RecognitionException {
		ConversationPersonContext _localctx = new ConversationPersonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conversationPerson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public ConversationIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversationId; }
	}

	public final ConversationIdContext conversationId() throws RecognitionException {
		ConversationIdContext _localctx = new ConversationIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conversationId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggerIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TriggerIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerId; }
	}

	public final TriggerIdContext triggerId() throws RecognitionException {
		TriggerIdContext _localctx = new TriggerIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_triggerId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationHeaderContext extends ParserRuleContext {
		public TerminalNode OPEN_HEADER() { return getToken(BranchscriptParser.OPEN_HEADER, 0); }
		public ConversationPersonContext conversationPerson() {
			return getRuleContext(ConversationPersonContext.class,0);
		}
		public TerminalNode HEADER_SEPARATOR() { return getToken(BranchscriptParser.HEADER_SEPARATOR, 0); }
		public ConversationIdContext conversationId() {
			return getRuleContext(ConversationIdContext.class,0);
		}
		public TerminalNode CLOSE_HEADER() { return getToken(BranchscriptParser.CLOSE_HEADER, 0); }
		public SetFlagsContext setFlags() {
			return getRuleContext(SetFlagsContext.class,0);
		}
		public ConversationHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversationHeader; }
	}

	public final ConversationHeaderContext conversationHeader() throws RecognitionException {
		ConversationHeaderContext _localctx = new ConversationHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conversationHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(OPEN_HEADER);
			setState(81);
			conversationPerson();
			setState(82);
			match(HEADER_SEPARATOR);
			setState(83);
			conversationId();
			setState(84);
			match(CLOSE_HEADER);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETFLAGS_KEYWORD) {
				{
				setState(85);
				setFlags();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationBodyContext extends ParserRuleContext {
		public List<ConversationFragmentContext> conversationFragment() {
			return getRuleContexts(ConversationFragmentContext.class);
		}
		public ConversationFragmentContext conversationFragment(int i) {
			return getRuleContext(ConversationFragmentContext.class,i);
		}
		public ConversationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversationBody; }
	}

	public final ConversationBodyContext conversationBody() throws RecognitionException {
		ConversationBodyContext _localctx = new ConversationBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conversationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				conversationFragment();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_LINK) | (1L << TRIGGER_KEYWORD) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationFragmentContext extends ParserRuleContext {
		public FragmentDialogueContext fragmentDialogue() {
			return getRuleContext(FragmentDialogueContext.class,0);
		}
		public FragmentTriggerContext fragmentTrigger() {
			return getRuleContext(FragmentTriggerContext.class,0);
		}
		public ConversationLinkContext conversationLink() {
			return getRuleContext(ConversationLinkContext.class,0);
		}
		public ConversationFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversationFragment; }
	}

	public final ConversationFragmentContext conversationFragment() throws RecognitionException {
		ConversationFragmentContext _localctx = new ConversationFragmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conversationFragment);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				fragmentDialogue();
				}
				break;
			case TRIGGER_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				fragmentTrigger();
				}
				break;
			case OPEN_LINK:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				conversationLink();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversationLinkContext extends ParserRuleContext {
		public TerminalNode OPEN_LINK() { return getToken(BranchscriptParser.OPEN_LINK, 0); }
		public ConversationIdContext conversationId() {
			return getRuleContext(ConversationIdContext.class,0);
		}
		public LinkConditionContext linkCondition() {
			return getRuleContext(LinkConditionContext.class,0);
		}
		public ConversationLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversationLink; }
	}

	public final ConversationLinkContext conversationLink() throws RecognitionException {
		ConversationLinkContext _localctx = new ConversationLinkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conversationLink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(OPEN_LINK);
			setState(99);
			conversationId();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_KEYWORD) | (1L << IF_AND_KEYWORD) | (1L << IF_OR_KEYWORD))) != 0)) {
				{
				setState(100);
				linkCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkConditionContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public IfAndConditionContext ifAndCondition() {
			return getRuleContext(IfAndConditionContext.class,0);
		}
		public IfOrConditionContext ifOrCondition() {
			return getRuleContext(IfOrConditionContext.class,0);
		}
		public LinkConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkCondition; }
	}

	public final LinkConditionContext linkCondition() throws RecognitionException {
		LinkConditionContext _localctx = new LinkConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_linkCondition);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				ifCondition();
				}
				break;
			case IF_AND_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				ifAndCondition();
				}
				break;
			case IF_OR_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				ifOrCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(BranchscriptParser.IF_KEYWORD, 0); }
		public FlagConditionContext flagCondition() {
			return getRuleContext(FlagConditionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IF_KEYWORD);
			setState(109);
			flagCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfAndConditionContext extends ParserRuleContext {
		public TerminalNode IF_AND_KEYWORD() { return getToken(BranchscriptParser.IF_AND_KEYWORD, 0); }
		public ConditionCollectionContext conditionCollection() {
			return getRuleContext(ConditionCollectionContext.class,0);
		}
		public IfAndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifAndCondition; }
	}

	public final IfAndConditionContext ifAndCondition() throws RecognitionException {
		IfAndConditionContext _localctx = new IfAndConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifAndCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IF_AND_KEYWORD);
			setState(112);
			conditionCollection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfOrConditionContext extends ParserRuleContext {
		public TerminalNode IF_OR_KEYWORD() { return getToken(BranchscriptParser.IF_OR_KEYWORD, 0); }
		public ConditionCollectionContext conditionCollection() {
			return getRuleContext(ConditionCollectionContext.class,0);
		}
		public IfOrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifOrCondition; }
	}

	public final IfOrConditionContext ifOrCondition() throws RecognitionException {
		IfOrConditionContext _localctx = new IfOrConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifOrCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF_OR_KEYWORD);
			setState(115);
			conditionCollection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionCollectionContext extends ParserRuleContext {
		public TerminalNode OPEN_COLLECTION() { return getToken(BranchscriptParser.OPEN_COLLECTION, 0); }
		public List<FlagConditionContext> flagCondition() {
			return getRuleContexts(FlagConditionContext.class);
		}
		public FlagConditionContext flagCondition(int i) {
			return getRuleContext(FlagConditionContext.class,i);
		}
		public TerminalNode CLOSE_COLLECTION() { return getToken(BranchscriptParser.CLOSE_COLLECTION, 0); }
		public List<TerminalNode> COLLECTION_DELIMITER() { return getTokens(BranchscriptParser.COLLECTION_DELIMITER); }
		public TerminalNode COLLECTION_DELIMITER(int i) {
			return getToken(BranchscriptParser.COLLECTION_DELIMITER, i);
		}
		public ConditionCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionCollection; }
	}

	public final ConditionCollectionContext conditionCollection() throws RecognitionException {
		ConditionCollectionContext _localctx = new ConditionCollectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(OPEN_COLLECTION);
			setState(118);
			flagCondition();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLLECTION_DELIMITER) {
				{
				{
				setState(119);
				match(COLLECTION_DELIMITER);
				setState(120);
				flagCondition();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(CLOSE_COLLECTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlagConditionContext extends ParserRuleContext {
		public ConditionTrueContext conditionTrue() {
			return getRuleContext(ConditionTrueContext.class,0);
		}
		public ConditionEqualContext conditionEqual() {
			return getRuleContext(ConditionEqualContext.class,0);
		}
		public ConditionGreaterContext conditionGreater() {
			return getRuleContext(ConditionGreaterContext.class,0);
		}
		public ConditionLessContext conditionLess() {
			return getRuleContext(ConditionLessContext.class,0);
		}
		public FlagConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagCondition; }
	}

	public final FlagConditionContext flagCondition() throws RecognitionException {
		FlagConditionContext _localctx = new FlagConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_flagCondition);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				conditionTrue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				conditionEqual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				conditionGreater();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				conditionLess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionTrueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public ConditionTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionTrue; }
	}

	public final ConditionTrueContext conditionTrue() throws RecognitionException {
		ConditionTrueContext _localctx = new ConditionTrueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionEqualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(BranchscriptParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionEqual; }
	}

	public final ConditionEqualContext conditionEqual() throws RecognitionException {
		ConditionEqualContext _localctx = new ConditionEqualContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(137);
			match(EQUAL);
			setState(138);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionGreaterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TerminalNode GREATER() { return getToken(BranchscriptParser.GREATER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionGreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionGreater; }
	}

	public final ConditionGreaterContext conditionGreater() throws RecognitionException {
		ConditionGreaterContext _localctx = new ConditionGreaterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditionGreater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(GREATER);
			setState(142);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionLessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TerminalNode LESS() { return getToken(BranchscriptParser.LESS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionLessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionLess; }
	}

	public final ConditionLessContext conditionLess() throws RecognitionException {
		ConditionLessContext _localctx = new ConditionLessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditionLess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			match(LESS);
			setState(146);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragmentDialogueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BranchscriptParser.STRING, 0); }
		public SetFlagsContext setFlags() {
			return getRuleContext(SetFlagsContext.class,0);
		}
		public List<FragmentAnswerContext> fragmentAnswer() {
			return getRuleContexts(FragmentAnswerContext.class);
		}
		public FragmentAnswerContext fragmentAnswer(int i) {
			return getRuleContext(FragmentAnswerContext.class,i);
		}
		public FragmentDialogueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentDialogue; }
	}

	public final FragmentDialogueContext fragmentDialogue() throws RecognitionException {
		FragmentDialogueContext _localctx = new FragmentDialogueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fragmentDialogue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(STRING);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETFLAGS_KEYWORD) {
				{
				setState(149);
				setFlags();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_ANSWER) {
				{
				{
				setState(152);
				fragmentAnswer();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragmentAnswerContext extends ParserRuleContext {
		public TerminalNode OPEN_ANSWER() { return getToken(BranchscriptParser.OPEN_ANSWER, 0); }
		public TerminalNode STRING() { return getToken(BranchscriptParser.STRING, 0); }
		public SetFlagsContext setFlags() {
			return getRuleContext(SetFlagsContext.class,0);
		}
		public FragmentAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentAnswer; }
	}

	public final FragmentAnswerContext fragmentAnswer() throws RecognitionException {
		FragmentAnswerContext _localctx = new FragmentAnswerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fragmentAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(OPEN_ANSWER);
			setState(159);
			match(STRING);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETFLAGS_KEYWORD) {
				{
				setState(160);
				setFlags();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragmentTriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER_KEYWORD() { return getToken(BranchscriptParser.TRIGGER_KEYWORD, 0); }
		public TriggerIdContext triggerId() {
			return getRuleContext(TriggerIdContext.class,0);
		}
		public TerminalNode OPTIONS_KEYWORD() { return getToken(BranchscriptParser.OPTIONS_KEYWORD, 0); }
		public TriggerOptionsCollectionContext triggerOptionsCollection() {
			return getRuleContext(TriggerOptionsCollectionContext.class,0);
		}
		public FragmentTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentTrigger; }
	}

	public final FragmentTriggerContext fragmentTrigger() throws RecognitionException {
		FragmentTriggerContext _localctx = new FragmentTriggerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fragmentTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TRIGGER_KEYWORD);
			setState(164);
			triggerId();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS_KEYWORD) {
				{
				setState(165);
				match(OPTIONS_KEYWORD);
				setState(166);
				triggerOptionsCollection();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggerOptionsCollectionContext extends ParserRuleContext {
		public TerminalNode OPEN_COLLECTION() { return getToken(BranchscriptParser.OPEN_COLLECTION, 0); }
		public List<TerminalNode> STRING() { return getTokens(BranchscriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BranchscriptParser.STRING, i);
		}
		public TerminalNode CLOSE_COLLECTION() { return getToken(BranchscriptParser.CLOSE_COLLECTION, 0); }
		public List<TerminalNode> COLLECTION_DELIMITER() { return getTokens(BranchscriptParser.COLLECTION_DELIMITER); }
		public TerminalNode COLLECTION_DELIMITER(int i) {
			return getToken(BranchscriptParser.COLLECTION_DELIMITER, i);
		}
		public TriggerOptionsCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerOptionsCollection; }
	}

	public final TriggerOptionsCollectionContext triggerOptionsCollection() throws RecognitionException {
		TriggerOptionsCollectionContext _localctx = new TriggerOptionsCollectionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_triggerOptionsCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(OPEN_COLLECTION);
			setState(170);
			match(STRING);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLLECTION_DELIMITER) {
				{
				{
				setState(171);
				match(COLLECTION_DELIMITER);
				setState(172);
				match(STRING);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(CLOSE_COLLECTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetFlagsContext extends ParserRuleContext {
		public TerminalNode SETFLAGS_KEYWORD() { return getToken(BranchscriptParser.SETFLAGS_KEYWORD, 0); }
		public FlagAssignmentCollectionContext flagAssignmentCollection() {
			return getRuleContext(FlagAssignmentCollectionContext.class,0);
		}
		public SetFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFlags; }
	}

	public final SetFlagsContext setFlags() throws RecognitionException {
		SetFlagsContext _localctx = new SetFlagsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setFlags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(SETFLAGS_KEYWORD);
			setState(181);
			flagAssignmentCollection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlagAssignmentCollectionContext extends ParserRuleContext {
		public TerminalNode OPEN_COLLECTION() { return getToken(BranchscriptParser.OPEN_COLLECTION, 0); }
		public List<FlagAssignmentContext> flagAssignment() {
			return getRuleContexts(FlagAssignmentContext.class);
		}
		public FlagAssignmentContext flagAssignment(int i) {
			return getRuleContext(FlagAssignmentContext.class,i);
		}
		public TerminalNode CLOSE_COLLECTION() { return getToken(BranchscriptParser.CLOSE_COLLECTION, 0); }
		public List<TerminalNode> COLLECTION_DELIMITER() { return getTokens(BranchscriptParser.COLLECTION_DELIMITER); }
		public TerminalNode COLLECTION_DELIMITER(int i) {
			return getToken(BranchscriptParser.COLLECTION_DELIMITER, i);
		}
		public FlagAssignmentCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagAssignmentCollection; }
	}

	public final FlagAssignmentCollectionContext flagAssignmentCollection() throws RecognitionException {
		FlagAssignmentCollectionContext _localctx = new FlagAssignmentCollectionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_flagAssignmentCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OPEN_COLLECTION);
			setState(184);
			flagAssignment();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLLECTION_DELIMITER) {
				{
				{
				setState(185);
				match(COLLECTION_DELIMITER);
				setState(186);
				flagAssignment();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(CLOSE_COLLECTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlagAssignmentContext extends ParserRuleContext {
		public AssignmentTrueContext assignmentTrue() {
			return getRuleContext(AssignmentTrueContext.class,0);
		}
		public AssignmentAssignContext assignmentAssign() {
			return getRuleContext(AssignmentAssignContext.class,0);
		}
		public AssignmentIncrementContext assignmentIncrement() {
			return getRuleContext(AssignmentIncrementContext.class,0);
		}
		public AssignmentDecrementContext assignmentDecrement() {
			return getRuleContext(AssignmentDecrementContext.class,0);
		}
		public FlagAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagAssignment; }
	}

	public final FlagAssignmentContext flagAssignment() throws RecognitionException {
		FlagAssignmentContext _localctx = new FlagAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_flagAssignment);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				assignmentTrue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				assignmentAssign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				assignmentIncrement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				assignmentDecrement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentTrueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public AssignmentTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentTrue; }
	}

	public final AssignmentTrueContext assignmentTrue() throws RecognitionException {
		AssignmentTrueContext _localctx = new AssignmentTrueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentAssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BranchscriptParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentAssign; }
	}

	public final AssignmentAssignContext assignmentAssign() throws RecognitionException {
		AssignmentAssignContext _localctx = new AssignmentAssignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
			setState(203);
			match(ASSIGN);
			setState(204);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentIncrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(BranchscriptParser.INCREMENT, 0); }
		public AssignmentIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentIncrement; }
	}

	public final AssignmentIncrementContext assignmentIncrement() throws RecognitionException {
		AssignmentIncrementContext _localctx = new AssignmentIncrementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignmentIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
			setState(207);
			match(INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentDecrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BranchscriptParser.ID, 0); }
		public TerminalNode DECREMENT() { return getToken(BranchscriptParser.DECREMENT, 0); }
		public AssignmentDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDecrement; }
	}

	public final AssignmentDecrementContext assignmentDecrement() throws RecognitionException {
		AssignmentDecrementContext _localctx = new AssignmentDecrementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(210);
			match(DECREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
			case BOOL_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				boolValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				intValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode BOOL_TRUE() { return getToken(BranchscriptParser.BOOL_TRUE, 0); }
		public TerminalNode BOOL_FALSE() { return getToken(BranchscriptParser.BOOL_FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==BOOL_TRUE || _la==BOOL_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BranchscriptParser.NUMBER, 0); }
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_intValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\6\b\\\n\b\r\b\16\b]\3\t\3\t\3\t"+
		"\5\tc\n\t\3\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17|\n\17\f\17\16\17\177"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0099"+
		"\n\25\3\25\7\25\u009c\n\25\f\25\16\25\u009f\13\25\3\26\3\26\3\26\5\26"+
		"\u00a4\n\26\3\27\3\27\3\27\3\27\5\27\u00aa\n\27\3\30\3\30\3\30\3\30\7"+
		"\30\u00b0\n\30\f\30\16\30\u00b3\13\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\7\32\u00be\n\32\f\32\16\32\u00c1\13\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\5\33\u00c9\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \5 \u00d9\n \3!\3!\3\"\3\"\3\"\2\2#\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\3\3\2\13"+
		"\f\2\u00d3\2E\3\2\2\2\4I\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fR\3"+
		"\2\2\2\16[\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24l\3\2\2\2\26n\3\2\2\2\30"+
		"q\3\2\2\2\32t\3\2\2\2\34w\3\2\2\2\36\u0086\3\2\2\2 \u0088\3\2\2\2\"\u008a"+
		"\3\2\2\2$\u008e\3\2\2\2&\u0092\3\2\2\2(\u0096\3\2\2\2*\u00a0\3\2\2\2,"+
		"\u00a5\3\2\2\2.\u00ab\3\2\2\2\60\u00b6\3\2\2\2\62\u00b9\3\2\2\2\64\u00c8"+
		"\3\2\2\2\66\u00ca\3\2\2\28\u00cc\3\2\2\2:\u00d0\3\2\2\2<\u00d3\3\2\2\2"+
		">\u00d8\3\2\2\2@\u00da\3\2\2\2B\u00dc\3\2\2\2DF\5\4\3\2ED\3\2\2\2FG\3"+
		"\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IJ\5\f\7\2JK\5\16\b\2K\5\3\2\2\2"+
		"LM\7\31\2\2M\7\3\2\2\2NO\7\31\2\2O\t\3\2\2\2PQ\7\31\2\2Q\13\3\2\2\2RS"+
		"\7\3\2\2ST\5\6\4\2TU\7\5\2\2UV\5\b\5\2VX\7\4\2\2WY\5\60\31\2XW\3\2\2\2"+
		"XY\3\2\2\2Y\r\3\2\2\2Z\\\5\20\t\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^\17\3\2\2\2_c\5(\25\2`c\5,\27\2ac\5\22\n\2b_\3\2\2\2b`\3\2\2\2ba"+
		"\3\2\2\2c\21\3\2\2\2de\7\7\2\2eg\5\b\5\2fh\5\24\13\2gf\3\2\2\2gh\3\2\2"+
		"\2h\23\3\2\2\2im\5\26\f\2jm\5\30\r\2km\5\32\16\2li\3\2\2\2lj\3\2\2\2l"+
		"k\3\2\2\2m\25\3\2\2\2no\7\26\2\2op\5\36\20\2p\27\3\2\2\2qr\7\27\2\2rs"+
		"\5\34\17\2s\31\3\2\2\2tu\7\30\2\2uv\5\34\17\2v\33\3\2\2\2wx\7\b\2\2x}"+
		"\5\36\20\2yz\7\n\2\2z|\5\36\20\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\t\2\2\u0081\35\3\2\2"+
		"\2\u0082\u0087\5 \21\2\u0083\u0087\5\"\22\2\u0084\u0087\5$\23\2\u0085"+
		"\u0087\5&\24\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\37\3\2\2\2\u0088\u0089\7\31\2\2\u0089!"+
		"\3\2\2\2\u008a\u008b\7\31\2\2\u008b\u008c\7\20\2\2\u008c\u008d\5> \2\u008d"+
		"#\3\2\2\2\u008e\u008f\7\31\2\2\u008f\u0090\7\21\2\2\u0090\u0091\5> \2"+
		"\u0091%\3\2\2\2\u0092\u0093\7\31\2\2\u0093\u0094\7\22\2\2\u0094\u0095"+
		"\5> \2\u0095\'\3\2\2\2\u0096\u0098\7\33\2\2\u0097\u0099\5\60\31\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u009c\5*"+
		"\26\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e)\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\6\2\2"+
		"\u00a1\u00a3\7\33\2\2\u00a2\u00a4\5\60\31\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4+\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a9\5\n\6\2"+
		"\u00a7\u00a8\7\24\2\2\u00a8\u00aa\5.\30\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa-\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00b1\7\33\2\2\u00ad"+
		"\u00ae\7\n\2\2\u00ae\u00b0\7\33\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5/\3\2\2\2\u00b6\u00b7\7\25\2\2"+
		"\u00b7\u00b8\5\62\32\2\u00b8\61\3\2\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bf"+
		"\5\64\33\2\u00bb\u00bc\7\n\2\2\u00bc\u00be\5\64\33\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\63\3\2\2\2\u00c4"+
		"\u00c9\5\66\34\2\u00c5\u00c9\58\35\2\u00c6\u00c9\5:\36\2\u00c7\u00c9\5"+
		"<\37\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\65\3\2\2\2\u00ca\u00cb\7\31\2\2\u00cb\67\3\2\2\2"+
		"\u00cc\u00cd\7\31\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\5> \2\u00cf9\3"+
		"\2\2\2\u00d0\u00d1\7\31\2\2\u00d1\u00d2\7\r\2\2\u00d2;\3\2\2\2\u00d3\u00d4"+
		"\7\31\2\2\u00d4\u00d5\7\16\2\2\u00d5=\3\2\2\2\u00d6\u00d9\5@!\2\u00d7"+
		"\u00d9\5B\"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9?\3\2\2\2\u00da"+
		"\u00db\t\2\2\2\u00dbA\3\2\2\2\u00dc\u00dd\7\32\2\2\u00ddC\3\2\2\2\22G"+
		"X]bgl}\u0086\u0098\u009d\u00a3\u00a9\u00b1\u00bf\u00c8\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}