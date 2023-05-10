package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class SampleController implements Initializable {
	
	@FXML
	private ProgressBar myProgressBar;
	
	@FXML
	private Button myButton;
	
	@FXML
	private Label myLabel;
	
	//The BigDecimal class gives its user complete control over rounding behavior
	 BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0).replace(",", "."));
	//double progress;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myProgressBar.setStyle("-fx-accent: #00FF00;");
		
	}
	
	public void increase() {
		try {
			if(progress.doubleValue() < 1) {
				progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
				//System.out.println(progress.doubleValue());
				myProgressBar.setProgress(progress.doubleValue());
				myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) + "%");
			}
			
			/*do {
				progress += 0.1;
				myProgressBar.setProgress(progress);
				myLabel.setText(Double.toString(Math.round(progress * 100)) + "%");
			}while(Math.round(progress * 100) > 100); */
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
