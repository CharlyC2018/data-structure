package main;

import algorithm.Complex;

public class MainComplex {
	// 计算(8+6i)*(4+3i) / ((8+6i)+(4+3i))
	public static void main(String[] args) {

		Complex a = new Complex(8, 6);
		Complex b = new Complex(4, 3);

		Complex z1 = new Complex();
		Complex z2 = new Complex();
		Complex z3 = new Complex();

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