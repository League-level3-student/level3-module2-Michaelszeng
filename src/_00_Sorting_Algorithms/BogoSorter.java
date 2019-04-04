package _00_Sorting_Algorithms;

import java.util.Random;
import java.lang.Math;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while (true) {
			display.updateDisplay();
			boolean sorted = true;
			for (int i=1; i<array.length-1; i++) {
				if (array[i] < array[i-1]) {
					sorted = false;
				}
			}
			if (sorted) {
				break;
			}
			int ranIndex1 = (int) (Math.random() * array.length);
			int ranIndex2 = (int) (Math.random() * array.length);
			int temp = array[ranIndex1]; 
			array[ranIndex1] = array[ranIndex2];
			array[ranIndex2] = temp;
		}
	}
}
