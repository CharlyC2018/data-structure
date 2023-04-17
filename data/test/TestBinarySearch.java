package test;

public class TestBinarySearch {

	/**
	 * ���ֲ��һ�����
	 * 
	 * @param: array  -�����ҵ���������
	 * @param: target -�����ҵ�Ŀ��ֵ
	 * @return: �ҵ������������Ҳ�������-1
	 * 
	 */
	public int binarySearchBasic(int[] array, int target) {
		int i = 0, j = array.length - 1;// ����ָ��ͳ�ֵ

		while (i <= j) {
			// Ҫʹ���޷����������㣬����ʹ��/2���ᵼ�½�������Java����������Զ�����ȡ��
			int m = (i + j) >>> 1;

			if (target < array[m])/* Ŀ������� */ {
				j = m - 1;
			} else if (array[m] < target)/* Ŀ�����ұ� */ {
				i = m + 1;
			} else {
				return m;
			}
		}

		return -1;
	}

	/*
	 * ����1
	 * 
	 * ����3����д��С�ں���ʲô�ô� �Ƚϵı��������������˳��һ��
	 * 
	 * 
	 */

	public int binarySearchAlternative(int[] array, int target) {
		int i = 0, j = array.length;

		while (i < j) {

			int m = (i + j) >>> 1;

			if (target < array[m])/* Ŀ������� */ {
				j = m;
			} else if (array[m] < target)/* Ŀ�����ұ� */ {
				i = m + 1;
			} else {
				return m;
			}
		}

		return -1;
	}
}