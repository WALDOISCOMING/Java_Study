package Chap08.math;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * private �ʵ�� �޼ҵ� �����ϴ� Ŭ���� ��
 * ���� 8-10
 */
class Fraction {
	private int numerator;
	
	private int denominator;
	Fraction(int numerator,int denominator) {
		this.numerator=numerator;this.denominator=denominator;
		// TODO Auto-generated constructor stub
	}
	private double getDouble() {
		return (double)numerator/denominator;
	}
	private int getInt() {
		return (int)getDouble();
	}

}
