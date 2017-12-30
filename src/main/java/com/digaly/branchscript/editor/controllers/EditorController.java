package com.digaly.branchscript.editor.controllers;

import com.digaly.branchscript.Branchscript;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditorController {
    public CodeArea codeArea;

    private static final String[] KEYWORDS = new String[]{
            "SET", "TRIGGER", "IF", "IF_AND", "IF_OR", "OPTIONS"
    };

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String CONVERSATION_PATTERN = "\\[([^\"\\\\]|\\\\.)*\\]";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String LINK_PATTERN = "->";

    private static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<CONVERSATION>" + CONVERSATION_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<LINK>" + LINK_PATTERN + ")"
    );
    public Label errorLabel;

    private Stack<Integer> previousCarets;

    public void initialize() {
        previousCarets = new Stack<>();

        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved()))
                .subscribe(change -> {
                    codeArea.setStyleSpans(0, computeHighlighting(codeArea.getText()));
                    errorLabel.setText("");

                    try {
                        Branchscript.parse(codeArea.getText());
                    } catch (RuntimeException e) {
                        errorLabel.setText(e.getMessage());
                    }
                });

        codeArea.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.F2) {
                //String convo_id = codeArea.getSelectedText();

                int startPos = codeArea.getCaretPosition();
                int endPos = startPos;

                startPos = Math.min(codeArea.getText().length() - 1, Math.max(0, startPos));
                endPos = Math.min(codeArea.getText().length() - 1, Math.max(0, endPos));

                char c = codeArea.getText().charAt(startPos);

                while (c != ' ' && c != '\r' && c != '\n' && startPos > 0) {
                    startPos--;
                    c = codeArea.getText().charAt(startPos);
                }

                c = codeArea.getText().charAt(endPos);

                while (c != ' ' && c != '\r' && c != '\n' && endPos < codeArea.getText().length() - 1) {
                    endPos++;
                    c = codeArea.getText().charAt(endPos);
                }

                String word = codeArea.getText().substring(startPos, endPos + 1);
                word = word.trim();

                if (!word.isEmpty()) {
                    System.out.println(word);
                    int index = codeArea.getText().indexOf("/" + word + "]");
                    if (index != -1) {
                        previousCarets.push(codeArea.getCaretPosition());
                        codeArea.moveTo(index);
                        codeArea.requestFollowCaret();
                    }
                }
            }

            if (event.getCode() == KeyCode.F1) {
                if (previousCarets.size() > 0) {
                    codeArea.moveTo(previousCarets.pop());
                    codeArea.requestFollowCaret();
                }
            }
        });
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while (matcher.find()) {
            String styleClass = matcher.group("KEYWORD") != null ? "keyword" : "";
            styleClass = matcher.group("PAREN") != null ? "paren" : styleClass;
            styleClass = matcher.group("CONVERSATION") != null ? "conversation" : styleClass;
            styleClass = matcher.group("STRING") != null ? "string" : styleClass;
            styleClass = matcher.group("LINK") != null ? "link" : styleClass;

            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);

        return spansBuilder.create();
    }
}
