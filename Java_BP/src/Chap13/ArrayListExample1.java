package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * ArrayList 클래스의 사용 예를 보여주는 프로그램
 * 예제 13-1
 */
public class ArrayListExample1 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num = list.size();
		for(int cnt=0;cnt<num;cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
