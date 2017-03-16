package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * LinkedList 클래스를 스택으로 사용하는 예
 * 예제 13-7
 */
public class StackExample1 {
	public static void main(String[] args){
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		while(!stack.isEmpty()){
			Integer num = stack.removeLast();
			System.out.println(num);
		}
	}
}
