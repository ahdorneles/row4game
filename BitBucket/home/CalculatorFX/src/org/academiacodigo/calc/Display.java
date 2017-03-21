package org.academiacodigo.calc;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

import static javafx.application.Application.launch;

/**
 * Created by codecadet on 03/03/17.
 */
public class Display extends Application {
    private ArrayList<Button> buttonArrayList;
    private int result;
    private String finalNumber = "0";
    private Button[] buttons;
    private Label userLabel;
    private String operator;


    public void start(Stage primaryStage) throws Exception {
        buttonArrayList = new ArrayList<>();
        Brain brain = new Brain();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(0);
        grid.setVgap(0);
        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setGridLinesVisible(false);
        grid.setStyle("-fx-background-color: white");

        Scene scene = new Scene(grid, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

        userLabel = new Label(finalNumber);
        userLabel.setAlignment(Pos.CENTER_RIGHT);
        userLabel.setStyle("-fx-text-fill: red");
        userLabel.setStyle("-fx-border-color: black;");
        userLabel.setPrefSize(200, 50);
        grid.add(userLabel, 0, 0, 4, 1);


        String[] buttonsiId = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "DEL", "0", "=", "/"};
        buttons = new Button[16];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button();
            buttons[i].setId(buttonsiId[i]);
            buttons[i].setText(buttonsiId[i]);
            buttons[i].setPrefSize(50, 50);
            grid.add(buttons[i], i % 4, (i / 4) + 1);
            buttons[i].setOnMouseClicked(new EventHandler<MouseEvent>() {


                @Override
                public void handle(MouseEvent event) {
                    int number1 = 0;
                    int number2 = 0;
                    String id = ((Button) event.getSource()).getId();
                    System.out.println("ID1: " + id);
                    userLabel.setText(userLabel.getText() + id);
                    if (id.equals("+")){
                        System.out.println("I am in plus");
                        number1 = Integer.parseInt(userLabel.getText());
                        userLabel.setText("");
                        userLabel.setText(userLabel.getText() + id);
                        number2 = Integer.parseInt(userLabel.getText());
                        System.out.println("Number1 : " + number1);
                        System.out.println("ID2: " + id);
                        System.out.println("Number2 : " + number2);

                    }

                    if(id.equals("=")){
                     userLabel.setText(String.valueOf(brain.add(number1,number2)));
                    }

                }
            });
        }


    }


    public Button[] getButtons() {
        return buttons;
    }

    public Label getUserLabel() {
        return userLabel;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
                    /*
                @Override
            buttons[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    System.out.println("Method being called");
                    String id = ((Button) event.getSource()).getId();
                    System.out.println("ID1: " + id);

                    userLabel.setText(userLabel.getText() + id);
                    System.out.println("ID2: " + id);



                }
            });




                    }*/
