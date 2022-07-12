package controller;

import screens.*;
import sortingalgorithms.*;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.*;
public class SortAlgoController {
	public static String sort;
	
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
	Button startButton;
	
	@FXML
	TextField array_text_field;
	
	@FXML
	TextArea instructfield;
	@FXML
	Label lb;
	
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
	@FXML
	public void backmenuitem(ActionEvent event) {
		
	}
	@FXML
	public void startButtonPressed(ActionEvent event) {
		String db = array_text_field.getText();
		int[] array= new int[8];
		if (rButton2.isSelected()) {
		for (int i =0; i < db.length();i+=2) {
			array[i] = Character.getNumericValue(db.charAt(i));
		if (sort == "RadixSort") {
			new RadixSort(array,mypane1,instructfield,lb);
			instructfield.setText("Count sorting the first time !!!!");
			lb.setText(1 + "/" + 4);
		} else if (sort == "MergeSort") {
			new MergeSort(array,mypane1,instructfield);
		}else {
			new CountingSort(array,mypane1,instructfield);
		}  
		} 
	}else {
		Random rand = new Random();
		for (int i = 0; i < 8; i++) {
			array[i] = rand.nextInt(9999);
	}	if (sort == "RadixSort") {
		new RadixSort(array,mypane1,instructfield,lb);
		instructfield.setText("Count sorting the 1 time !!!!");
		lb.setText(1 + "/" + 4);
	} else if (sort == "MergeSort") {
		new MergeSort(array,mypane1,instructfield);
	}else {
		new CountingSort(array,mypane1,instructfield);
	}
	}
	}
	@FXML
	public void prevPush(ActionEvent e) {
		if (sort == "RadixSort") {
			RadixSort.prevStep();
		} else if (sort == "MergeSort") {
			instructfield.setText("bruh");
		}else {
			instructfield.setText("bruh");
	}	
	}
	@FXML
	public  void nextPush(ActionEvent e) {
		if (sort == "RadixSort") {
			RadixSort.nextStep();
		} else if (sort == "MergeSort") {
			instructfield.setText("bruh");
		}else {
			instructfield.setText("bruh");
	}
	
	}
}
