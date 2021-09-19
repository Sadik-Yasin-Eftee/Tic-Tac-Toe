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
            var gameButton = Main.gameButtons[i];
            var uiButton  = Main.uiButtons[i];

            uiButton.setStyle("-fx-border-color: Green");
            uiButton.setStyle("-fx-background-color: Green");
            if (gameButton.getText().equals("X")){
                uiButton.setText("\uD83C\uDF4E");
            }
        }
    }
}

