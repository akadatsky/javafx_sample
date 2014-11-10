package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 700;
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Canvas canvas = new Canvas(WIDTH, HEIGHT);

        BorderPane group = new BorderPane();
        group.setCenter(canvas);

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

        gc = canvas.getGraphicsContext2D();

        draw();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(10, 10, 50, 50);
    }

}
