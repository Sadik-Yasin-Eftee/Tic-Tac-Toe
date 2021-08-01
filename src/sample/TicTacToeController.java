package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.ResourceBundle;


public class TicTacToeController {

    private boolean player = true;

    private boolean buttonArray[] = new boolean[9];

    public void setButtonArray(boolean[] buttonArray) {
        for (int i = 0; i < 9; i++) {
            this.buttonArray[i] = false;
        }
    }

    public int buttonCount = 0;
    public int max = 8, min = 0;
/*
    @FXML
    private Label theme;

    @FXML
    private RadioButton classic, forest, highContrast;


 */

    public void buttonClicked(ActionEvent actionEvent) throws IOException {

        Button clickedButton = (Button) actionEvent.getTarget();
        String buttonLabel = clickedButton.getText();
        WinningCombination winningCombination = new WinningCombination();

        if (buttonCount < 9) {
            clickedButton.setText("X");
            System.out.println(clickedButton.getId());
            this.buttonArray[Integer.parseInt(clickedButton.getId())] = true;
            System.out.println(this.buttonArray[Integer.parseInt(clickedButton.getId())]);
            player = false;
            buttonCount++;

            if (winningCombination.combination() == 1){
                System.out.println("Player wins");
            }

        }

        if (buttonCount < 9) {
            do {
                //Random randomNumber = new Random();
                int randomNumber = (int) (Math.random() * (max - min + 1) + min);
                clickedButton = Main.buttons[randomNumber];
                System.out.println(randomNumber);
                //if ()
                //System.out.println(clickedButton.getId());
                player = true;
            }
            while (clickedButton.getText() != "");
            clickedButton.setText("O");
            buttonCount++;
            if (winningCombination.combination() == -1){
                System.out.println("Computer wins");
            }


        }
        //System.out.println("Button 1");
    }

    // This part is for theme selection

    @FXML
    private RadioButton classic, forest, highContrast;

    public void themeSelection(ActionEvent actionEvent) throws IOException {
        if (classic.isSelected()) {
            System.out.println("Classic Selected");
            //theme.setText(classic.getText());
        } else if (forest.isSelected()) {
            System.out.println("Forest Selected");
            //theme.setText(forest.getText());
        } else if (highContrast.isSelected()) {
            System.out.println("High Selected");
            //theme.setText(highContrast.getText());
        }
    }
}


