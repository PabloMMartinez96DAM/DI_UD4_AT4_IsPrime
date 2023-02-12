package com.profesor.primo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TilePane pane;
    private Label arrayNumeros[] = new Label[100];


    @FXML
    void onCalculateBtn(ActionEvent event) {


    }

    @FXML
    void onCloseBtn(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

}
