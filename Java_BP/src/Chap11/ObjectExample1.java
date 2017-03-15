package Chap11;

import java.io.File;

/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * toString 메소드의 사용 예를 보여주는 프로그램(1)
 * 예제 11-1
 */
public class ObjectExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/Chap11/뻐꾸기.txt");
		String str = file.toString();
		System.out.println(str);
	}

}
