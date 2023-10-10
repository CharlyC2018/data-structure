package main;

import java.util.Arrays;

import algorithm.binarySearch;

public class mainBinarySearch {

	public static void main(String[] args) {
		binarySearch test = new binarySearch();

		int[] arr = { 30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8 };
		int searchNumber = 30;

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println(searchNumber + "ÔªËØµÄË÷Òı:" + test.binarySearchBasic(arr, searchNumber));
	}
}