package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * StringBuffer 객체를 생성하고 사용하는 프로그램의 예
 * 예제 5-1
 */
public class ObjectExample1 {
	public static void main(String[] args){
		StringBuffer obj;
		obj = new StringBuffer("Hey Java");
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1,'i');
		System.out.println(obj);
	}
}
