package sample;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class DefensiveAI extends AI {
    public DefensiveAI() {
        ResetTheBoard resetTheBoard = new ResetTheBoard();
        resetTheBoard.resetButtons();
        resetTheBoard.resetWinningHighlights();
    }

    public int buttonCount = 0;
    private boolean player = true;

    @Override
    public void generateMove(Button clickedButton) {
        //System.out.println("Defensive Ai button clicked");
        WinningCombination winningCombination = new WinningCombination();
        MoveBlocker moveBlocker = new MoveBlocker();

        if (buttonCount < 9) {
            PlayerMove playerMove = new PlayerMove();
            playerMove.play(clickedButton);
            //this.buttonArray[Integer.parseInt(clickedButton.getId())] = true;
            //System.out.println(this.buttonArray[Integer.parseInt(clickedButton.getId())]);
            player = false;
            buttonCount++;
            if (winningCombination.combination() == 1){
                System.out.println("Player wins");
            }
        }

        if (buttonCount < 9){
            System.out.println("AI mode");
            if (moveBlocker.blockMoves() == 1){
                System.out.println("Block move mode");
                buttonCount++;
            }
            else if (moveBlocker.blockMoves() == 0) {
                System.out.println("Random number generator mode");
                do {
                    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
                    int randomNumber = randomNumberGenerator.generateRandomNumber();
                    System.out.println("Random number is :" + randomNumber);
                    clickedButton = Main.uiButtons[randomNumber];

                }
                while (clickedButton.getText() != "");
                clickedButton.setFont(new Font("MV Boli",30));
                clickedButton.setText("O");
                buttonCount++;
                System.out.println("button count" + buttonCount);
            }
            player = true;
            if (winningCombination.combination() == -1){
                System.out.println("Computer wins");
            }
        }
    }
}
