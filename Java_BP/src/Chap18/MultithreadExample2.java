package Chap18;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 네 개의 스레드로 실해왿는 멀티 스레드 프로그램ㄴ
 * 예제 18-4
 */
public class MultithreadExample2 {
	public static void main(String[] args){
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
