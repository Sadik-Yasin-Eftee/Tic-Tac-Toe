package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    static Button[] uiButtons = new Button[9];
    static Button[] gameButtons = new Button[9];

    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("TicTacToe.fxml"));
            Scene scene = new Scene(root,650, 650);
            //scene.lookup("#1");
            //Button button1 = ((Button)scene.lookup("#0"));



            Button button = new Button();
            //button1.setText("Changed");
            //System.out.println(button1.getId()); // shows the index number of button

            //int array[] = new int[9];
            for (int i = 0 ;i < 9 ; i = i + 1){
                String j = Integer.toString(i);
                button = ((Button) scene.lookup("#" + j));
                String index = button.getId();
                //int ind = Integer.parseInt(index);
                uiButtons[i] = button;
                gameButtons[i] = new Button();
                //buttons[i].setFont(new Font("MV Boli", 10));
                System.out.println(uiButtons[i]);
                //button.setText("O");
            }
            TicTacToeController.ai = new RandomAI();


            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}