package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField radiusField;

    @FXML
    private TextField heightField;

    @FXML
    private TextField areaField;


    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();

    }



   private void startCalc(){
        String radiusStr = radiusField.getText();
        String heightStr = heightField.getText();
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Double area = calcArea(radius, height);
        areaField.setText(area.toString());
        

        calcArea(radius, height);
    }


    private double calcArea(double radius, double height) {
        double area = 1.0/3.0 * Math.PI * Math.pow(radius, 2) * height;
        return area;
    }

}
