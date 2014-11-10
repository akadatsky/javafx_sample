package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Canvas canvas = new Canvas(1200, 700);

        BorderPane group = new BorderPane();
        group.setCenter(canvas);

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
