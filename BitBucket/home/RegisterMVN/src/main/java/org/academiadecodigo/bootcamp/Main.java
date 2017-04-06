package org.academiadecodigo.bootcamp;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.academiadecodigo.bootcamp.model.dao.hibernate.HibernateRoleDao;
import org.academiadecodigo.bootcamp.model.dao.hibernate.HibernateUserDao;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateTransactionManager;
import org.academiadecodigo.bootcamp.service.jdbc.ConnectionManager;
import org.academiadecodigo.bootcamp.service.ServiceRegistry;
import org.academiadecodigo.bootcamp.service.user.UserService;
import org.academiadecodigo.bootcamp.service.user.UserServiceImplementation;


public class Main extends Application {
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Register");

        ConnectionManager connectionManager = new ConnectionManager();
        //UserService jdbcUserService = new JdbcUserService(connectionManager);
        //ServiceRegistry.getInstance().addService(jdbcUserService);
        //UserService hibernateUserService = new HibernateUserService();
        UserService userService = new UserServiceImplementation(new HibernateUserDao(), new HibernateTransactionManager(), new HibernateRoleDao());
        ServiceRegistry.getInstance().addService(userService);

        Navigation.getInstance().setStage(primaryStage);
        Navigation.getInstance().loadScreen("Untitled");


      // Controller controller = (Controller) Navigation.getInstance().getController("Untitled");
      // controller.setUserService(new JdbcUserService(connectionManager));*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}
