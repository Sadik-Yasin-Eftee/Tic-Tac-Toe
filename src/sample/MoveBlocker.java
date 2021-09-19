package sample;

import javafx.scene.text.Font;

public class MoveBlocker {
    public int blockMoves() {

        //row check

        for (int i = 0; i < 9; i = i + 3) {
            if ((Main.uiButtons[i].getText() == "X") && (Main.uiButtons[i + 1].getText() == "X")) {
                if (Main.uiButtons[i + 2].getText() == "") {
                    Main.uiButtons[i + 2].setFont(new Font("MV Boli", 30));
                    Main.uiButtons[i + 2].setText("O");
                    return 1;
                }

            } else if ((Main.uiButtons[i].getText() == "X") && (Main.uiButtons[i + 2].getText() == "X")) {
                if (Main.uiButtons[i + 1].getText() == "") {
                    Main.uiButtons[i + 1].setFont(new Font("MV Boli", 30));
                    Main.uiButtons[i + 1].setText("O");
                    return 1;
                }

            } else if ((Main.uiButtons[i + 1].getText() == "X") && (Main.uiButtons[i + 2].getText() == "X")) {
                if (Main.uiButtons[i].getText() == "") {
                    Main.uiButtons[i].setFont(new Font("MV Boli", 30));
                    Main.uiButtons[i].setText("O");
                    return 1;
                }
            }
        }

        //column check

        for (int i = 0; i < 3; i++) {
            if ((Main.uiButtons[i].getText() == "X") && (Main.uiButtons[i + 3].getText() == "X")) {
                if (Main.uiButtons[i + 6].getText() == "") {
                    Main.uiButtons[i + 6].setFont(new Font("MV Boli", 30));
                    Main.uiButtons[i + 6].setText("O");
                    return 1;
                }

            } else if ((Main.uiButtons[i].getText() == "X") && (Main.uiButtons[i + 6].getText() == "X")) {
                if (Main.uiButtons[i + 3].getText() == "") {
                    Main.uiButtons[i + 3].setFont(new Font("MV Boli", 30));
                    Main.uiButtons[i + 3].setText("O");
                    return 1;
                }

            } else if ((Main.uiButtons[i + 3].getText() == "X" && Main.uiButtons[i + 6].getText() == "X")) {
                if (Main.uiButtons[i].getText() == "") {
                    Main.uiButtons[i].setFont(new Font("MV Boli", 30));
                    Main.uiButtons[i].setText("O");
                    return 1;
                }
            }
        }

        //diagonal check

        if ((Main.uiButtons[0].getText() == "X") && (Main.uiButtons[4].getText() == "X")) {
            if (Main.uiButtons[8].getText() == ""){
                Main.uiButtons[8].setFont(new Font("MV Boli", 30));
                Main.uiButtons[8].setText("O");
                return 1;
            }

        } else if ((Main.uiButtons[0].getText() == "X") && (Main.uiButtons[8].getText() == "X")) {
            if (Main.uiButtons[4].getText() == ""){
                Main.uiButtons[4].setFont(new Font("MV Boli", 30));
                Main.uiButtons[4].setText("O");
                return 1;
            }
        } else if ((Main.uiButtons[4].getText() == "X") && (Main.uiButtons[8].getText() == "X")) {
            if (Main.uiButtons[0].getText() == ""){
                Main.uiButtons[0].setFont(new Font("MV Boli", 30));
                Main.uiButtons[0].setText("O");
                return 1;
            }
        }


        if ((Main.uiButtons[2].getText() == "X") && (Main.uiButtons[4].getText() == "X")) {
            if (Main.uiButtons[6].getText() == ""){
                Main.uiButtons[6].setFont(new Font("MV Boli", 30));
                Main.uiButtons[6].setText("O");
                return 1;
            }
        } else if ((Main.uiButtons[2].getText() == "X") && (Main.uiButtons[6].getText() == "X")) {
            if (Main.uiButtons[4].getText() == ""){
                Main.uiButtons[4].setFont(new Font("MV Boli", 30));
                Main.uiButtons[4].setText("O");
                return 1;
            }
        } else if ((Main.uiButtons[4].getText() == "X") && (Main.uiButtons[6].getText() == "X")) {
            if (Main.uiButtons[2].getText() == ""){
                Main.uiButtons[2].setFont(new Font("MV Boli", 30));
                Main.uiButtons[2].setText("O");
                return 1;
            }
        }
        return 0;
    }
}