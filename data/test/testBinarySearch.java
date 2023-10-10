package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import algorithm.binarySearch;

class testBinarySearch {
	binarySearch test = new binarySearch();

	@Test
	@DisplayName("²âÊÔBasic,ÕÒµ½")
	public void test1() {
		int[] a = { 7, 8, 9, 10, 12, 20, 30, 40, 50, 80, 100 };
		assertEquals(0, test.binarySearchBasic(a, 7));
		assertEquals(1, test.binarySearchBasic(a, 8));
		assertEquals(2, test.binarySearchBasic(a, 9));
		assertEquals(3, test.binarySearchBasic(a, 10));
		assertEquals(4, test.binarySearchBasic(a, 12));
		assertEquals(5, test.binarySearchBasic(a, 20));
		assertEquals(6, test.binarySearchBasic(a, 30));
		assertEquals(7, test.binarySearchBasic(a, 40));
		assertEquals(8, test.binarySearchBasic(a, 50));
		assertEquals(9, test.binarySearchBasic(a, 80));
		assertEquals(10, test.binarySearchBasic(a, 100));
	}

	@Test
	@DisplayName("²âÊÔBasic,Ã»ÕÒµ½")
	public void test2() {
		int[] a = { 7, 8, 9, 10, 12, 20, 30, 40, 50, 80, 100 };
		assertEquals(-1, test.binarySearchBasic(a, 6));
		assertEquals(-1, test.binarySearchBasic(a, 15));
		assertEquals(-1, test.binarySearchBasic(a, 105));
	}

	@Test
	@DisplayName("²âÊÔAlternative,ÕÒµ½")
	public void test3() {
		int[] a = { 7, 8, 9, 10, 12, 20, 30, 40, 50, 80, 100 };
		assertEquals(0, test.binarySearchAlternative(a, 7));
		assertEquals(1, test.binarySearchAlternative(a, 8));
		assertEquals(2, test.binarySearchAlternative(a, 9));
		assertEquals(3, test.binarySearchAlternative(a, 10));
		assertEquals(4, test.binarySearchAlternative(a, 12));
		assertEquals(5, test.binarySearchAlternative(a, 20));
		assertEquals(6, test.binarySearchAlternative(a, 30));
		assertEquals(7, test.binarySearchAlternative(a, 40));
		assertEquals(8, test.binarySearchAlternative(a, 50));
		assertEquals(9, test.binarySearchAlternative(a, 80));
		assertEquals(10, test.binarySearchAlternative(a, 100));
	}

	@Test
	@DisplayName("²âÊÔAlternative,Ã»ÕÒµ½")
	public void test4() {
		int[] a = { 7, 8, 9, 10, 12, 20, 30, 40, 50, 80, 100 };
		assertEquals(-1, test.binarySearchAlternative(a, 6));
		assertEquals(-1, test.binarySearchAlternative(a, 15));
		assertEquals(-1, test.binarySearchAlternative(a, 105));
	}
	
	public static void main(String[] args) {
		int i = 0;
		int j = Integer.MAX_VALUE - 1;
		int m = (i + j) / 2;
		System.out.println(m);

		i = m + 1;
		m = (i + j) >>> 1;
		System.out.println(m);
		
		System.out.println(Integer.toString(15487,2));
		System.out.println(Integer.toBinaryString(15487));
	}
}