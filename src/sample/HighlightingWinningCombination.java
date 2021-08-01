package sample;

import java.awt.*;
import javafx.scene.control.Button;

import static java.awt.Color.white;

public class HighlightingWinningCombination {

    public void highlightWinningCombo(Button button,Button button1,Button button2) {
        button.setStyle("-fx-background-color: radial-gradient(radius 100%, white, lightyellow, lawngreen);-fx-text-fill: red;");
        button1.setStyle("-fx-background-color: radial-gradient( radius 100%, white, lightyellow, lawngreen); -fx-text-fill: red;");
        button2.setStyle("-fx-background-color: radial-gradient( radius 100%, white, lightyellow, lawngreen); -fx-text-fill: red;");
    }

}
