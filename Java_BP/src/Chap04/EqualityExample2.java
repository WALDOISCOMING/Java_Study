package Chap04;

import java.math.BigDecimal;

/*
 * �ۼ�����:2017_03_08
 * �ۼ���:����
 * ��ġ �� �������� ��� ���� �����ִ� ���α׷�
 * ���� 4-12
 */
public class EqualityExample2 {
	public static void main(String[] args){
	double num1=1.1+2.2;
	double num2 = 3.3;
	if(num1==num2)
		System.out.println("same");
	else
		System.out.println("not same");
	
	BigDecimal big1 = new BigDecimal(1.1);
	BigDecimal big2 = new BigDecimal(2.2);
	BigDecimal big3 = new BigDecimal(3.3);
	System.out.println(big1.add(big2));
	System.out.println(big3);
	big1 = big1.add(big2);
	if(big1.equals(big3))
		System.out.println("same");
	else
		System.out.println("not same");
	
	}
}
