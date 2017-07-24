package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * HashMap 클래스의 사용 예를 보여주는 프로그램(2)
 * 예제 13-12
 * 예제 13-13: Name 클래스에 대해 hasCode 메소드를 호출하는 프로그램
 */
public class HashMapExample2 {
	public static void main(String[] args){
		HashMap<Name,Integer> hashtable = new HashMap<Name,Integer>();
		hashtable.put(new Name("해리", "포터"),new Integer(95));
		hashtable.put(new Name("헤르미온느","그레인져"),new Integer(100));
		hashtable.put(new Name("론","위즐리"),new Integer(85));
		hashtable.put(new Name("드레이코","말포이"),new Integer(93));
		hashtable.put(new Name("네빌","롱바텀"),new Integer(70));
		Integer num = hashtable.get(new Name("헤르미온느","그레인져"));
		System.out.println(num);
		
		Name obj1 = new Name("헤르미온느","그레인져");
		Name obj2 = new Name("헤르미온느","그레인져");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
	}
}
