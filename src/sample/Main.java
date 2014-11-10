package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainGroup = new BorderPane();

        mainGroup.setTop(new Button("Button top"));
        mainGroup.setRight(new Button("Button right"));
        mainGroup.setBottom(new Button("Button bottom"));
        mainGroup.setLeft(new Button("Button left"));

        BorderPane subGroup = new BorderPane();
        subGroup.setTop(new Button("Button top subGroup"));
        subGroup.setRight(new Button("Button right subGroup"));
        subGroup.setBottom(new Button("Button bottom subGroup"));
        subGroup.setLeft(new Button("Button left subGroup"));
        subGroup.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));

        mainGroup.setCenter(subGroup);

        Scene scene = new Scene(mainGroup, 1200, 700);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
