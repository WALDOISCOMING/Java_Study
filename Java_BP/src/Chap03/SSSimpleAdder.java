package Chap03;

import java.math.BigDecimal;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 데이터 내부 표현을 잘 모르고 작성ㅍ한 프로그램2
 * 예제 3-3
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
