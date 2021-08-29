package sample;

import javafx.scene.text.Font;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.ActionEvent;

public class RandomAI extends AI{
    private boolean player = true;

//    private boolean buttonArray[] = new boolean[9];

//    public void setButtonArray(boolean[] buttonArray) {
//        for (int i = 0; i < 9; i++) {
//            this.buttonArray[i] = false;
//        }
//    }

    public int buttonCount = 0;

    public RandomAI() {
        ResetTheBoard resetTheBoard = new ResetTheBoard();
        resetTheBoard.reset();
    }

    public void generateMove(Button clickedButton) {
        WinningCombination winningCombination = new WinningCombination();

        if (buttonCount < 9) {
            PlayerMove playerMove = new PlayerMove();
            playerMove.play(clickedButton);
            player = false;
            buttonCount++;
            if (winningCombination.combination() == 1){
                System.out.println("Player wins");
            }
        }

        if (buttonCount < 9) {
            do {
                RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
                int randomNumber = randomNumberGenerator.generateRandomNumber();
                clickedButton = Main.buttons[randomNumber];
                System.out.println(randomNumber);
                //System.out.println(clickedButton.getId());
                //System.out.println(this.buttonArray[Integer.parseInt(clickedButton.getId())]);
                player = true;
            }
            while (clickedButton.getText() != "");
            clickedButton.setFont(new Font("MV Boli",30));
            clickedButton.setText("O");
            buttonCount++;
            System.out.println("button count" + buttonCount);
            if (winningCombination.combination() == -1){
                System.out.println("Computer wins");
            }
        }
        //System.out.println("Button 1");
    }
}
