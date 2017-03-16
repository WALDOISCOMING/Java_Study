package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * Iterator
 * 예제 13-6
 */
public class LinkedListExample3 {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		Iterator<String> interator = list.iterator();
		int num = list.size();
		while(interator.hasNext()){
			String str = interator.next();
			System.out.println(str);
			System.out.println(interator);
		}
		
	}
}
