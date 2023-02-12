package com.profesor.primo;

import javafx.application.Platform;
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


    //Método que calcula si el número de la label es primo para definir su estilo
    @FXML
    void onCalculateBtn(ActionEvent event) {

        for (int i = 0; i < this.arrayNumeros.length; i++) {

            Label currentLbl = (Label) this.pane.getChildren().get(i);
            String style = isPrime(i) ? "-fx-background-color : green" : "-fx-background-color : red";
            currentLbl.setStyle(style);
        }
    }


    //Método para cerrar la aplicación
    @FXML
    void onCloseBtn(ActionEvent event) {

        Platform.exit();

    }

    //Inicializamos la vista creando los labels que representan a los números
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int i = 0; i < this.arrayNumeros.length; i++) {

            Label lbl = new Label(String.valueOf(i));
            lbl.setStyle("-fx-font-size: 16");
            this.pane.getChildren().add(lbl);
        }
    }

    //Comprueba si un número es primo
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }


}
