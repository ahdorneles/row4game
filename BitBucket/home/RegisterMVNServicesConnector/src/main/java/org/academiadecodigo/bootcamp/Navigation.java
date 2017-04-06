package org.academiadecodigo.bootcamp;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by codecadet on 08/03/17.
 */
public  class Navigation {
    private static final String VIEW_PATH = "/view";
    private static Navigation instance = null;
    private LinkedList<Scene> scenes = new LinkedList<Scene>();
    private Map<String, Initializable> controllers = new HashMap<>();
    private Stage stage;
    private Parent root;


    private Navigation() {
    }

 /*   public static synchronized Navigation getInstance() {
        if (instance == null) {
            instance = new Navigation();
        }
        return instance;
    }*/

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void loadScreen(String view) {
        try {

            FXMLLoader fxmlLoader;

            fxmlLoader = new FXMLLoader(getClass().getResource(VIEW_PATH + "/" + view + ".fxml"));
            System.out.println(VIEW_PATH + "/" + view);
            fxmlLoader.setControllerFactory(new Callback<Class<?>, Object>() {
                @Override
                public Object call(Class<?> param) {
                    System.out.println(param.getSimpleName());
                    return controllers.get(param.getSimpleName());
                }
            });
            root = fxmlLoader.load();

/*
            controllers.put(view, fxmlLoader.<Initializable>getController());
*/

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

    public static String getViewPath() {
        return VIEW_PATH;
    }

    public static void setInstance(Navigation instance) {
        Navigation.instance = instance;
    }

    public LinkedList<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(LinkedList<Scene> scenes) {
        this.scenes = scenes;
    }

    public Map<String, Initializable> getControllers() {
        return controllers;
    }

    public void setControllers(Map<String, Initializable> controllers) {
        this.controllers = controllers;
    }


}