package sortingalgorithms;

import elements.Square;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public abstract class SortingAlgo {
	protected int[] array_og;
	protected int[] array;
	protected int arr_length;
	protected int curr_step;
	protected int max_step;
	protected static Pane pane;
	protected static TextArea text_area;



	public SortingAlgo(int[] input_array, Pane input_pane, TextArea input_text_area) {
		array_og = input_array;
		arr_length = 8;
		pane = input_pane;
		text_area = input_text_area;
		array = array_og.clone();
	}
	
	public static Square drawSquare(int value) {
		Square square = new Square(value);
		return square;
	}
	
}