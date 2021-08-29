package sample;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class DefensiveAI extends AI {
    public DefensiveAI() {
        for (Button button : Main.buttons){
            if (button != null){
                button.setText("");
            }
        }
    }

    public int buttonCount = 0;
    private boolean player = true;

    @Override
    public void generateMove(Button clickedButton) {
        //System.out.println("Defensive Ai button clicked");
        WinningCombination winningCombination = new WinningCombination();

        if (buttonCount < 9) {
            System.out.println("Player Mode");
            clickedButton.setFont(new Font("MV Boli",30));
            clickedButton.setText("X");
            System.out.println(clickedButton.getId());
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
            if (blockMoves() == 1){
                System.out.println("Block move mode");
                buttonCount++;
            }
            else if (blockMoves() == 0) {
                System.out.println("Random number generator mode");
                do {
                    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
                    int randomNumber = randomNumberGenerator.generateRandomNumber();
                    System.out.println("Random number is :" + randomNumber);
                    clickedButton = Main.buttons[randomNumber];

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

    public int blockMoves(){
        //row check
        for (int i = 0 ; i < 9 ; i = i + 3){
            if (Main.buttons[i].getText() == "X" && Main.buttons[i+1].getText() == "X"){
                Main.buttons[i+2].setFont(new Font("MV Boli",30));
                Main.buttons[i+2].setText("O");
                return 1;
            }
            else if (Main.buttons[i].getText() == "X" && Main.buttons[i+2].getText() == "X"){
                Main.buttons[i+1].setFont(new Font("MV Boli",30));
                Main.buttons[i+1].setText("O");
                return 1;
            }
            else if (Main.buttons[i+1].getText() == "X" && Main.buttons[i+2].getText() == "X"){
                Main.buttons[i].setFont(new Font("MV Boli",30));
                Main.buttons[i].setText("O");
                return 1;
            }
        }

        //column check
        for (int i = 0 ; i < 3 ; i++){
            if (Main.buttons[i].getText() == "X" && Main.buttons[i+3].getText() == "X"){
                Main.buttons[i+6].setFont(new Font("MV Boli",30));
                Main.buttons[i+6].setText("O");
                return 1;
            }
            else if (Main.buttons[i].getText() == "X" && Main.buttons[i+6].getText() == "X"){
                Main.buttons[i+3].setFont(new Font("MV Boli",30));
                Main.buttons[i+3].setText("O");
                return 1;
            }
            else if (Main.buttons[i+3].getText() == "X" && Main.buttons[i+6].getText() == "X"){
                Main.buttons[i].setFont(new Font("MV Boli",30));
                Main.buttons[i].setText("O");
                return 1;
            }
        }

        //diagonal check
        if (Main.buttons[0].getText() == "X" && Main.buttons[4].getText() == "X"){
            Main.buttons[7].setFont(new Font("MV Boli",30));
            Main.buttons[7].setText("O");
            return 1;
        }
        else if (Main.buttons[0].getText() == "X" && Main.buttons[7].getText() == "X"){
            Main.buttons[4].setFont(new Font("MV Boli",30));
            Main.buttons[4].setText("O");
            return 1;
        }
        else if (Main.buttons[4].getText() == "X" && Main.buttons[4].getText() == "X"){
            Main.buttons[0].setFont(new Font("MV Boli",30));
            Main.buttons[0].setText("O");
            return 1;
        }

        if (Main.buttons[2].getText() == "X" && Main.buttons[4].getText() == "X"){
            Main.buttons[6].setFont(new Font("MV Boli",30));
            Main.buttons[6].setText("O");
            return 1;
        }
        else if (Main.buttons[2].getText() == "X" && Main.buttons[6].getText() == "X"){
            Main.buttons[4].setFont(new Font("MV Boli",30));
            Main.buttons[4].setText("O");
            return 1;
        }
        else if (Main.buttons[4].getText() == "X" && Main.buttons[6].getText() == "X"){
            Main.buttons[2].setFont(new Font("MV Boli",30));
            Main.buttons[2].setText("O");
            return 1;
        }

        return 0;
    }
}
