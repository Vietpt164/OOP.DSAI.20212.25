package SortingAlgorithm;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public abstract class SortingAlgo {
	protected int[] array_og;
	protected int[] array;
	protected int arr_length;
	protected int curr_step;
	protected int max_step;
	protected Pane pane;
	protected TextArea text_area;



	public SortingAlgo(int[] input_array, Pane input_pane, TextArea input_text_area) {
		array_og = input_array;
		arr_length = array_og.length;
		pane = input_pane;
		text_area = input_text_area;
		array = array_og.clone();
}
}