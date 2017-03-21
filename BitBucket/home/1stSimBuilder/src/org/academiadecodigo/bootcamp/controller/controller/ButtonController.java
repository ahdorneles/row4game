package org.academiadecodigo.bootcamp.controller.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by codecadet on 06/03/17.
 */
public class ButtonController implements Initializable {
    @FXML
    private Button buttonThree;
    @FXML
    private Button buttonTwo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void handleButtonPressed(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        button.setVisible(true);
        buttonThree.setText("111");
        buttonTwo.setText("222");


    }
}
