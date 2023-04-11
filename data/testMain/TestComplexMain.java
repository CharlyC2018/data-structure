package testMain;

import test.TestComplex;

public class TestComplexMain {
	// 计算(8+6i)*(4+3i) / ((8+6i)+(4+3i))
	public static void main(String[] args) {

		TestComplex a = new TestComplex(8, 6);
		TestComplex b = new TestComplex(4, 3);

		TestComplex z1 = new TestComplex();
		TestComplex z2 = new TestComplex();
		TestComplex z3 = new TestComplex();

		// z1计算(8+6i)*(4+3i)
		z1.multiply(a, b);
		z1.paint("z1");

		// z2计算(8+6i)+(4+3i)
		z2.add(a, b);
		z2.paint("z2");

		// z2.init(0, 0);
		// z2.init(1, 0);
		// z2.init(0, 1);

		// z3计算(8+6i)*(4+3i) / ((8+6i)+(4+3i))
		z3.devision(z1, z2);
		z3.paint("z3");
	}
}