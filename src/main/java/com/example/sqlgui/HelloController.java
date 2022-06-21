package com.example.sqlgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button abfragen;

    @FXML
    private CheckBox abteilung;

    @FXML
    private CheckBox email;

    @FXML
    private CheckBox geburtsdatum;

    @FXML
    private CheckBox gehalt;

    @FXML
    private CheckBox geschlecht;

    @FXML
    private TextField idTextField;

    @FXML
    private CheckBox nachname;

    @FXML
    private CheckBox personal;

    @FXML
    private CheckBox plz;

    @FXML
    private CheckBox raumgr;

    @FXML
    private CheckBox raumnr;

    @FXML
    private CheckBox stock;

    @FXML
    private CheckBox vorname;

    @FXML
    private CheckBox wohnort;

    @FXML
    void onAbfrageClicked(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}