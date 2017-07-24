package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * HashSet의 사용 예를 보여주는 프로그램
 * 예제 13-16
 */
public class SetExample1 {
	public static void main(String[] args){
		HashSet<String> set = new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println(set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
