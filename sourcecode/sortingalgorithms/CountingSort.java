package sortingalgorithms;

import elements.Square;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class CountingSort extends SortingAlgo {
	private double startX, startY;
	private int[][] step;
	private Color[] initColor = {Color.LIGHTBLUE, Color.BLACK };
	private final String[] instructions;
	private int[] keys;
	
	public CountingSort(int[] input_array, Pane input_pane, TextArea input_text_area) {
		super(input_array, input_pane, input_text_area);
		this.array_og = input_array;
		this.array = array_og.clone();
		
		step = new int[4][100];
		curr_step = total_step = 0;
		
		this.instructions = new String[4];
		instructions[0] = "Initialize the key array with zeros";
		instructions[1] = "For every number in the list increase the respective index in the key array.";
		instructions[2] = "Loop over all elements of the key array.";
		instructions[3] = "While the current element is not zero, add the index to the result and decrease the counter.";

		//assignStep(0, arr_length - 1, pane.getWidth() / 2 - (arr_length/2) * 60, startY, 0, 0);
		//sort the array beforehand
		//sort(0, arr_length - 1, startX, pane.getWidth(), startY); 
		for (int i = 0; i < arr_length ; i++) {
			Square element = drawSquare(array[i]);
			element.setAxis(200+65*i, 50);
			pane.getChildren().add(element);
		}
		
		
		
		for (int i = 0; i <= getMax(array) ; i++) {
			Square element = drawSquare(i);
			element.setAxis(200+65*i, 300);
			pane.getChildren().add(element);
		}
		
		counting_sort();
	}
	
	void counting_sort() {

	    // First, find the maximum value in A[]
	    int K = getMax(array);

	    // Initialize the elements of keys[] with 0
	    keys = new int[K+1];
	    for(int i = 0 ; i <= K; i++) {
	        keys[i] = 0;
	    }

	    // Store the frequencies of each distinct element of A[],
	    // by mapping its value as the index of Aux[] array
	    
	    
	    for(int i = 0; i < arr_length; i++) {
	    	Square element = new Square(array[i], 200+65*i, 50, Color.BLUE, Color.BLACK);
			pane.getChildren().add(element);
		
			ParallelTransition pt = new ParallelTransition();
			pt.getChildren().add(element.move(65 * array[i], 250));
			pt.play();
			//element.move(200 + 65 * array[i], 300);
	    	keys[array[i]]++;
	    }
	    

	    /*int j = 0;
	    for(int i = 0; i <= K; i++) {
	    	int tmp = keys[i];
	        // Keys stores which element occurs how many times,
	        // Add i in sortedA[] according to the number of times i occured in A[]
	        while(tmp != 0) {
	            array[j] = i;
	            j++;
	        }
	    }*/
	}
	
	private int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	@Override
	public void displayInitialArray() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nextStep() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void previousStep() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displaySortedArray() {
		// TODO Auto-generated method stub
		
	}

}
