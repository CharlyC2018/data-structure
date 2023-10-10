package main;

import java.util.Arrays;

import algorithm.bubbleSort;

public class mainBubbleSort {

	public static void main(String[] args) {
		bubbleSort test = new bubbleSort();

		int[] value = { 3, 1, 6, 8, 9, 0, 7, 4, 5, 2 };
		System.out.println("0лкеепР:" + Arrays.toString(value));

		// test.bubbleSort(value);
		test.betterBubbleSort(value);
	}
}