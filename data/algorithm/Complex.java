package algorithm;

public class Complex {
	private double realPart;
	private double imagPart;
	
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

	public Complex() {
		realPart = 0;
		imagPart = 0;
	}

	public Complex(double realPart, double imagPart) {
		this.realPart = realPart;
		this.imagPart = imagPart;
	}

	public void init(double realPart, double imagPart) {
		this.setRealPart(realPart);
		this.setImagPart(imagPart);
	}

	// �����ӷ�
	public Complex add(Complex x, Complex y) {

		double a = x.getRealPart();
		double b = x.getImagPart();
		double c = y.getRealPart();
		double d = y.getImagPart();

		this.setRealPart(a + c);
		this.setImagPart(b + d);

		return this;
	}

	// �����˷�
	public Complex multiply(Complex x, Complex y) {

		double a = x.getRealPart();
		double b = x.getImagPart();
		double c = y.getRealPart();
		double d = y.getImagPart();

		this.setRealPart((a * c) - (b * d));
		this.setImagPart((b * c) + (a * d));

		return this;
	}

	// ��������
	public Complex devision(Complex x, Complex y) {

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
}