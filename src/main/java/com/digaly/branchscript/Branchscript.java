package com.digaly.branchscript;

import com.digaly.branchscript.grammar.BranchscriptLexer;
import com.digaly.branchscript.grammar.BranchscriptParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.File;
import java.io.IOException;
import java.util.BitSet;

public class Branchscript {
    public static BranchscriptParser.ScriptContext parse(String src){
        return parse(CharStreams.fromString(src));
    }

    public static BranchscriptParser.ScriptContext parse(File file){
        try {
            return parse(CharStreams.fromFileName(file.getAbsolutePath()));
        } catch (IOException ex) {
            throw new RuntimeException("Failed to read input file", ex);
        }
    }

    private static BranchscriptParser.ScriptContext parse(CharStream stream){
        return preParse(stream).script();
    }

    private static BranchscriptParser preParse(CharStream stream){
        BranchscriptLexer lexer = new BranchscriptLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BranchscriptParser parser = new BranchscriptParser(tokens);

        parser.addErrorListener(SYNTAX_ERROR_THROWER);

        return parser;
    }

    public static final ANTLRErrorListener SYNTAX_ERROR_THROWER = new ANTLRErrorListener() {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throw new RuntimeException("Line " + String.valueOf(line) + ":" + String.valueOf(charPositionInLine) + " " + msg);
        }

        @Override
        public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

        }

        @Override
        public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {

        }

        @Override
        public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

        }
    };
}
