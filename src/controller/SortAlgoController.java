package controller;

import screens.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SortAlgoController {
	@FXML
	BorderPane myborderpane;
	@FXML
	Pane mypane1;
	@FXML
	Pane mypane2;
	@FXML
	VBox myvbox1;
	@FXML
	VBox myvbox2;	
	@FXML
	MenuBar mymenubar;
	@FXML
	Menu myhelpmenu;
	@FXML
	MenuItem backmenuitem;
	@FXML
	MenuItem helpmenuitem;
	@FXML
	Label arraytext;
	@FXML
	Label arraylengthtext;
	@FXML
	RadioButton rButton1, rButton2;
	@FXML
	RadioButton r5, r6,r7,r8;
	@FXML
	Button logout;
	@FXML
	ChoiceBox<Integer> arraylengthchoicebox;
	Stage stage;
	
	@FXML
	public void logoutPressed(ActionEvent event){	
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("See you next time  !!!");
		
		if(alert.showAndWait().get() == ButtonType.OK){
		stage = (Stage) myborderpane.getScene().getWindow();
			stage.close();}
		}
	@FXML
	public void btnHelpPressed(ActionEvent event) {
		new HelpController();
	}
}
