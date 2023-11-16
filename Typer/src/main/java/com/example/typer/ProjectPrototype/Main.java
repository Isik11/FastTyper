package com.example.typer.ProjectPrototype;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Typer Practice");
      primaryStage.getIcons().add(new Image("image/EZ.png"));
       primaryStage.setScene(new Scene(root,600,450));
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
