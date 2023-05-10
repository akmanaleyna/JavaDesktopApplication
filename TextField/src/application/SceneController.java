package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneController {
	

	@FXML
	private Label myLabel;
	@FXML
	private TextField myTextField;
	@FXML
	private Button myButton;
	
	int age;
	
	public void submit(ActionEvent event) throws IOException{
		
		try {
			age = Integer.parseInt(myTextField.getText());
		
			if(age < 18 && age > 0)
				myLabel.setText("Yaşınız 18 den küçük olduğundan başvuru yapamazsınız !");
			else if(age >= 18)
				myLabel.setText("Tebrikler başvuru yapabilirsiniz.");
			else if(age < 0)
				myLabel.setText("Lütfen Geçerli Bir Değer Giriniz !!!");
			
		}catch(NumberFormatException e) {
			myLabel.setText("Lütfen Geçerli Bir Değer Giriniz !!!");
		}
		catch(Exception e) {
			System.out.println("eror");
		}
	}
}
	