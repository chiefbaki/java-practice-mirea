package com.example._6lab;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextArea text;

    @FXML
    private AnchorPane blue;

    @FXML
    private AnchorPane green;

    @FXML
    private AnchorPane red;

    @FXML
    private Label TimesNewRoman;

    @FXML
    private Label MSPGothic;

    @FXML
    private Label CourierNew;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text.setText("test");
        blue.setOnMouseClicked(e->{
            text.setStyle("-fx-text-fill:blue");
        });
        green.setOnMouseClicked(e->{
            text.setStyle("-fx-text-fill:green");
        });
        red.setOnMouseClicked(e->{
            text.setStyle("-fx-text-fill:red");
        });

        TimesNewRoman.setOnMouseClicked(e->{
            text.setFont(Font.font("Times New Roman"));
        });
        MSPGothic.setOnMouseEntered(e->{
            text.setFont(Font.font("MS PGothic"));
        });
        CourierNew.setOnMouseClicked(e->{
            text.setFont(Font.font("Courier New"));
        });
    }
}
