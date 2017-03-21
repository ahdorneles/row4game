package org.academiadecodigo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.academiadecodigo.controller.Controller;
import org.academiadecodigo.model.Brain;

import java.io.IOException;

/**
 * Created by codecadet on 08/03/17.
 */
public class Main extends Application {
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(root);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void init(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/Calculator.fxml"));
            root = fxmlLoader.load();
            Controller controller = fxmlLoader.<Controller>getController();
            Brain brain = new Brain();
            controller.setBrain(brain);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
