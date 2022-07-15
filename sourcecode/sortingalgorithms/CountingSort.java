package sortingalgorithms;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class CountingSort extends SortingAlgo{
	
	public void CountingSort() {
		
	}
	private void Check_valid_value(int[] elements) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int element : elements) {
		  if (element > MAX_VALUE_TO_SORT) {
		    throw new IllegalArgumentException(
			"Element " + element + " is greater than maximum " + MAX_VALUE_TO_SORT);
		  }
		  if (element < MIN_VALUE_TO_SORT) {
		    throw new IllegalArgumentException(
			"Element " + element + " is less than minimum " + MIN_VALUE_TO_SORT);
		  }
		  System.out.print("All values are valid");
		}}
	    @Override
	public boolean isSuitableForInputSize(int size) {
		  if (size > MAX_INPUT_SIZE){
		    throw new IllegalArgumentException(
			"Too Much Values in Array.Please Try Again !");
		  };
		}

	public CountingSort(int[] input_array, Pane input_pane, TextArea input_text_area) {
		super(input_array, input_pane, input_text_area);
		Check_valid_value(input_array);
        	isSuitableForInputSize(input_array.length)

		// TODO Auto-generated constructor stub
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
