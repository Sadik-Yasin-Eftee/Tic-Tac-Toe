package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.ResourceBundle;

public class TicTacToeController {


    private boolean player = true;

    private boolean buttonArray[] = new boolean[9];

    public void setButtonArray(boolean[] buttonArray) {
        for (int i = 0 ; i < 9 ; i++){
            this.buttonArray[i] = false;
        }
    }

    public int max = 8 , min = 0;

    public void buttonClicked(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getTarget();
        String buttonLabel = clickedButton.getText();
        if ("".equals(buttonLabel) && player){
            clickedButton.setText("X");
            System.out.println(clickedButton.getId());
            this.buttonArray[Integer.parseInt(clickedButton.getId())] = true;
            System.out.println(this.buttonArray[Integer.parseInt(clickedButton.getId())]);
            player=false;
        }
        else if ("".equals(buttonLabel) && !player) {
            //Random randomNumber = new Random();
            int randomNumber = (int) (Math.random()*(max - min + 1) + min);
            System.out.println(randomNumber);
            //if ()
            clickedButton.setText("O");
            System.out.println(clickedButton.getId());
            player = true;
        }
        //System.out.println("Button 1");
    }

}
