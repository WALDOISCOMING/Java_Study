package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * LinkedList에 데이터를 삽입/수정/삭제하는 예
 * 예제 13-5
 */
public class LinkedListExample2 {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");
		list.set(0, "오렌지");
		int num = list.size();
		for(int cnt=0;cnt<num;cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
		
	}
}
