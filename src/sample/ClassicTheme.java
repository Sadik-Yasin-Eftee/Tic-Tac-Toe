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
            var gameButton = Main.gameButtons[i];
            var uiButton  = Main.uiButtons[i];

            uiButton.setStyle("-fx-border-color: Black");
            uiButton.setStyle("-fx-background-color: White");
            if (gameButton.getText().equals("X")){
                uiButton.setText("X");
            }
        }
    }
}
