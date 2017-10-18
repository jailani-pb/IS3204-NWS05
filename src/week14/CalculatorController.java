package week14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

	@FXML
	Label labelInput;
	
	@FXML
	public void showInput(ActionEvent event) {
		Button button = (Button)event.getSource();
		labelInput.setText(button.getText());
	}

	@FXML public void calculate(ActionEvent event) {}

	@FXML public void clear() {}
}
