package Chap08.math;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * private 필드와 메소드 포함하는 클래스 예
 * 예제 8-10
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
