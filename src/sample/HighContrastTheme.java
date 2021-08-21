package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HighContrastTheme implements ThemeSelection{
    @Override
    public void selectTheme(ImageView backgroundImage, Image themeImage) {
        for (int i = 0 ; i < 9 ; i++){
            Main.buttons[i].setStyle("-fx-border-color: Grey");
            Main.buttons[i].setStyle("-fx-background-color: Grey");
        }
    }
}