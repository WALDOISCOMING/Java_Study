package Chap13;
import java.util.*;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * ArrayList에 데이터를 삽입/수정/삭제하는 예
 * 예제 13-2
 */
public class ArrayListExample2 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");
		list.set(0,"오렌지");
		list.remove(1);
		list.remove("키위");
		int num = list.size();
		for(int cnt=0;cnt<num;cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
