package algorithm;

public class binarySearch {

	/**
	 * 二分查找基础版
	 * 
	 * @param: array  -待查找的升序数组
	 * @param: target -待查找的目标值
	 * @return: 找到返回索引，找不到返回-1
	 */

	public int binarySearchBasic(int[] array, int target) {

		int i = 0, j = array.length - 1;// 设置指针和初值
		while (i <= j) {// i~j范围内有东西
			int m = (i + j) >>> 1;
			if (target < array[m]) {// 目标在左边
				j = m - 1;
			} else if (array[m] < target) {// 目标在右边
				i = m + 1;
			} else {
				return m;// 找到了
			}
		}
		return -1;
	}
	/* Q：为什么是 i <= j 意味着区间内有未比较元素，而不是 i < j 
	 * A:i < j 意味着只有m指向的元素参与比较
	 * 	 i == j 意味着i,j指向的元素也会参与比较
	 * */
	
	/* Q：(i + j) / 2 有没有问题？
	 * Q:都写成小于号有什么好处？
	 * */

	public int binarySearchAlternative(int[] array, int target) {
		int i = 0, j = array.length;
		while (i < j) {
			int m = (i + j) >>> 1;
			if (target < array[m])/* 目标在左边 */ {
				j = m;
			} else if (array[m] < target)/* 目标在右边 */ {
				i = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}
}