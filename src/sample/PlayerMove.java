package sample;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class PlayerMove {
    public void play(Button clickedButton) {
        System.out.println("Player Mode");
        clickedButton.setFont(new Font("MV Boli",30));
        clickedButton.setText("X");
        System.out.println(clickedButton.getId());
    }
}
