package _00_Sorting_Algorithms;
import java.util.Arrays;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] arr) {
		boolean sorted = true;
		int previous = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i < previous) {
				sorted = false;
			}
			previous = i;
		}
		return sorted;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] arr) {
		boolean sorted = true;
		double previous = Integer.MIN_VALUE;
		for (double d : arr) {
			if (d < previous) {
				sorted = false;
			}
			previous = d;
		}
		return sorted;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] arr) {
		boolean sorted = true;
		double previous = Integer.MIN_VALUE;
		for (char c : arr) {
			if (c < previous) {
				sorted = false;
			}
			previous = c;
		}
		return sorted;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] arr) {
		boolean sorted = true;
		String previous = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		for (String s : arr) {
			if (s.compareTo(previous) < 0) {
				sorted = false;
			}
			previous = s;
		}
		return sorted;
	}
}
