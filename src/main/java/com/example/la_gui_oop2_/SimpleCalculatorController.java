package com.example.la_gui_oop2_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleCalculatorController {

    @FXML
    private TextField tfNumber1;

    @FXML
    private TextField tfNumber2;

    @FXML
    private ComboBox<String> cbOperations;

    @FXML
    private Button btnCompute;

    @FXML
    private Label lblResult;

    @FXML
    public void initialize() {
        tfNumber1.setId("tfNumber1");
        tfNumber2.setId("tfNumber2");
        cbOperations.setId("cbOperations");
        btnCompute.setId("btnCompute");
        lblResult.setId("lblResult");

        cbOperations.getItems().addAll("+", "-", "*", "/");
        cbOperations.getSelectionModel().selectFirst();
    }

    @FXML
    void onCompute(ActionEvent event) {
        try {
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());
            String operation = cbOperations.getValue();
            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        result = 0;
                    }
                    break;
            }

            if (result == (long) result) {
                lblResult.setText(String.format("%d", (long) result));
            } else {
                lblResult.setText(String.valueOf(result));
            }
        } catch (NumberFormatException e) {
            lblResult.setText("Error");
        }
    }
}