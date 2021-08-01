package sample;

import javafx.scene.control.Button;

public class HighlightLosingCombination {
    public void highlightLosingCombo(Button button, Button button1, Button button2){
        button.setStyle("-fx-background-color: radial-gradient(radius 100%, white, blue, darkblue);-fx-text-fill: red;");
        button1.setStyle("-fx-background-color: radial-gradient( radius 100%, white, blue, darkblue); -fx-text-fill: red;");
        button2.setStyle("-fx-background-color: radial-gradient( radius 100%, white, blue, darkblue); -fx-text-fill: red;");
    }
}
