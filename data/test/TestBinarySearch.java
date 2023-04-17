package test;

public class TestBinarySearch {

	/**
	 * 二分查找基础版
	 * 
	 * @param: array  -待查找的升序数组
	 * @param: target -待查找的目标值
	 * @return: 找到返回索引，找不到返回-1
	 * 
	 */
	public int binarySearchBasic(int[] array, int target) {
		int i = 0, j = array.length - 1;// 设置指针和初值

		while (i <= j) {
			// 要使用无符号右移运算，不能使用/2，会导致结果溢出，Java整数相除会自动向下取整
			int m = (i + j) >>> 1;

			if (target < array[m])/* 目标在左边 */ {
				j = m - 1;
			} else if (array[m] < target)/* 目标在右边 */ {
				i = m + 1;
			} else {
				return m;
			}
		}

		return -1;
	}

	/*
	 * 问题1
	 * 
	 * 问题3：都写成小于号有什么好处 比较的变量和升序数组的顺序一样
	 * 
	 * 
	 */

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