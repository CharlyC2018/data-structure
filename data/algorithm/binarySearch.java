package algorithm;

public class binarySearch {

	/**
	 * ���ֲ��һ�����
	 * 
	 * @param: array  -�����ҵ���������
	 * @param: target -�����ҵ�Ŀ��ֵ
	 * @return: �ҵ������������Ҳ�������-1
	 */

	public int binarySearchBasic(int[] array, int target) {

		int i = 0, j = array.length - 1;// ����ָ��ͳ�ֵ
		while (i <= j) {// i~j��Χ���ж���
			int m = (i + j) >>> 1;
			if (target < array[m]) {// Ŀ�������
				j = m - 1;
			} else if (array[m] < target) {// Ŀ�����ұ�
				i = m + 1;
			} else {
				return m;// �ҵ���
			}
		}
		return -1;
	}
	/* Q��Ϊʲô�� i <= j ��ζ����������δ�Ƚ�Ԫ�أ������� i < j 
	 * A:i < j ��ζ��ֻ��mָ���Ԫ�ز���Ƚ�
	 * 	 i == j ��ζ��i,jָ���Ԫ��Ҳ�����Ƚ�
	 * */
	
	/* Q��(i + j) / 2 ��û�����⣿
	 * Q:��д��С�ں���ʲô�ô���
	 * */

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