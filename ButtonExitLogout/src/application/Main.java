package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			//primaryStage.setOnCloseRequest(event -> logout(primaryStage));
			// close desek te kapanıyor
			
			
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				logout(primaryStage);	
			});
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void logout(Stage stage){
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You'er about to logout!");
		alert.setContentText("Do you want to save before exiting?:");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("You Succesfully logged out!");
			stage.close();
		}
	}
}
