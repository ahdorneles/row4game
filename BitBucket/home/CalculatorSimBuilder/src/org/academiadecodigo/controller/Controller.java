package org.academiadecodigo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.academiadecodigo.model.Brain;

/**
 * Created by codecadet on 08/03/17.
 */
public class Controller {
    private Brain brain;

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    @FXML
    private Label labelDisplay;

    @FXML
    private Button buttonDivision;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonMultiple;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonComma;

    @FXML
    private Button buttonEquals;

    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonFor;

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonZero;

    @FXML
    void buttonHandler(ActionEvent event) {

    }

    public void labelSetText(String label){
        labelDisplay.setText(label);
    }
}
