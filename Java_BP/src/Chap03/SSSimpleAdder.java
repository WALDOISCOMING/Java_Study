package Chap03;

import java.math.BigDecimal;

/*
 * �ۼ�����:2017_03_07
 * �ۼ���:����
 * ������ ���� ǥ���� �� �𸣰� �ۼ����� ���α׷�2
 * ���� 3-3
 */
public class SSSimpleAdder {
	public static void main(String[] args){
		double num;
		num = 3.14+1;
		System.out.println(num);
		BigDecimal big1 = new BigDecimal(3.14);
		BigDecimal big2 = new BigDecimal(1);
		System.out.println(big1);
		System.out.println(big1.add(big2));
		
		
	}
}
