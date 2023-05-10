package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class SampleController {
	@FXML
	private Label myLabel;
	@FXML
	private RadioButton radioBTNKebap, radioBTNPizza, radioBTNDoner;
	
	public void getFood(ActionEvent event) {
		if(radioBTNKebap.isSelected())
			myLabel.setText(radioBTNKebap.getText());
		else if(radioBTNPizza.isSelected())
			myLabel.setText(radioBTNPizza.getText());
		else if(radioBTNDoner.isSelected())
			myLabel.setText(radioBTNDoner.getText());
	}
}
