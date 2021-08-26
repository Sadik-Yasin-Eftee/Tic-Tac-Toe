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
    public int max = 8, min = 0;

    private boolean player = true;

    @Override
    public void generateMove(Button clickedButton) {
        //System.out.println("Defensive Ai button clicked");
        WinningCombination winningCombination = new WinningCombination();

        if (buttonCount < 9) {
            clickedButton.setFont(new javafx.scene.text.Font("MV Boli",30));
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
            if (blockMoves() == 1){
              buttonCount++;
            }
            else {
                do {
                    int randomNumber = (int) (Math.random() * (max - min + 1) + min);
                    clickedButton = Main.buttons[randomNumber];
                    player = true;
                }
                while (clickedButton.getText() != "");
                clickedButton.setFont(new Font("MV Boli",30));
                clickedButton.setText("O");
                buttonCount++;
                System.out.println("button count" + buttonCount);
            }
            if (winningCombination.combination() == -1){
                System.out.println("Computer wins");
            }
        }
    }

    public int blockMoves(){
        //row check
        for (int i = 0 ; i < 9 ; i = i + 3){
            if (Main.buttons[i].getText().equals(Main.buttons[i+1].getText())){
                Main.buttons[i+2].setText("O");
                return 1;
            }
            else if (Main.buttons[i].getText().equals(Main.buttons[i+2].getText())){
                Main.buttons[i+1].setText("O");
                return 1;
            }
            else if (Main.buttons[i+1].getText().equals(Main.buttons[i+2].getText())){
                Main.buttons[i].setText("O");
                return 1;
            }
        }

        //column check
        for (int i = 0 ; i < 3 ; i++){
            if (Main.buttons[i].getText().equals(Main.buttons[i+3].getText())){
                Main.buttons[i+6].setText("O");
                return 1;
            }
            else if (Main.buttons[i].getText().equals(Main.buttons[i+6].getText())){
                Main.buttons[i+3].setText("O");
                return 1;
            }
            else if (Main.buttons[i+3].getText().equals(Main.buttons[i+6].getText())){
                Main.buttons[i].setText("O");
                return 1;
            }
        }

        //diagonal check
        return 0;
    }
}
