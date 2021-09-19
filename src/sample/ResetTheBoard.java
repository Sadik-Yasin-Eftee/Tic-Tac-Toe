package sample;

import javafx.scene.control.Button;

public class ResetTheBoard {
    public void resetButtons(){
        for (Button button : Main.buttons){
            if (button != null){
                button.setText("");
            }
        }
    }
    public void resetWinningHighlights(){
        if (TicTacToeController.forestTheme){
            ForestTheme forestTheme = new ForestTheme();
            forestTheme.setButtonAndBorderColor();
        }
    }
}
