package sample;

import javafx.scene.text.Font;

public class MoveBlocker {
    public int blockMoves() {

        //row check

        for (int i = 0; i < 9; i = i + 3) {
            if ((Main.buttons[i].getText() == "X") && (Main.buttons[i + 1].getText() == "X")) {
                if (Main.buttons[i + 2].getText() == "") {
                    Main.buttons[i + 2].setFont(new Font("MV Boli", 30));
                    Main.buttons[i + 2].setText("O");
                    return 1;
                }

            } else if ((Main.buttons[i].getText() == "X") && (Main.buttons[i + 2].getText() == "X")) {
                if (Main.buttons[i + 1].getText() == "") {
                    Main.buttons[i + 1].setFont(new Font("MV Boli", 30));
                    Main.buttons[i + 1].setText("O");
                    return 1;
                }

            } else if ((Main.buttons[i + 1].getText() == "X") && (Main.buttons[i + 2].getText() == "X")) {
                if (Main.buttons[i].getText() == "") {
                    Main.buttons[i].setFont(new Font("MV Boli", 30));
                    Main.buttons[i].setText("O");
                    return 1;
                }
            }
        }

        //column check

        for (int i = 0; i < 3; i++) {
            if ((Main.buttons[i].getText() == "X") && (Main.buttons[i + 3].getText() == "X")) {
                if (Main.buttons[i + 6].getText() == "") {
                    Main.buttons[i + 6].setFont(new Font("MV Boli", 30));
                    Main.buttons[i + 6].setText("O");
                    return 1;
                }

            } else if ((Main.buttons[i].getText() == "X") && (Main.buttons[i + 6].getText() == "X")) {
                if (Main.buttons[i + 3].getText() == "") {
                    Main.buttons[i + 3].setFont(new Font("MV Boli", 30));
                    Main.buttons[i + 3].setText("O");
                    return 1;
                }

            } else if ((Main.buttons[i + 3].getText() == "X" && Main.buttons[i + 6].getText() == "X")) {
                if (Main.buttons[i].getText() == "") {
                    Main.buttons[i].setFont(new Font("MV Boli", 30));
                    Main.buttons[i].setText("O");
                    return 1;
                }
            }
        }

        //diagonal check

        if ((Main.buttons[0].getText() == "X") && (Main.buttons[4].getText() == "X")) {
            if (Main.buttons[8].getText() == ""){
                Main.buttons[8].setFont(new Font("MV Boli", 30));
                Main.buttons[8].setText("O");
                return 1;
            }

        } else if ((Main.buttons[0].getText() == "X") && (Main.buttons[8].getText() == "X")) {
            if (Main.buttons[4].getText() == ""){
                Main.buttons[4].setFont(new Font("MV Boli", 30));
                Main.buttons[4].setText("O");
                return 1;
            }
        } else if ((Main.buttons[4].getText() == "X") && (Main.buttons[8].getText() == "X")) {
            if (Main.buttons[0].getText() == ""){
                Main.buttons[0].setFont(new Font("MV Boli", 30));
                Main.buttons[0].setText("O");
                return 1;
            }
        }


        if ((Main.buttons[2].getText() == "X") && (Main.buttons[4].getText() == "X")) {
            if (Main.buttons[6].getText() == ""){
                Main.buttons[6].setFont(new Font("MV Boli", 30));
                Main.buttons[6].setText("O");
                return 1;
            }
        } else if ((Main.buttons[2].getText() == "X") && (Main.buttons[6].getText() == "X")) {
            if (Main.buttons[4].getText() == ""){
                Main.buttons[4].setFont(new Font("MV Boli", 30));
                Main.buttons[4].setText("O");
                return 1;
            }
        } else if ((Main.buttons[4].getText() == "X") && (Main.buttons[6].getText() == "X")) {
            if (Main.buttons[2].getText() == ""){
                Main.buttons[2].setFont(new Font("MV Boli", 30));
                Main.buttons[2].setText("O");
                return 1;
            }
        }
        return 0;
    }
}