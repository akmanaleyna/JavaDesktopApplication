package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SceneController {
	
	@FXML
	ImageView myImageView;
	@FXML
	Button myButton;
	
	Image myImage = new Image(getClass().getResourceAsStream("Wall-e and eve.png"));
	Image myImageAlone = new Image(getClass().getResourceAsStream("Wall-e.jpg"));
	
	public void displayImage() {
		
		if(myImageView.getImage().equals(myImageAlone))
			myImageView.setImage(myImage);
		else
			myImageView.setImage(myImageAlone);
	}
}
