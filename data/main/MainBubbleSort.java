package main;

import java.util.Arrays;

import algorithm.BubbleSort;

public class MainBubbleSort {

	public static void main(String[] args) {
		BubbleSort test = new BubbleSort();

		int[] value = { 3, 1, 6, 8, 9, 0, 7, 4, 5, 2 };
		System.out.println("0лкеепР:" + Arrays.toString(value));

		// test.bubbleSort(value);
		test.betterBubbleSort(value);
	}
}