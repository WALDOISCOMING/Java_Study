package Chap09;
import java.util.*;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * Random 클래스를 ㅅ이용하여 난수를 발생하는 프로그램(1)
 * 예제 9-20
 */


public class RandomExample1 {
	public static void main(String[] args){
		 Random random = new Random();
		 System.out.println(random.nextInt(100));
		 System.out.println(random.nextInt(100));
		 System.out.println(random.nextInt(100));
		
	}
}
