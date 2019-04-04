package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] x = {"Rat", "hat", "mat", "sock", "Rock", "dog", "no", "more", "ideas"};
		int y = 5;
		assertEquals(_00_LinearSearch.linearSearch(x, "dog"), y);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] x = {1, 5, 23, 65, 76, 77, 78, 213, 234, 235, 1655, 2453, 2574, 456356, 34565465, 213424535};
		int y = 2453;
		assertEquals(_01_BinarySearch.binarySearch(x, 0, x.length-1, y), 11);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] x = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58, 61};
		assertEquals(_02_InterpolationSearch.interpolationSearch(x, 10), 3);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] x = {0, 1, 5, 34, 65, 67, 78, 89, 95, 345, 546, 547, 576, 666, 887, 898, 965, 35666, 1235573};
		int y = 17;
		assertEquals(_03_ExponentialSearch.exponentialSearch(x, 35666), y);
	}
}
