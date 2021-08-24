package sample;

import javafx.scene.control.Button;

public class DefensiveAI extends AI {
     @Override
    public void generateMove(Button button) {
        System.out.println("Defensive Ai button clicked");
    }
}
