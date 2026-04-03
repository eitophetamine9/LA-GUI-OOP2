package com.example.la_gui_oop2_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NumberCounterController {

    @FXML
    private Label countLabel;

    @FXML
    private Button decreaseButton;

    @FXML
    private Button increaseButton;

    private int count = 0;

    @FXML
    public void initialize() {
        countLabel.setId("countLabel");
        decreaseButton.setId("decreaseButton");
        increaseButton.setId("increaseButton");
    }

    @FXML
    void onDecrease(ActionEvent event) {
        count--;
        countLabel.setText(String.valueOf(count));
    }

    @FXML
    void onIncrease(ActionEvent event) {
        count++;
        countLabel.setText(String.valueOf(count));
    }
}