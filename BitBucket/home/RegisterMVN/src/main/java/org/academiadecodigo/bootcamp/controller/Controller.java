package org.academiadecodigo.bootcamp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import org.academiadecodigo.bootcamp.Navigation;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.ServiceRegistry;
import org.academiadecodigo.bootcamp.service.user.UserService;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private boolean inRegister = false;
    private boolean inLogin = true;
    private User user;
    private UserService userService;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        userService = (UserService) ServiceRegistry.getInstance().getServiceValue("UserService");

    }

    @FXML // fx:id="buttonRegister"
    private Button buttonRegister; // Value injected by FXMLLoader

    @FXML // fx:id="buttonLogin"
    private Button buttonLogin; // Value injected by FXMLLoader

    @FXML // fx:id="Register2"
    private Button buttonRegister2; // Value injected by FXMLLoader

    @FXML // fx:id="userText"
    private TextField userText; // Value injected by FXMLLoader

    @FXML // fx:id="passText"
    private TextField passText; // Value injected by FXMLLoader

    @FXML // fx:id="emailText"
    private TextField emailText; // Value injected by FXMLLoader

    @FXML // fx:id="email"
    private Text email; // Value injected by FXMLLoader

    @FXML // fx:id="soutLabel"
    private Label soutLabel; // Value injected by FXMLLoader

    @FXML
    void handleButtonPressed(ActionEvent event) {


        if (event.getSource() == buttonLogin) {
            if (event.getSource() == buttonLogin) {
                login();
            }
            System.out.println("I am in Login");
            email.setVisible(false);
            emailText.setVisible(false);
            inLogin = true;
            inRegister = false;
        }

        if (event.getSource() == buttonRegister) {
            if (event.getSource() == buttonRegister) {
                register();
            }
            System.out.println("I am in buttonRegister");
            email.setVisible(true);
            emailText.setVisible(true);
            inRegister = true;
            inLogin = false;
        }
    }

    @FXML
    void textHandler(KeyEvent event) {
    }

    public void register() {
        if (inRegister == true) {
            if (registerAutenticater() == true) {
                user = new User(userText.getText(), passText.getText(), emailText.getText());
                userService.addUser(user);
                soutLabel.setVisible(true);
                soutLabel.setText("User Registered");
                return;
            }
            System.out.println("Please try again");
        }
    }

    public void login() {

        if (inLogin == true) {
            System.out.println("I am Login2");
            if (userService.authenticate(userText.getText(), passText.getText()) == true) {
                System.out.println("Logged IN");
                soutLabel.setVisible(true);
                soutLabel.setText("Logged IN");
                Navigation.getInstance().loadScreen("AfterLogin");
                return;
            }
            System.out.println("Wrong Credentials");
            soutLabel.setVisible(true);
            soutLabel.setText("Wrong Credentials");

        }
    }

    public boolean registerAutenticater() {
        if (userService.doesUserExists(userText.getText(), emailText.getText()) == false) {
            System.out.println("User or Email already exists");
            soutLabel.setVisible(true);
            soutLabel.setText("User or Email already exists");
            return false;
        }
        return true;
    }


}



