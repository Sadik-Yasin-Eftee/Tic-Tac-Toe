package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;

public class TicTacToeController<classicImage, forestImage, getClass> {

    static AI ai;

    public void modeButtonClicked(ActionEvent actionEvent) throws IOException{
        Button AIButton = (Button) actionEvent.getTarget();
        String modeButtonLabel = AIButton.getId();
        if (modeButtonLabel.equals("random")){
            ai = new RandomAI();
        } else {
            ai = new DefensiveAI();
        }
    }

    public void buttonClicked(ActionEvent actionEvent) throws IOException {
        Button clickedButton = (Button) actionEvent.getTarget();
        String buttonLabel = clickedButton.getText();
        ai.generateMove(clickedButton);
    }

    // This part is for theme selection

    @FXML
    private RadioButton classic, forest, highContrast;

    @FXML
    ImageView backgroundImage;
    static Image classicImage;
    static Image forestImage;
    static Image highContrastImage;


    @FXML
    public void initialize() {
        classicImage = new Image(getClass().getResourceAsStream("Classic.jpg"));
        forestImage = new Image(getClass().getResourceAsStream("Forest.png"));
        highContrastImage = new Image(getClass().getResourceAsStream("DarkGrey.jpg"));
    }

    static boolean classicTheme = true;
    static boolean forestTheme = false;
    static boolean highContrastTheme = false;

    public void themeSelection(ActionEvent actionEvent) throws IOException {
        if (classic.isSelected()) {
            System.out.println("Classic Selected");
            ClassicTheme classicTheme = new ClassicTheme();
            classicTheme.selectTheme(backgroundImage , classicImage);
            TicTacToeController.classicTheme = true;
            TicTacToeController.forestTheme = false;
            TicTacToeController.highContrastTheme = false;
            classicTheme.setButtonAndBorderColor();
            //theme.setText(classic.getText());
        }
        else if (forest.isSelected()) {
            System.out.println("Forest Selected");
            ForestTheme forestTheme = new ForestTheme();
            forestTheme.selectTheme(backgroundImage , forestImage);
            TicTacToeController.classicTheme = false;
            TicTacToeController.forestTheme = true;
            TicTacToeController.highContrastTheme = false;
            forestTheme.setButtonAndBorderColor();
            //theme.setText(forest.getText());
        }
        else if (highContrast.isSelected()) {
            System.out.println("High Selected");
            backgroundImage.setImage(highContrastImage);
            HighContrastTheme highContrastTheme = new HighContrastTheme();
            highContrastTheme.selectTheme(backgroundImage , highContrastImage);
            TicTacToeController.classicTheme = false;
            TicTacToeController.forestTheme = true;
            TicTacToeController.highContrastTheme = false;
            highContrastTheme.setButtonAndBorderColor();
            //theme.setText(highContrast.getText());
        }
    }
}
