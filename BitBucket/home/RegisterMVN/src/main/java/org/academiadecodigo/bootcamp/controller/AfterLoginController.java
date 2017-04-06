package org.academiadecodigo.bootcamp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import org.academiadecodigo.bootcamp.Navigation;
import org.academiadecodigo.bootcamp.service.ServiceRegistry;
import org.academiadecodigo.bootcamp.service.user.UserService;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by codecadet on 08/03/17.
 */
public class AfterLoginController implements Initializable {
    private UserService userService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        userService = (UserService) ServiceRegistry.getInstance().getServiceValue(UserService.class.getSimpleName());

    }

    @FXML
    private MenuItem logOutMenu;

    @FXML
    private MenuItem quitMenu;

    @FXML
    void menuItemsHandler(ActionEvent event) {
        if (event.getSource() == logOutMenu){
            Navigation.getInstance().back();
        }
        if (event.getSource() == quitMenu){
            Navigation.getInstance().closeStage();
        }
    }

}
