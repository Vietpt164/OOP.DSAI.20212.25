package sortingalgorithms;

import elements.Square;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public abstract class SortingAlgo implements Visualizable {
	protected int[] array_og;
	protected int[] array;
	protected int arr_length;
	protected int curr_step;
	protected int total_step;
	protected static Pane pane;
	protected static TextArea text_area;
	
	


	public int getCurr_step() {
		return curr_step;
	}

	public int getTotal_step() {
		return total_step;
	}

	public SortingAlgo(int[] input_array, Pane input_pane, TextArea input_progress_area) {
		array_og = input_array;
		arr_length = 8;
		pane = input_pane;
		text_area = input_progress_area;
		array = array_og.clone();
	}
	
	public static Square drawSquare(int value) {
		Square square = new Square(value);
		return square;
	}
	
	public void drawArray(int start, int end, double startX, double startY) {
		for (int i = start; i < end + 1; i++) {
			Square s;
			s = drawSquare(array[i]);
			s.setAxis(startX+65*i, startY);
			pane.getChildren().add(s);
		}
	}
}