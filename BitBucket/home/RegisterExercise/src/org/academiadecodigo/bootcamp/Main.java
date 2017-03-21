package org.academiadecodigo.bootcamp;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.academiadecodigo.bootcamp.persistence.ConnectionManager;
import org.academiadecodigo.bootcamp.service.ServiceRegistry;
import org.academiadecodigo.bootcamp.service.user.JdbcUserService;
import org.academiadecodigo.bootcamp.service.user.UserService;

public class Main extends Application {
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Register");

        ConnectionManager connectionManager = new ConnectionManager();
        UserService jdbcUserService = new JdbcUserService(connectionManager);
        ServiceRegistry.getInstance().addService(jdbcUserService.getName(), jdbcUserService);

        Navigation.getInstance().setStage(primaryStage);
        Navigation.getInstance().loadScreen("Untitled");


      // Controller controller = (Controller) Navigation.getInstance().getController("Untitled");
      // controller.setUserService(new JdbcUserService(connectionManager));*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}
