package com.digaly.contact;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by tomdo on 16/12/2017.
 */
public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("views/BSEdit.fxml"));
        BorderPane pane = loader.load();

        Scene scene = new Scene(pane);
        stage.setTitle("BSEdit");
        //stage.getIcons().add(new Image("logo.png"));
        stage.setResizable(true);
        stage.setOnCloseRequest((e) -> Platform.exit());
        stage.sizeToScene();
        stage.setScene(scene);
        stage.show();
    }
}
