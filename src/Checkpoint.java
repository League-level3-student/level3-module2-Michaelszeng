import java.util.Collections;

public class Checkpoint {
	public static void main(String[] args) {
		Double[] list = {2.0, 4.0, 1.0, 2.2, 15.9, 23.7, 11.5, 3.8};
		sort(list);
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		int[] intList = {1, 2, 3, 5, 8, 23, 34, 45, 56, 68, 79, 90, 123};
		System.out.println(binarySearch(intList, 56, 0, intList.length-1));
	}
	
	public static void sort(Double[] list) {
		for (int i=0; i<list.length; i++) {
			for (int j=i; j>0; j--) {
				if (list[j] > list[j-1]) {
					Double temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}
			}
		}
	}
	
	public static boolean binarySearch(int[] list, int num, int start, int end) {
		int mid = (start+end)/2;
		if (num == list[mid]) {
			return true;
		}
		else if (end <= start) {
			return false;
		}
		else if (num > list[mid]) {
			binarySearch(list, num, mid, end);
		}
		else if (num < list[mid]) {
			binarySearch(list, num, 0, mid);
		}
		return false;
	}
}
