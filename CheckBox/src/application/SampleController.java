package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController {
	
	@FXML
	private CheckBox myCheckBox;
	@FXML
	private ImageView myImageView;
	@FXML
	private Label myLabel;
	
	Image yanan = new Image(getClass().getResourceAsStream("yanan.png"));
	Image yanmayan = new Image(getClass().getResourceAsStream("yanmayan.png"));
	
	public void change(ActionEvent event) {
		
		if(myCheckBox.isSelected()) {
			myLabel.setText("ON");
			myImageView.setImage(yanan);
		}else {
			myLabel.setText("OFF");
			myImageView.setImage(yanmayan);
			
		}
		//myCheckBox.setSelected(false);
	}
}
