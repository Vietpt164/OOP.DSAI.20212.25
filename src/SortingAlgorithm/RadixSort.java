package SortingAlgorithm;
import java.util.*;
import java.io.*;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class RadixSort extends SortingAlgo{

	
	public RadixSort(int[] input_array, Pane input_pane, TextArea input_text_area) {
		super(input_array, input_pane, input_text_area);
			int m = getMax(array, arr_length);
			for (int exp = 1; m / exp > 0; exp *= 10) {
				countSort(array, arr_length, exp);}
		
	
	}
	static int getMax(int arr[], int n)
	{
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	static void countSort(int arr[], int n, int exp)
	{
		int output[] = new int[n]; 
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);
		for (i = 0; i < n; i++){
			count[(arr[i] / exp) % 10]++;
		} // take the elements here

		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		
		}

		
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}
	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66, 1235,1234,9871 };
		new RadixSort(arr,new Pane(), new TextArea());
		
	}
}

