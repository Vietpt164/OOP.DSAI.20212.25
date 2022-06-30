package controller;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainScreenController {
	@FXML
	BorderPane myborderpane;
	@FXML
	MenuBar mymenubar;
	@FXML
	Menu myhelpmenu;
	@FXML
	Pane mypane1;
	@FXML
	Pane mypane2;
	@FXML
	Button logout;
	@FXML
	VBox myvbox;
	@FXML
	MenuItem helpmenuitem;
	
	Stage stage;
	
	@FXML
	public void logoutPressed(ActionEvent event){	
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("Do you want to save before exiting?: ");
		
		if(alert.showAndWait().get() == ButtonType.OK){
		stage = (Stage) myborderpane.getScene().getWindow();
			stage.close();}
		}
	public void btnHelpPressed(ActionEvent event) {
		new HelpController();
	}
	}

