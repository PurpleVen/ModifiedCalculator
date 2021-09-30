package com.example.modifiedcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField answer, number1, number2;

        @FXML
        protected void onADDButtonClick()
        {
            double first = Double.parseDouble(number1.getText());
            double second = Double.parseDouble(number2.getText());
            double result = first + second;
            answer.setText(String.valueOf(result));
        }

        @FXML
        protected void onSUBTRACTButtonClick()
        {
            double first = Double.parseDouble(number1.getText());
            double second = Double.parseDouble(number2.getText());
            double result = second - first;
            answer.setText(String.valueOf(result));
        }

        @FXML
        protected void onMULTIPLYButtonClick()
       {
            double first = Double.parseDouble(number1.getText());
            double second = Double.parseDouble(number2.getText());
            double result = first * second;
            answer.setText(String.valueOf(result));
       }

       @FXML
       protected void onDIVISIONButtonClick()
       {
           double first = Double.parseDouble(number1.getText());
           double second = Double.parseDouble(number2.getText());
           double result = second / first;
           answer.setText(String.valueOf(result));
       }
}