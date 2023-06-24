package com.example.path;

import javafx.application.Application;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane pane = new StackPane();
FlowPane 
        Circle circle = new Circle(100);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Rectangle rectangle = new Rectangle( 100, 100);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);


        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(1000));
        pathTransition.setPath(circle);
        pathTransition.setNode(rectangle);
        pathTransition.setOrientation(PathTransition.OrientationType.NONE);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(false);
        pathTransition.setRate(1);
        pathTransition.play();
ImageView imageView1 = new ImageView("image/cairo.jpg");
        Scene scene = new Scene(pane, 400, 600);
        scene.setOnMousePressed(e -> pathTransition.pause());
        scene.setOnMouseReleased(e -> pathTransition.play());
        primaryStage.setTitle("task1 javafx");
        primaryStage.setScene(scene );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}