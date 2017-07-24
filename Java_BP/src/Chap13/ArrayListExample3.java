package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * ArrayList의 데이터를 검색하는 예
 * 예제 13-3
 */
public class ArrayListExample3 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("마루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		int index1 = list.indexOf("사과");
		int index2 = list.indexOf("사과");
		int index3 = list.lastIndexOf("사과");
		int num = list.size();
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
	}
}
