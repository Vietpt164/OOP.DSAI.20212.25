package controller;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import sortingalgorithms.SortingAlgo;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SortAlgoController {
	
	SortingAlgo sortingAlgo;
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
    private Button finishButton;

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
    private Button nextButton;

    @FXML
    private Button previousButton;

    @FXML
    private ToggleGroup random;

    @FXML
    private RadioButton randomButton;

    @FXML
    private Button resetButton;

    @FXML
    private RadioButton selfCreateButton;

    @FXML
    private Button startButton;
    
    @FXML
    private Label stepLabel;
	private boolean resetFlag;

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
    void finishButtonPressed(ActionEvent event) {
    	sortingAlgo.displaySortedArray();
		stepLabel.setText("" + sortingAlgo.getCurr_step() + "/" + sortingAlgo.getTotal_step());
    }

    @FXML
    void helpButtonPressed(ActionEvent event) {
    	new HelpController();
    }

    @FXML
    void nextButtonPressed(ActionEvent event) {
    	sortingAlgo.nextStep();
    	stepLabel.setText("" + sortingAlgo.getCurr_step() + "/" + sortingAlgo.getTotal_step());
    }

    @FXML
    void previousButtonPressed(ActionEvent event) {
    	sortingAlgo.previousStep();
		stepLabel.setText("" + sortingAlgo.getCurr_step() + "/" + sortingAlgo.getTotal_step());
	}
    

    @FXML
    void resetButtonPressed(ActionEvent event) {
    	sortingAlgo.displayInitialArray();
		stepLabel.setText("" + sortingAlgo.getCurr_step() + "/" + sortingAlgo.getTotal_step());
		resetFlag = true;
    }

    @FXML
    void startButtonPressed(ActionEvent event) {
    	int[] array= new int[8];
		
		if (selfCreateButton.isSelected()) {
			String db = array_text_field.getText();
			String[] strArray = db.split(",");
			for (int i = 0; i < strArray.length ; i++) {
				array[i] = Integer.parseInt(strArray[i].trim());
			}
			
			
		} else if (randomButton.isSelected()) {
			Random rand = new Random();
			for (int i = 0; i < 8; i++) {
				array[i] = rand.nextInt(100);
			}
		}
		
		if (sort == "RadixSort") {
			sortingAlgo = new RadixSort(array,mypane1,instructfield);
		} else if (sort == "MergeSort") {
			sortingAlgo = new MergeSort(array,mypane1,instructfield);		
		} else {
			sortingAlgo = new CountingSort(array,mypane1,instructfield);
		}
		
		stepLabel.setText("" + sortingAlgo.getCurr_step() + "/" + sortingAlgo.getTotal_step());
		sortingAlgo.displayInitialArray();
		
    }
   

}




