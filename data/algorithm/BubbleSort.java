package algorithm;

import java.util.Arrays;

public class BubbleSort {

	// 冒泡排序
	public void bubbleSort(int[] values) {
		int temp;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length - 1 - i/* -i是已经排好序的数量, -1是排序次数比排序数量少1 */; j++) {
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
			System.out.println((i + 1) + "趟排序:" + Arrays.toString(values));
		}
	}

	// 优化版冒泡排序
	public void betterBubbleSort(int[] values) {
		int temp;

		for (int i = 0; i < values.length; i++) {
			// 定义一个boolean变量flag,标记数组是否已达到有序状态
			boolean flag = true;
			// 内层循环,每一趟循环都从数组的前两个元素开始比较,比较到无序数组的最后
			for (int j = 0; j < values.length - 1 - i; j++) {
				// 如果前一个元素大于后一个元素,则交换两元素的值
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
					// 本趟发生了交换,表明该数组在本趟处于无序状态,需要继续比较
					flag = false;
				}
			}

			// 根据flag判断数组是否有序,如果有序则退出,无序,则继续循环
			if (flag) {
				break;
			}

			System.out.println((i + 1) + "趟排序:" + Arrays.toString(values));
		}
	}
}