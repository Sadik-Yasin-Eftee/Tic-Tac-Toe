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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.ResourceBundle;


public class TicTacToeController<classicImage, forestImage, getClass> {

    public void buttonClicked(ActionEvent actionEvent) throws IOException {

        Button AIButton = (Button) actionEvent.getTarget();
        Button clickedButton = (Button) actionEvent.getTarget();
        String buttonLabel = AIButton.getText();

        RandomAI randomAI = new RandomAI();
        randomAI.randomAIMethod(clickedButton);
    }

    // This part is for theme selection

    @FXML
    private RadioButton classic, forest, highContrast;

    @FXML
    ImageView backgroundImage;
    Image classicImage;
    Image forestImage;
    Image highContrastImage;


    @FXML
    public void initialize() {
        classicImage = new Image(getClass().getResourceAsStream("Classic.jpg"));
        forestImage = new Image(getClass().getResourceAsStream("Forest.png"));
        highContrastImage = new Image(getClass().getResourceAsStream("DarkGrey.jpg"));
    }

    public void themeSelection(ActionEvent actionEvent) throws IOException {
        if (classic.isSelected()) {
            System.out.println("Classic Selected");
            backgroundImage.setImage(classicImage);
            for (int i = 0 ; i < 9 ; i++){
                Main.buttons[i].setStyle("-fx-background-color: White");
            }
            //theme.setText(classic.getText());
        } else if (forest.isSelected()) {
            System.out.println("Forest Selected");
            backgroundImage.setImage(forestImage);
            for (int i = 0 ; i < 9 ; i++){
                Main.buttons[i].setStyle("-fx-background-color: Green");
            }
            //theme.setText(forest.getText());
        } else if (highContrast.isSelected()) {
            System.out.println("High Selected");
            backgroundImage.setImage(highContrastImage);
            for (int i = 0 ; i < 9 ; i++){
                Main.buttons[i].setStyle("-fx-background-color: Grey");
            }
            //theme.setText(highContrast.getText());
        }
    }
}
