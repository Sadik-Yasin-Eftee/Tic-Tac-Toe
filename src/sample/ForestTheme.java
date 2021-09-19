package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ForestTheme implements ThemeSelection {
    @Override
    public void selectTheme(ImageView backgroundImage, Image themeImage) {
        backgroundImage.setImage(themeImage);
    }
    public void setButtonAndBorderColor(){
        for (int i = 0 ; i < 9 ; i++){
            Main.buttons[i].setStyle("-fx-border-color: Green");
            Main.buttons[i].setStyle("-fx-background-color: Green");
        }
    }
}

