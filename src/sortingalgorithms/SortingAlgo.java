package sortingalgorithms;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public abstract class SortingAlgo {
	protected int[] array_og;
	protected static int[] array;
	protected static int arr_length;
	protected int curr_step;
	protected int max_step;
	protected static Pane pane;
	protected static TextArea text_area;
	protected static Label lb;



	public SortingAlgo(int[] input_array, Pane input_pane, TextArea input_text_area,Label input_lb) {
		array_og = input_array;
		arr_length = 8;
		pane = input_pane;
		text_area = input_text_area;
		array = array_og.clone();
		lb = input_lb;
}
}  