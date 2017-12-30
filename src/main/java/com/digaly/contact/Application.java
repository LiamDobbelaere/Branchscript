package com.digaly.contact;

import com.digaly.branchscript.Branchscript;
import com.digaly.branchscript.grammar.BranchscriptParser;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tomdo on 16/12/2017.
 */
public class Application extends javafx.application.Application implements BranchingStoryListener {
    private BranchingStory branchingStory;

    @Override
    public void start(Stage stage) throws Exception {
        /*FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("views/BSEdit.fxml"));
        BorderPane pane = loader.load();

        Scene scene = new Scene(pane);
        stage.setTitle("BSEdit");
        //stage.getIcons().add(new Image("logo.png"));
        stage.setResizable(true);
        stage.setOnCloseRequest((e) -> Platform.exit());
        stage.sizeToScene();
        stage.setScene(scene);
        stage.show();*/

        this.branchingStory = new BranchingStory(Branchscript.parse(new File("src/main/resources/example.branch")));
        this.branchingStory.addBranchingStoryListener(this);

        Scanner scanner = new Scanner(System.in);

        this.branchingStory.next();

        while (scanner.hasNextLine()) {
            String inp = scanner.nextLine();

            if (inp.length() > 0) {
                int choice = Integer.parseInt(inp);
                this.branchingStory.setChosenAnswer(branchingStory.getCurrentFragment().fragmentDialogue().fragmentAnswer(choice));
            }

            this.branchingStory.next();
        }

    }

    @Override
    public void onDialogue(String contents, List<BranchscriptParser.FragmentAnswerContext> answers) {
        System.out.println(contents);

        if (answers != null) {
            for (int i = 0; i < answers.size(); i++) {
                System.out.println("[" + String.valueOf(i) + "] " + answers.get(i).STRING().getText());
            }
        }
    }

    @Override
    public void onTrigger(String name, List<String> parameters) {
        System.out.println("[Info] Triggered " + name);
    }

    @Override
    public void onLink(BranchscriptParser.ConversationContext oldConversation, BranchscriptParser.ConversationContext newConversation) {
        System.out.println("[Info] changed to " + newConversation.conversationHeader().getText());
    }
}
