package sample;

public class WinningCombination {
    HighlightingWinningCombination highlightingWinningCombination = new HighlightingWinningCombination();
    HighlightLosingCombination highlightLosingCombination = new HighlightLosingCombination();

    public int combination() {

        //row combinations

        if (Main.gameButtons[0].getText() != "" && Main.gameButtons[0].getText() == "X") {
            if (Main.gameButtons[0].getText() == Main.gameButtons[1].getText() && Main.gameButtons[1].getText() == Main.gameButtons[2].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[0] , Main.uiButtons[1] , Main.uiButtons[2]);
                return 1;
            }
        }

        if (Main.gameButtons[0].getText() != "" && Main.gameButtons[0].getText() == "0") {
            if (Main.gameButtons[0].getText() == Main.gameButtons[1].getText() && Main.gameButtons[1].getText() == Main.gameButtons[2].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[0] , Main.uiButtons[1] , Main.uiButtons[2]);
                return -1;
            }
        }

        if (Main.gameButtons[3].getText() != "" && Main.gameButtons[3].getText() == "X") {
            if (Main.gameButtons[3].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[5].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[3] , Main.uiButtons[4] , Main.uiButtons[5]);
                return 1;
            }
        }

        if (Main.gameButtons[3].getText() != "" && Main.gameButtons[3].getText() == "O") {
            if (Main.gameButtons[3].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[5].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[3] , Main.uiButtons[4] , Main.uiButtons[5]);
                return -1;
            }
        }

        if (Main.gameButtons[6].getText() != "" && Main.gameButtons[6].getText() == "X") {
            if (Main.gameButtons[6].getText() == Main.gameButtons[7].getText() && Main.gameButtons[7].getText() == Main.gameButtons[8].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[6] , Main.uiButtons[7] , Main.uiButtons[8]);
                return 1;
            }
        }

        if (Main.gameButtons[6].getText() != "" && Main.gameButtons[6].getText() == "O") {
            if (Main.gameButtons[6].getText() == Main.gameButtons[7].getText() && Main.gameButtons[7].getText() == Main.gameButtons[8].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[6] , Main.uiButtons[7] , Main.uiButtons[8]);
                return -1;
            }
        }

        //column combinations

        if (Main.gameButtons[0].getText() != "" && Main.gameButtons[0].getText() == "X") {
            if (Main.gameButtons[0].getText() == Main.gameButtons[3].getText() && Main.gameButtons[3].getText() == Main.gameButtons[6].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[0] , Main.uiButtons[3] , Main.uiButtons[6]);
                return 1;
            }
        }

        if (Main.gameButtons[0].getText() != "" && Main.gameButtons[0].getText() == "O") {
            if (Main.gameButtons[0].getText() == Main.gameButtons[3].getText() && Main.gameButtons[3].getText() == Main.gameButtons[6].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[0] , Main.uiButtons[3] , Main.uiButtons[6]);
                return -1;
            }
        }

        if (Main.gameButtons[1].getText() != "" && Main.gameButtons[1].getText() == "X") {
            if (Main.gameButtons[1].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[7].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[1] , Main.uiButtons[4] , Main.uiButtons[7]);
                return 1;
            }
        }

        if (Main.gameButtons[1].getText() != "" && Main.gameButtons[1].getText() == "O") {
            if (Main.gameButtons[1].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[7].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[1] , Main.uiButtons[4] , Main.uiButtons[7]);
                return -1;
            }
        }

        if (Main.gameButtons[2].getText() != "" && Main.gameButtons[2].getText() == "X") {
            if (Main.gameButtons[2].getText() == Main.gameButtons[5].getText() && Main.gameButtons[5].getText() == Main.gameButtons[8].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[2] , Main.uiButtons[5] , Main.uiButtons[8]);
                return 1;
            }
        }

        if (Main.gameButtons[2].getText() != "" && Main.gameButtons[2].getText() == "X") {
            if (Main.gameButtons[2].getText() == Main.gameButtons[5].getText() && Main.gameButtons[5].getText() == Main.gameButtons[8].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[2] , Main.uiButtons[5] , Main.uiButtons[8]);
                return -1;
            }
        }

        //diagonal combinations

        if (Main.gameButtons[0].getText() != "" && Main.gameButtons[0].getText() == "X") {
            if (Main.gameButtons[0].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[8].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[0] , Main.uiButtons[4] , Main.uiButtons[8]);
                return 1;
            }
        }

        if (Main.gameButtons[0].getText() != "" && Main.gameButtons[0].getText() == "O") {
            if (Main.gameButtons[0].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[8].getText()) {
                highlightLosingCombination.highlightLosingCombo(Main.uiButtons[0] , Main.uiButtons[4] , Main.uiButtons[8]);
                return -1;
            }
        }

        if (Main.gameButtons[2].getText() != "" && Main.gameButtons[2].getText() == "X") {
            if (Main.gameButtons[2].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[6].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[2] , Main.uiButtons[4] , Main.uiButtons[6]);
                return 1;
            }
        }

        if (Main.gameButtons[2].getText() != "" && Main.gameButtons[2].getText() == "O") {
            if (Main.gameButtons[2].getText() == Main.gameButtons[4].getText() && Main.gameButtons[4].getText() == Main.gameButtons[6].getText()) {
                highlightingWinningCombination.highlightWinningCombo(Main.uiButtons[2] , Main.uiButtons[4] , Main.uiButtons[6]);
                return -1;
            }
        }

        return 0;
    }
}
