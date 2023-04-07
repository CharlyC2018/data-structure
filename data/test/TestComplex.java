package test;

public class TestComplex {
	private double realPart;
	private double imagPart;

	public TestComplex() {
		realPart = 0;
		imagPart = 0;
	}

	public TestComplex(double realPart, double imagPart) {
		this.realPart = realPart;
		this.imagPart = imagPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public double getImagPart() {
		return imagPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public void setImagPart(double imagPart) {
		this.imagPart = imagPart;
	}

	public void init(double realPart, double imagPart) {
		this.realPart = realPart;
		this.imagPart = imagPart;
	}

	// �����ӷ�
	public TestComplex add(TestComplex x, TestComplex y) {

		double a = x.getRealPart();
		double b = x.getImagPart();
		double c = y.getRealPart();
		double d = y.getImagPart();

		this.setRealPart(a + c);
		this.setImagPart(b + d);

		return this;
	}

	// �����˷�
	public TestComplex multiply(TestComplex x, TestComplex y) {

		double a = x.getRealPart();
		double b = x.getImagPart();
		double c = y.getRealPart();
		double d = y.getImagPart();

		this.setRealPart((a * c) - (b * d));
		this.setImagPart((b * c) + (a * d));

		return this;
	}

	// ��������
	public TestComplex devision(TestComplex x, TestComplex y) {

		/* ʵ�����鲿ȫΪ���û������ */
		if (y.getRealPart() == 0 && y.getImagPart() == 0) {
			System.out.println("����Ϊ0��û������");
			return null;
		}

		double a = x.getRealPart();
		double b = x.getImagPart();
		double c = y.getRealPart();
		double d = y.getImagPart();

		this.setRealPart(((a * c) + (b * d)) / ((c * c) + (d * d)));
		this.setImagPart(((b * c) - (a * d)) / ((c * c) + (d * d)));

		return this;
	}

	// ��ӡ����
	public void paint(String x) {
		System.out.println(x + ":" + this.getRealPart() + "+" + this.getImagPart() + "i");
	}

	// ����(8+6i)*(4+3i) / ((8+6i)+(4+3i))
	public static void main(String[] args) {

		TestComplex a = new TestComplex(8, 6);
		TestComplex b = new TestComplex(4, 3);

		TestComplex z1 = new TestComplex();
		TestComplex z2 = new TestComplex();
		TestComplex z3 = new TestComplex();

		// z1����(8+6i)*(4+3i)
		z1.multiply(a, b);
		z1.paint("z1");

		// z2����(8+6i)+(4+3i)
		z2.add(a, b);
		z2.paint("z2");

		//z2.init(0, 0);
		// z2.init(1, 0);
		// z2.init(0, 1);

		// z3����(8+6i)*(4+3i) / ((8+6i)+(4+3i))
		z3.devision(z1, z2);
		z3.paint("z3");

	}
}