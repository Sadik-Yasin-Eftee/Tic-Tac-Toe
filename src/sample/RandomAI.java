package sample;

import javafx.scene.text.Font;

import java.awt.*;

public class RandomAI {
    private boolean player = true;

    private boolean buttonArray[] = new boolean[9];

    public void setButtonArray(boolean[] buttonArray) {
        for (int i = 0; i < 9; i++) {
            this.buttonArray[i] = false;
        }
    }

    public int buttonCount = 0;
    public int max = 8, min = 0;

    public void randomAIMethod(javafx.scene.control.Button clickedButton) {
            WinningCombination winningCombination = new WinningCombination();

            if (buttonCount < 9) {
                clickedButton.setFont(new javafx.scene.text.Font("MV Boli",30));
                clickedButton.setText("X");
                System.out.println(clickedButton.getId());
                this.buttonArray[Integer.parseInt(clickedButton.getId())] = true;
                System.out.println(this.buttonArray[Integer.parseInt(clickedButton.getId())]);
                player = false;
                buttonCount++;

                if (winningCombination.combination() == 1){
                    System.out.println("Player wins");
                }
            }

            if (buttonCount < 9) {
                do {
                    //Random randomNumber = new Random();
                    int randomNumber = (int) (Math.random() * (max - min + 1) + min);
                    clickedButton = Main.buttons[randomNumber];
                    System.out.println(randomNumber);
                    //if ()
                    //System.out.println(clickedButton.getId());
                    player = true;
                }
                while (clickedButton.getText() != "");
                clickedButton.setFont(new Font("MV Boli",30));
                clickedButton.setText("O");
                buttonCount++;
                if (winningCombination.combination() == -1){
                    System.out.println("Computer wins");
                }
            }
            //System.out.println("Button 1");
    }
}
