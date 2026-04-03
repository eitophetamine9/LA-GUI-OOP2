package com.example.la_gui_oop2_;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaOrderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaOrderApplication.class.getResource("pizza-order-system.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 350);
        stage.setTitle("Pizza Order System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}