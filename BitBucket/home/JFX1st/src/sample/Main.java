package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application  {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(false);
        grid.setStyle("-fx-background-color: black");


        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("<Academia de Código_>");
        primaryStage.show();
        

        Label title = new Label("#ROOTHless");
        title.setAlignment(Pos.CENTER);
        title.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        title.setStyle("-fx-text-fill: red");

        TextField userText = new TextField();
        Label userLabel = new Label("Code Cadet: ");
        userLabel.setStyle("-fx-text-fill: white");

        PasswordField passText = new PasswordField();
        Label passLabel = new Label("Password ");
        passLabel.setStyle("-fx-text-fill: white");

        Button loginButton = new Button("Login");
        TextField buttonText = new TextField();


        grid.add(title, 0, 0, 2, 1);

        grid.add(userText, 1, 1, 1, 1);
        grid.add(userLabel, 0, 1, 1, 1);


        grid.add(passText, 1, 2, 1, 1);
        grid.add(passLabel, 0, 2, 1, 1);

        grid.add(loginButton, 0, 3, 1, 1);

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            CharSequence username = userText.getCharacters();
            CharSequence password = passText.getCharacters();
            @Override
            public void handle(ActionEvent event) {
                System.out.println("User: " + username);
                System.out.println("Password: " + password);
            }
        });
    }


}
