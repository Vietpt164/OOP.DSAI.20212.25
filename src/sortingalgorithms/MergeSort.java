package sortingalgorithms;

import elements.Square;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class MergeSort extends SortingAlgo{
	
	public MergeSort(int[] input_array, Pane input_pane, TextArea input_text_area) {
		super(input_array, input_pane, input_text_area);
		for (int i = 0; i<8; i++) {
			Square element = drawSquare(array[i]);
			element.setAxis(30+40*i, 25);
			pane.getChildren().add(element);
		}
		int m = getMax(array, arr_length);
		for (int exp = 1; m / exp > 0; exp *= 10) {
				countSort(array, arr_length, exp);}
		
	
	}
	public MergeSort(int[] input_array, Pane input_pane, TextArea input_text_area) {
		super(input_array, input_pane, input_text_area);
		// TODO Auto-generated constructor stub
	}

}
