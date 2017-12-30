package com.digaly.branchscript.example;

import com.digaly.branchscript.grammar.BranchscriptParser;

import java.util.List;

public interface BranchingStoryListener {
    void onDialogue(String contents, List<BranchscriptParser.FragmentAnswerContext> answers);
    void onTrigger(String name, List<String> parameters);
    void onLink(BranchscriptParser.ConversationContext oldConversation, BranchscriptParser.ConversationContext newConversation);
}
