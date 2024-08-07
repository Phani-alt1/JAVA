package YIPPEE;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class LESGO extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn2 = new Button();
        Button btn3=new Button();
        btn3.setText("Cause??");
        btn3.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		System.out.println("Too much watering kills the plant");
        	}
        });
        btn.setText("Click for her Full Name");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Shaik Uzhmaa Ada");
            }
        });
        btn.setPrefSize(200,200);
        btn2.setText("Click for the date she blocked me lol ;-;");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event2) {
                System.out.println("24 Feb 2024 Saturday 3pm");
            }
        });
        VBox vbox=new VBox(10);
        vbox.getChildren().addAll(btn,btn2,btn3);
        StackPane root = new StackPane();
        root.getChildren().add(vbox);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("I'm not gonna say it ;-;");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
