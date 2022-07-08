package controller;

import java.io.IOException;
import java.util.Random;
import screens.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sortingalgorithms.CountingSort;
import sortingalgorithms.MergeSort;
import sortingalgorithms.RadixSort;

public class SortAlgoController {

	public static String sort;
	Stage stage;
	
    @FXML
    private TextField array_text_field;

    @FXML
    private Label arraylengthtext;

    @FXML
    private Label arraylengthtext1;

    @FXML
    private Label arraytext;

    @FXML
    private Button backButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button helpButton;

    @FXML
    private TextArea instructfield;

    @FXML
    private BorderPane myborderpane;

    @FXML
    private Pane mypane1;

    @FXML
    private Pane mypane2;

    @FXML
    private VBox myvbox1;

    @FXML
    private VBox myvbox2;

    @FXML
    private RadioButton rButton1;

    @FXML
    private RadioButton rButton2;

    @FXML
    private ToggleGroup random;

    @FXML
    private Button startButton;

    @FXML
    void backBtnPressed(ActionEvent event) {
    	try {
			Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/screens/MainScreen.fxml"));
			loader.setController(new MainScreenController());
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setTitle("Sorting Visualization");
			stage.setScene(scene);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }

    @FXML
    void exitButtonPressed(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("See you next time  !!!");
		
		if(alert.showAndWait().get() == ButtonType.OK){
		stage = (Stage) myborderpane.getScene().getWindow();
			stage.close();}
    }

    @FXML
    void helpButtonPressed(ActionEvent event) {
    	new HelpController();
    }

    @FXML
    void startButtonPressed(ActionEvent event) {
		String db = array_text_field.getText();
		int[] array= new int[8];
		if (rButton2.isSelected()) {
		for (int i =0; i < db.length();i+=2) {
			array[i] = Character.getNumericValue(db.charAt(i));
		if (sort == "RadixSort") {
			new RadixSort(array,mypane1,instructfield);
			instructfield.setText(db);
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
		new RadixSort(array,mypane1,instructfield);
		instructfield.setText(db);
	} else if (sort == "MergeSort") {
		new MergeSort(array,mypane1,instructfield);
	} else {
		new CountingSort(array,mypane1,instructfield);
		}
	}
	}
 

}




