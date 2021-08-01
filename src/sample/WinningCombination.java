package sample;

public class WinningCombination {
    HighlightingWinningCombination highlightingWinningCombination = new HighlightingWinningCombination();
    HighlightLosingCombination highlightLosingCombination = new HighlightLosingCombination();

    public int combination() {

        //row combinations

        if (Main.buttons[0].getText() != "" && Main.buttons[0].getText() == "X") {
            if (Main.buttons[0].getText() == Main.buttons[1].getText() && Main.buttons[1].getText() == Main.buttons[2].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[0] , Main.buttons[1] , Main.buttons[2]);
                return 1;
            }
        }

        if (Main.buttons[0].getText() != "" && Main.buttons[0].getText() == "0") {
            if (Main.buttons[0].getText() == Main.buttons[1].getText() && Main.buttons[1].getText() == Main.buttons[2].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[0] , Main.buttons[1] , Main.buttons[2]);
                return -1;
            }
        }

        if (Main.buttons[3].getText() != "" && Main.buttons[3].getText() == "X") {
            if (Main.buttons[3].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[5].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[3] , Main.buttons[4] , Main.buttons[5]);
                return 1;
            }
        }

        if (Main.buttons[3].getText() != "" && Main.buttons[3].getText() == "O") {
            if (Main.buttons[3].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[5].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[3] , Main.buttons[4] , Main.buttons[5]);
                return -1;
            }
        }

        if (Main.buttons[6].getText() != "" && Main.buttons[6].getText() == "X") {
            if (Main.buttons[6].getText() == Main.buttons[7].getText() && Main.buttons[7].getText() == Main.buttons[8].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[6] , Main.buttons[7] , Main.buttons[8]);
                return 1;
            }
        }

        if (Main.buttons[6].getText() != "" && Main.buttons[6].getText() == "O") {
            if (Main.buttons[6].getText() == Main.buttons[7].getText() && Main.buttons[7].getText() == Main.buttons[8].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[6] , Main.buttons[7] , Main.buttons[8]);
                return -1;
            }
        }

        //column combinations

        if (Main.buttons[0].getText() != "" && Main.buttons[0].getText() == "X") {
            if (Main.buttons[0].getText() == Main.buttons[3].getText() && Main.buttons[3].getText() == Main.buttons[6].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[0] , Main.buttons[3] , Main.buttons[6]);
                return 1;
            }
        }

        if (Main.buttons[0].getText() != "" && Main.buttons[0].getText() == "O") {
            if (Main.buttons[0].getText() == Main.buttons[3].getText() && Main.buttons[3].getText() == Main.buttons[6].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[0] , Main.buttons[3] , Main.buttons[6]);
                return -1;
            }
        }

        if (Main.buttons[1].getText() != "" && Main.buttons[1].getText() == "X") {
            if (Main.buttons[1].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[7].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[1] , Main.buttons[4] , Main.buttons[7]);
                return 1;
            }
        }

        if (Main.buttons[1].getText() != "" && Main.buttons[1].getText() == "O") {
            if (Main.buttons[1].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[7].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[1] , Main.buttons[4] , Main.buttons[7]);
                return -1;
            }
        }

        if (Main.buttons[2].getText() != "" && Main.buttons[2].getText() == "X") {
            if (Main.buttons[2].getText() == Main.buttons[5].getText() && Main.buttons[5].getText() == Main.buttons[8].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[2] , Main.buttons[5] , Main.buttons[8]);
                return 1;
            }
        }

        if (Main.buttons[2].getText() != "" && Main.buttons[2].getText() == "X") {
            if (Main.buttons[2].getText() == Main.buttons[5].getText() && Main.buttons[5].getText() == Main.buttons[8].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[2] , Main.buttons[5] , Main.buttons[8]);
                return -1;
            }
        }

        //diagonal combinations

        if (Main.buttons[0].getText() != "" && Main.buttons[0].getText() == "X") {
            if (Main.buttons[0].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[8].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[0] , Main.buttons[4] , Main.buttons[8]);
                return 1;
            }
        }

        if (Main.buttons[0].getText() != "" && Main.buttons[0].getText() == "O") {
            if (Main.buttons[0].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[8].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.buttons[0] , Main.buttons[4] , Main.buttons[8]);
                return -1;
            }
        }

        if (Main.buttons[2].getText() != "" && Main.buttons[2].getText() == "O") {
            if (Main.buttons[2].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[6].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[2] , Main.buttons[4] , Main.buttons[6]);
                return 1;
            }
        }

        if (Main.buttons[2].getText() != "" && Main.buttons[2].getText() == "O") {
            if (Main.buttons[2].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[6].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.buttons[2] , Main.buttons[4] , Main.buttons[6]);
                return -1;
            }
        }

        return 0;
    }
}
