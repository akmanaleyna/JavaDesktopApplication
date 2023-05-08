package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController2 {
	
	@FXML
	Label namelabel;
	
	public void displayName(String username) {
		namelabel.setText("Hello: " + username);
	}
}
