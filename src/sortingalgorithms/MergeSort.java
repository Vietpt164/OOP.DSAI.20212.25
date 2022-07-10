package sortingalgorithms;

import elements.Square;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class MergeSort extends SortingAlgo{
	
	public MergeSort(int[] input_array, Pane input_pane, TextArea input_text_area) {
		super(input_array, input_pane, input_text_area);
		for (int i = 0; i<8; i++) {
			Square element = drawSquare(array[i]);
			element.setAxis(100+65*i, 25);
			pane.getChildren().add(element);
		}
		
	
	}


}
