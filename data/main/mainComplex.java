package main;

import algorithm.complex;

public class mainComplex {
	// 计算(8+6i)*(4+3i) / ((8+6i)+(4+3i))
	public static void main(String[] args) {

		complex a = new complex(8, 6);
		complex b = new complex(4, 3);

		complex z1 = new complex();
		complex z2 = new complex();
		complex z3 = new complex();

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