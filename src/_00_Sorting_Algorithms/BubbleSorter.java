package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		int limit = 1;
		while (true) {
			boolean finished = true;
			for (int i=0; i<arr.length-limit; i++) {
				display.updateDisplay();
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					finished = false;
				}
			}
			limit += 1;
			if (finished == true) {
				break;
			}
		}
	}
	
}
