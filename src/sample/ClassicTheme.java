package sample;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class ClassicTheme implements ThemeSelection{
    @Override
    public void selectTheme(ImageView backgroundImage, Image themeImage) {
        backgroundImage.setImage(themeImage);
    }

    public void setButtonAndBorderColor(){
        for (int i = 0 ; i < 9 ; i++){
            Main.uiButtons[i].setStyle("-fx-border-color: Black");
            Main.uiButtons[i].setStyle("-fx-background-color: White");
        }
    }
}
