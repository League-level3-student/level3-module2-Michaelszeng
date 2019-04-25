package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i=0; i<eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i=0; i<oysters.size(); i++) {
			if (oysters.get(i)) {
				pearls++;
			}
		}
		return pearls;
	}
	
	public static double findTallest(List<Double> peeps) {
		Double tallest = peeps.get(0);
		for (int i=1; i<peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		int longestIndex = 0;
		for (int i=1; i<words.size(); i++) {
			if (words.get(i).length() > words.get(longestIndex).length()) {
				longestIndex = i;
			}
		}
		return words.get(longestIndex);
	}
	
	public static boolean containsSOS(List<String> message) {
		for (int i=0; i<message.size(); i++) {
			if (message.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> scores) {	
		//1. make a for loop that starts at 1 and goes through 
		// the length of the array
		for (int i=1; i<scores.size(); i++) {
			//2. make another for loop that starts at i and counts down
	       	//   while j is greater than 0
			for (int j=i; j>0; j--) {
				//3. if the element at j is less than the element at j - 1,
	           	//   then swap them
				if (scores.get(j) < scores.get(j-1)) {
					Collections.swap(scores, j, j-1);
				}
			}
				
		}
		return scores;
	}
	
	public static List<String> sortDNA(List<String> dnas) {
		for (int i=1; i<dnas.size(); i++) {
			//2. make another for loop that starts at i and counts down
	       	//   while j is greater than 0
			for (int j=i; j>0; j--) {
				//3. if the element at j is less than the element at j - 1,
	           	//   then swap them
				if (dnas.get(j).length() < dnas.get(j-1).length()) {
					Collections.swap(dnas, j, j-1);
				}
			}
				
		}
		return dnas;
	}
	
	public static List<String> sortWords(List<String> words) {
		for (int i=1; i<words.size(); i++) {
			//2. make another for loop that starts at i and counts down
	       	//   while j is greater than 0
			for (int j=i; j>0; j--) {
				//3. if the element at j is less than the element at j - 1,
	           	//   then swap them
				if (words.get(j-1).compareTo(words.get(j)) > 0) {
					Collections.swap(words, j, j-1);
				}
			}
				
		}
		return words;
	}
}
