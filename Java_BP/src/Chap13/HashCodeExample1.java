package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * hashcode 메소드의 사용 예를 보여주는 프로그램
 * 예제 13-10
 */
public class HashCodeExample1 {
	public static void main(String[] args){
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
		
	}
}
