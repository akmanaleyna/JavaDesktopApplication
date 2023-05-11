package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class SceneController implements Initializable{
	
	@FXML
	private ListView<String> myListView;
	
	@FXML
	private Label myLabel;

	private String[] name = {"Aleyna", "Şefika", "Zekiye", "Kaan", "Gülay", "Kayra", "Ahsen"}; 
	
	String currentName;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myListView.getItems().addAll(name);
		
		myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				
				currentName = myListView.getSelectionModel().getSelectedItem();
				
				myLabel.setText(currentName);
				
			}
		});
	}
	
	
}
