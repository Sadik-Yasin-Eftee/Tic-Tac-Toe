package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;

public class TicTacToeController {

    private boolean player = true;

    public void buttonClicked(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getTarget();
        String buttonLabel = clickedButton.getText();
        if ("".equals(buttonLabel) && player){
            clickedButton.setText("X");
            player=false;
        }
        else if ("".equals(buttonLabel) && !player) {
            clickedButton.setText("O");
            player = true;
        }
        //System.out.println("Button 1");
    }
}
