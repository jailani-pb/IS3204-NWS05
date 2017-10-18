package week14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

	@FXML
	Label labelInput, labelResult;

	Pattern inputPattern = Pattern.compile("^[0-9]+\\.?[0-9]*$");
	double result = 0.0;
	boolean isFirstInput = true;
	char inputSymbol = '=';

	@FXML public void showInput(ActionEvent event) {
		Button button = (Button)event.getSource();
		String previousText = labelInput.getText();
		String buttonText = button.getText();
		Matcher numberMatcher = inputPattern.matcher(labelInput.getText() + button.getText());
		if(numberMatcher.matches()) {
			labelInput.setText(previousText + buttonText);
		} else {
			labelResult.setText(previousText + buttonText
					+ " is invalid. Current result: " + result);
		}
	}

	@FXML public void calculate(ActionEvent event) {
		Button button = (Button)event.getSource();
		if(labelInput.getText().equals("")) {
			inputSymbol = button.getText().charAt(0);
			if(inputSymbol != '=') {
				labelResult.setText(Double.toString(result) + " " + inputSymbol);
			} else {
				labelResult.setText(Double.toString(result));
			}
		} else {
			double inputtedValue = Double.parseDouble(labelInput.getText());
			if(isFirstInput) {
				result = inputtedValue;
				isFirstInput = false;
			} else {
				if(inputSymbol == '+') {
					result = result + inputtedValue;
				} else if(inputSymbol == '-') {
					result = result - inputtedValue;
				} else if(inputSymbol == '*') {
					result = result * inputtedValue;
				} else if(inputSymbol == '/') {
					result = result / inputtedValue;
				}
			}
			inputSymbol = button.getText().charAt(0);
			if(inputSymbol != '=') {
				labelResult.setText(result + " " + inputSymbol);
			} else {
				labelResult.setText(result + "");
			}
			labelInput.setText("");
		}
	}

	@FXML public void clear() {
		result = 0.0;
		isFirstInput = true;
		labelInput.setText("");
		labelResult.setText("");
	}
}
