package sample;

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
import org.academiacodigo.calc.Brain;

import java.util.ArrayList;

public class Main extends Application {
    private String finalNumber = "0";
    private ArrayList<Button> buttonArrayList;

    @Override
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


        Button ac = new Button("AC");
        ac.setPrefSize(50, 50);
        buttonArrayList.add(ac);

        Button zero = new Button("0");
        zero.setPrefSize(50, 50);
        buttonArrayList.add(zero);

        Button one = new Button("1");
        one.setPrefSize(50, 50);
        buttonArrayList.add(one);

        Button two = new Button("2");
        two.setPrefSize(50, 50);
        buttonArrayList.add(two);

        Button three = new Button("3");
        three.setPrefSize(50, 50);
        buttonArrayList.add(three);

        Button forr = new Button("4");
        forr.setPrefSize(50, 50);
        buttonArrayList.add(forr);

        Button five = new Button("5");
        five.setPrefSize(50, 50);
        buttonArrayList.add(five);

        Button six = new Button("6");
        six.setPrefSize(50, 50);
        buttonArrayList.add(six);

        Button seven = new Button("7");
        seven.setPrefSize(50, 50);
        buttonArrayList.add(seven);

        Button eight = new Button("8");
        eight.setPrefSize(50, 50);
        buttonArrayList.add(eight);

        Button nine = new Button("9");
        nine.setPrefSize(50, 50);
        buttonArrayList.add(nine);

        Button plus = new Button("+");
        plus.setPrefSize(50, 50);
        buttonArrayList.add(plus);

        Button minus = new Button("-");
        minus.setPrefSize(50, 50);
        buttonArrayList.add(minus);

        Button multiply = new Button("*");
        multiply.setPrefSize(50, 50);
        buttonArrayList.add(multiply);

        Button division = new Button("/");
        division.setPrefSize(50, 50);
        buttonArrayList.add(division);

        Button equals = new Button("=");
        equals.setPrefSize(50, 50);
        buttonArrayList.add(equals);


        Label userLabel = new Label(finalNumber);
        userLabel.setAlignment(Pos.CENTER_RIGHT);
        userLabel.setStyle("-fx-text-fill: red");
        userLabel.setStyle("-fx-border-color: black;");
        userLabel.setPrefSize(200, 50);

        /*TextField userText = new TextField();

        grid.add(userText, 0, 0, 4, 1);*/
        grid.add(userLabel, 0, 0, 4, 1);
        grid.add(ac, 0, 1, 1, 1);
        grid.add(zero, 1, 1, 1, 1);
        grid.add(equals, 2, 1, 1, 1);
        grid.add(division, 3, 1, 1, 1);

        grid.add(one, 0, 2, 1, 1);
        grid.add(two, 1, 2, 1, 1);
        grid.add(three, 2, 2, 1, 1);
        grid.add(multiply, 3, 2, 1, 1);

        grid.add(forr, 0, 3, 1, 1);
        grid.add(five, 1, 3, 1, 1);
        grid.add(six, 2, 3, 1, 1);
        grid.add(minus, 3, 3, 1, 1);

        grid.add(seven, 0, 4, 1, 1);
        grid.add(eight, 1, 4, 1, 1);
        grid.add(nine, 2, 4, 1, 1);
        grid.add(plus, 3, 4, 1, 1);


                for (Button button : buttonArrayList) {
                    String id = button.getText();

                    if ( id.equals("0") || id.equals("1") || id.equals("2") || id.equals("3") || id.equals("4") || id.equals("5") || id.equals("6") || id.equals("7") || id.equals("8") || id.equals("9") ) {
                        System.out.println(button);
                    }

                }
        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            }
        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
