package sample;

public class WinningCombination {
    public boolean combination() {

        //row combinations

        if (Main.buttons[0].getText() != "") {
            if (Main.buttons[0].getText() == Main.buttons[1].getText() && Main.buttons[1].getText() == Main.buttons[2].getText()) {
                return true;
            }
        }
        if (Main.buttons[3].getText() != "") {
            if (Main.buttons[3].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[5].getText()) {
                return true;
            }
        }
        if (Main.buttons[6].getText() != "") {
            if (Main.buttons[6].getText() == Main.buttons[7].getText() && Main.buttons[7].getText() == Main.buttons[8].getText()) {
                return true;
            }
        }

        //column combinations

        if (Main.buttons[0].getText() != "") {
            if (Main.buttons[0].getText() == Main.buttons[3].getText() && Main.buttons[3].getText() == Main.buttons[6].getText()) {
                return true;
            }
        }
        if (Main.buttons[1].getText() != "") {
            if (Main.buttons[1].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[7].getText()) {
                return true;
            }
        }
        if (Main.buttons[2].getText() != "") {
            if (Main.buttons[2].getText() == Main.buttons[5].getText() && Main.buttons[5].getText() == Main.buttons[8].getText()) {
                return true;
            }
        }

        //diagonal combinations

        if (Main.buttons[0].getText() != "") {
            if (Main.buttons[0].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[8].getText()) {
                return true;
            }
        }

        if (Main.buttons[2].getText() != "") {
            if (Main.buttons[2].getText() == Main.buttons[4].getText() && Main.buttons[4].getText() == Main.buttons[6].getText()) {
                return true;
            }
        }

        return false;
    }
}
