package org.academiadecodigo.bootcamp;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main extends Application {
    private Parent root;
    private Navigation navigation;
    private HibernateSessionManager hibernateSessionManager;

    @Override
    public void start(Stage primaryStage) throws Exception {


        ApplicationContext contextSpringConfig = new FileSystemXmlApplicationContext("/src/main/resources/spring/spring-config.xml");
        navigation = contextSpringConfig.getBean(Navigation.class);
        hibernateSessionManager = contextSpringConfig.getBean("hibernateSessionManager", HibernateSessionManager.class);
        navigation.setStage(primaryStage);
        navigation.loadScreen("Untitled");


        //UserService jdbcUserService = new JdbcUserService(connectionManager);
        //ServiceRegistry.getInstance().addService(jdbcUserService);
        //UserService hibernateUserService = new HibernateUserService();

      /*  UserService userService = new UserServiceImplementation(new HibernateUserDao(), new HibernateTransactionManager(), new HibernateRoleDao());
        ServiceRegistry.getInstance().addService(userService);*/
      /*  Navigation.getInstance().setStage(primaryStage);
        Navigation.getInstance().loadScreen("Untitled");*/

        // Controller controller = (Controller) Navigation.getInstance().getController("Untitled");
        // controller.setUserService(new JdbcUserService(connectionManager));*/

    }




    public static void main(String[] args) {
        launch(args);
    }
}
