package sortingalgorithms;
import java.util.*;
import java.io.*;
import java.lang.Math;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

import elements.Square;

public class RadixSort extends SortingAlgo{
	private static int n;
	public RadixSort(int[] input_array, Pane input_pane, TextArea input_text_area, Label input_lb) {
		super(input_array, input_pane, input_text_area, input_lb);
		
		final int m = getMax(array, arr_length);
		for (int i =0; i<8;i++) {
			Square bruh = drawSquare(array[i]);
			bruh.setAxis(30+40*i, 25);
			pane.getChildren().add(bruh);
		}
			countSort(arr_length, 1);
			text_area.setText("Count sorting the 1 time !!!!");
			n = 1;
			 
	}

	public static void nextStep() {
		if (n < 4) {
			n = n+1;
		}
		for (int i = 0; i < n; i+=1) { 
			countSort(8,(int) Math.pow(10, i));}
		}
	
	public static void prevStep() {
		if (n > 0) {
			n = n-1;
		} for (int i = 0; i < n; i+=1) { 
			countSort(8,(int) Math.pow(10, i));}
		
	}
	static int getMax(int arr[], int n)
	{
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	static void countSort(int n, int exp) {
		int b = (int)Math.log10(exp) + 1;
		text_area.setText("Count sorting the "+ b + " time !!!!");
		lb.setText(b + "/" + 4);
		pane.getChildren().clear();
		for (int i = 0 ; i < 10; i++) {
			Square bruh = drawSquare(i);
			bruh.setFill("#e8e8e8");
			bruh.setAxis(15+40*i, 250);
			pane.getChildren().add(bruh);
		}
	 
		int output[] = new int[n]; 
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);
		for (i = 0; i < n; i++){
			count[(array[i] / exp) % 10]++;
			Square bruh = drawSquare(array[i]);
			bruh.setAxis(15 + ((array[i] / exp) % 10)*40,250 - 40*count[(array[i] / exp) % 10]);
			pane.getChildren().add(bruh);
		} 

		for (i = 1; i < 10; i++) {
			count[i] += count[i - 1];}

		for (i = n - 1; i >= 0; i--) {
			output[count[(array[i] / exp) % 10] - 1] = array[i];
			count[(array[i] / exp) % 10]--;
		
		}

		
		for (i = 0; i < n; i++) {
			array[i] = output[i];}
		
		
	
		for (int k =0; k<8;k++) {
			Square bruh = drawSquare(array[k]);
			bruh.setAxis(30+40*k, 25);
			pane.getChildren().add(bruh);
		}
	}
	
		
	
	
	
	public static void main(String[] args) {
		
	}
	
	private static Square drawSquare(int value) {
		Square burh = new Square(value);
		return burh;
	}
	public static int getCurrent() {
		return n;
	}
	public static int getMaxStep() {
		if (getMax(array, arr_length) < 10) {
			return 1;
		} else if (getMax(array, arr_length) < 100 && getMax(array, arr_length) >= 10) {
			return 2;
		}else if (getMax(array, arr_length) < 1000 && getMax(array, arr_length) >= 100) {
			return 3;
	} else {
		return 4;
	}
	}}


