package org.academiadecodigo.bootcamp;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by codecadet on 08/03/17.
 */
public final class Navigation {
    private static final String VIEW_PATH = "/view";
    private static Navigation instance = null;
    private LinkedList<Scene> scenes = new LinkedList<Scene>();
    private Map<String, Initializable> controllers = new HashMap<>();
    private Stage stage;
    private Parent root;


    private Navigation() {
    }

    public static synchronized Navigation getInstance() {
        if (instance == null) {
            instance = new Navigation();
        }
        return instance;
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void loadScreen(String view) {
        try {

            FXMLLoader fxmlLoader;
            fxmlLoader = new FXMLLoader(getClass().getResource(VIEW_PATH + "/" + view + ".fxml"));
            System.out.println(VIEW_PATH + "/" + view);
            root = fxmlLoader.load();

            controllers.put(view, fxmlLoader.<Initializable>getController());

            Scene scene = new Scene(root);
            scenes.push(scene);

            setScene(scene);

        } catch (IOException e) {
            System.out.println("Failure to load view " + view + " : " + e.getMessage());
        }
    }

    public void back() {

        if (scenes.isEmpty()) {
            return;
        }

        scenes.pop();

        setScene(scenes.peek());
    }

    private void setScene(Scene scene) {

        stage.setScene(scene);

        stage.show();
    }

    public Initializable getController(String view) {
        return controllers.get(view);
    }

    public void closeStage() {
        stage.close();
    }


}