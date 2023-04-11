package testMain;

import java.util.Arrays;
import test.TestBinarySearch;

public class TestBinarySearchMain {

	public static void main(String[] args) {
		TestBinarySearch test=new TestBinarySearch();
		
		int[] arr = { 30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8 };
		int searchNumber = 30;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(searchNumber + "ÔªËØµÄË÷Òı:" + test.binarySearch(arr, searchNumber));
	}
}