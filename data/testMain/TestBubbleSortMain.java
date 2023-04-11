package testMain;

import java.util.Arrays;
import test.TestBubbleSort;

public class TestBubbleSortMain {

	public static void main(String[] args) {
		TestBubbleSort test = new TestBubbleSort();

		int[] value = { 3, 1, 6, 8, 9, 0, 7, 4, 5, 2 };
		System.out.println("0лкеепР:" + Arrays.toString(value));

		// test.bubbleSort(value);
		test.betterBubbleSort(value);
	}
}