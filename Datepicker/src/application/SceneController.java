package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class SceneController {
	@FXML
	private DatePicker myDatePicker;
	@FXML
	private Label myLabel;
	
	public void getDate(ActionEvent event) {
		
		LocalDate date = myDatePicker.getValue();
		myLabel.setText("Tarih : " + date.toString());
		//myDatePicker.setValue(LocalDate.of(1972,12,22));
		//myLabel.setText("Tarih : " + myDatePicker.getValue().toString());
	}
}
