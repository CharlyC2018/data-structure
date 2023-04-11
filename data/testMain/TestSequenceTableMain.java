package testMain;

import test.TestSequenceTable;

public class TestSequenceTableMain {
	public static void main(String[] args) {
		TestSequenceTable<Integer> test1 = new TestSequenceTable<>();
		test1.initList();
		
		int a= 1;
		test1.insertList(0, a);
		test1.insertList(1, 85);
		test1.listAll();
		test1.listLength();
		System.out.println(test1.listLength());
	}
}