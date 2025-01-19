package calculator;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

import java.beans.EventHandler;
import java.util.Scanner;

public class SimpleCalculator extends Application {
		Text text1 = new Text();
		Text text2 = new Text();
		Button plus = new Button(" + ");
		Button minus = new Button(" - ");
		Button divide = new Button(" / ");
		Button multiply = new Button(" * ");
		Button calculate = new Button("calculate");
		Button result = new Button("display the result");
		
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Calculator +-/*");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));

        // StackPane layout = new StackPane();
 		Scene scene = new Scene(gridPane, 300,250);
 		primaryStage.setScene(scene);
 	
 		
        gridPane.setVgap(4); // Vertical space between buttons
        gridPane.setHgap(4); // Horizontal space between buttons
        int num1;
        int num2;
        gridPane.add(text1,1,1);
        gridPane.add(text2,1,2);
        gridPane.add(plus, 0, 0);
        gridPane.add(minus, 0,1);
        gridPane.add(divide, 1,0 );
        gridPane.add(multiply, 1, 1);
        gridPane.setStyle("-fx-background-color: #696969;");
        gridPane.setAlignment(Pos.CENTER); 
        plus.setPrefWidth(50);
        plus.setPrefHeight(50);
        minus.setPrefWidth(50);
        minus.setPrefHeight(50);
        divide.setPrefWidth(50);
        divide.setPrefHeight(50);
        multiply.setPrefWidth(50);
        multiply.setPrefHeight(50);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        plus.getStyleClass().add("button");


       // plus.setStyle("-fx-background-color: #FF6347; -fx-text-fill: black;");
       // minus.setStyle("-fx-background-color: #4682B4; -fx-text-fill: black;");
       // divide.setStyle("-fx-background-color: #FF6347; -fx-text-fill: black;");
        
    	primaryStage.show();
        
  
	}


}
