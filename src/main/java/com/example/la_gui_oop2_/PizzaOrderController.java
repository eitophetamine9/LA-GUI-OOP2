package com.example.la_gui_oop2_;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PizzaOrderController {

    @FXML
    private ChoiceBox<String> pizzaSizeChoice;

    @FXML
    private ChoiceBox<String> pizzaToppingsChoice;

    @FXML
    private ChoiceBox<String> extraCheeseChoice;

    @FXML
    private Label totalLabel;

    @FXML
    private Button calculateButton;

    @FXML
    public void initialize() {
        pizzaSizeChoice.getItems().addAll("Small", "Medium", "Large");
        pizzaToppingsChoice.getItems().addAll("Mushrooms", "Pepperoni", "Onions");
        extraCheeseChoice.getItems().addAll("Yes", "No");

        pizzaSizeChoice.getSelectionModel().selectFirst();
        pizzaToppingsChoice.getSelectionModel().selectFirst();
        extraCheeseChoice.getSelectionModel().selectFirst();

        pizzaSizeChoice.setId("pizzaSizeChoice");
        pizzaToppingsChoice.setId("pizzaToppingsChoice");
        extraCheeseChoice.setId("extraCheeseChoice");
        totalLabel.setId("totalLabel");
        calculateButton.setId("calculateButton");
    }

    @FXML
    protected void onCalculateButton() {
        int total = 0;

        String size = pizzaSizeChoice.getValue();
        if (size != null) {
            switch (size) {
                case "Small": total += 10; break;
                case "Medium": total += 15; break;
                case "Large": total += 20; break;
            }
        }

        String topping = pizzaToppingsChoice.getValue();
        if (topping != null && !topping.isEmpty()) {
            total += 2;
        }

        String extraCheese = extraCheeseChoice.getValue();
        if ("Yes".equals(extraCheese)) {
            total += 3;
        }

        totalLabel.setText(String.valueOf(total));
    }
}