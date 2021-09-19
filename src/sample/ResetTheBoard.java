package sample;

import javafx.scene.control.Button;

public class ResetTheBoard {
    public void resetButtons(){
        for (Button button : Main.uiButtons){
            if (button != null){
                button.setText("");
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
