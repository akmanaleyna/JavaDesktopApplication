package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;


public class Controller {
	
	@FXML
	private Circle circle; 
	private double x;
	private double y;
	
	public void up(ActionEvent e) {
		circle.setCenterY(y -= 6); 
		//System.out.println("Up");
	}
	public void down(ActionEvent e) {
		circle.setCenterY(y += 6); 
		//System.out.println("Down");
	}
	public void right(ActionEvent e) {
		circle.setCenterX(x += 6); 
		//System.out.println("Right");
	}
	public void left(ActionEvent e) {
		circle.setCenterX(x -= 6); 
		//System.out.println("Left");
	}
}
