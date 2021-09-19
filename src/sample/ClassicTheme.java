package sample;

import java.awt.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class ClassicTheme implements ThemeSelection{
    @Override
    public void selectTheme(ImageView backgroundImage, Image themeImage) {
        backgroundImage.setImage(themeImage);
    }

    public void setButtonAndBorderColor(){
        for (int i = 0 ; i < 9 ; i++){
            Main.buttons[i].setStyle("-fx-border-color: Black");
            Main.buttons[i].setStyle("-fx-background-color: White");
        }
    }
}
