package Chap02;
/*
 * 작성일자:2017_03_06
 * 작성자:길경완
 * while을 이용한 반복문
 * 예제 2-4,2-5는 2-4를 주석을 이용하는 것이므로 생략.2-6은 2-4의 공백을 제거하는 것이므로 생략
 */
public class HelloJava10 {
	public static void main(String[] args){
		int num = 0;
		while(num<10){
			System.out.println("Hello, Java"+(num+1)+"번째");
			num++;
		}
	}
}
