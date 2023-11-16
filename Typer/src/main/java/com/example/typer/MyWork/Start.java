package com.example.typer.MyWork;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalTime;

public class Start extends Application {
private TextArea textArea;
private Label typingSpeedLabel;
private Timeline timeline;

private Label accuracyLabel;

    public void start(Stage primaryStage){
         textArea = new TextArea();
         textArea.setEditable(false);
         typingSpeedLabel = new Label("0 WPM");
        accuracyLabel = new Label("Accuracy");
        Button button  = new Button("Start");
        button.setOnAction(e ->{
            textArea.setEditable(true);
            LocalTime startTime = LocalTime.now();


            textArea.setOnKeyTyped(keyEvent -> {
                LocalTime endTime = LocalTime.now();
                long elapsedTime = startTime.until(endTime,java.time.temporal.ChronoUnit.MILLIS);
                double typingSpeed = (int) ((textArea.getText().length() / 5 )  / (elapsedTime / 1000) * 60);
                typingSpeedLabel.setText("Speed is: " + typingSpeed + " WPM");


            });
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(textArea,typingSpeedLabel,button);

  Scene scene = new Scene(layout,400,300);

  primaryStage.setTitle("Typing Speed Analyzer");
  primaryStage.setScene(scene);
  primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }

}
