package test;

public class TestBinarySearch {

	public int binarySearch(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;
		int count= 0;
		while (low <= high) {
			count++;
			int middle = (low + high) / 2;
			if (value == array[middle]) {
				System.out.println("count:"+count);
				return middle;
			}

			if (value > array[middle]) {
				System.out.println("count:"+count);
				low = middle + 1;
			}

			if (value < array[middle]) {
				System.out.println("count:"+count);
				high = middle - 1;
			}
		}
		System.out.println("count:" + count);
		return -1;
	}
}