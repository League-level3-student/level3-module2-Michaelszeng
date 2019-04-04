package _02_More_Algorithms;

import java.util.List;

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
}
