package sample;

import javafx.scene.control.Button;

public class ResetTheBoard {
    public void resetButtons(){
        for (int i = 0 ; i < 9 ; i++){
            var gameButton = Main.gameButtons[i];
            var uiButton = Main.uiButtons[i];
            if (uiButton != null){
                uiButton.setText("");
                gameButton.setText("");
            }
        }
    }
    public void resetWinningHighlights(){
        if (TicTacToeController.classicTheme){
            ClassicTheme classicTheme = new ClassicTheme();
            classicTheme.setButtonAndBorderColor();

        }
        else if (TicTacToeController.forestTheme){
            ForestTheme forestTheme = new ForestTheme();
            forestTheme.setButtonAndBorderColor();
        }
        else if (TicTacToeController.highContrastTheme){
            HighContrastTheme highContrastTheme = new HighContrastTheme();
            highContrastTheme.setButtonAndBorderColor();
        }
    }
}
