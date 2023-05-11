package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
		Parent root = loader.load();	
		SampleController controller = loader.getController();
		Scene scene = new Scene(root,100,100);		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				switch(event.getCode()) {
				
				case W:
					controller.moveUp();
					break;
				case S:
					controller.moveDown();
					break;
				case A:
					controller.moveLeft();
					break;
				case D:
					controller.moveRight();
					break;
				default:
					System.out.println(event.getCode().toString());
					break;
				}		
			}	
		});

		stage.setScene(scene);
		stage.show();
	}	

	public static void main(String[] args) {
		launch(args);
	}
}
