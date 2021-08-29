package sample;

import javafx.scene.control.Button;

public class ResetTheBoard {
    public void reset(){
        for (Button button : Main.buttons){
            if (button != null){
                button.setText("");
            }
        }
    }
}
