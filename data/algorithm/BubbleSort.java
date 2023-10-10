package algorithm;

import java.util.Arrays;

public class BubbleSort {

	// ð������
	public void bubbleSort(int[] values) {
		int temp;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length - 1 - i/* -i���Ѿ��ź��������, -1���������������������1 */; j++) {
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
			System.out.println((i + 1) + "������:" + Arrays.toString(values));
		}
	}

	// �Ż���ð������
	public void betterBubbleSort(int[] values) {
		int temp;

		for (int i = 0; i < values.length; i++) {
			// ����һ��boolean����flag,��������Ƿ��Ѵﵽ����״̬
			boolean flag = true;
			// �ڲ�ѭ��,ÿһ��ѭ�����������ǰ����Ԫ�ؿ�ʼ�Ƚ�,�Ƚϵ�������������
			for (int j = 0; j < values.length - 1 - i; j++) {
				// ���ǰһ��Ԫ�ش��ں�һ��Ԫ��,�򽻻���Ԫ�ص�ֵ
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
					// ���˷����˽���,�����������ڱ��˴�������״̬,��Ҫ�����Ƚ�
					flag = false;
				}
			}

			// ����flag�ж������Ƿ�����,����������˳�,����,�����ѭ��
			if (flag) {
				break;
			}

			System.out.println((i + 1) + "������:" + Arrays.toString(values));
		}
	}
}