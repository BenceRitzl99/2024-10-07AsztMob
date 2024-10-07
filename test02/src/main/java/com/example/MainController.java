package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField numTextField;

    @FXML
    void onClickMehetGomb(ActionEvent event) {
        System.out.println("Működik");
    }

    @FXML
    void onClickMásikGomb(ActionEvent event) {
        System.out.println("Másik");
        String szam =numTextField.getText();
        System.out.println(szam);
    }

}
