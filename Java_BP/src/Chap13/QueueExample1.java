package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * LinkedList 클래스를  큐로 사용 하느 ㄴ 것.
 * 예제 13-8
 */
public class QueueExample1 {
	public static void main(String[] args){
		LinkedList<String> que = new LinkedList<String>();
		que.offer("토끼");
		que.offer("사슴");
		que.offer("호랑이");
		while(!que.isEmpty()){
			String str = que.poll();
			System.out.println(str);
		
		}
		
	}
}
