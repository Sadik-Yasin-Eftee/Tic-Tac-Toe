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
            var button = Main.uiButtons[i];
            button.setStyle("-fx-border-color: Green");
            button.setStyle("-fx-background-color: Green");
            if (TicTacToeController.forestTheme){
                if (button.getText().equals("X")){
                    button.setText("\uD83C\uDF4E");
                }
            }

        }
    }
}

