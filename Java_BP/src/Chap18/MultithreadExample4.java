package Chap18;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 원주율을 계산해서 출력하는 멀티스레드 프로그램(미완성)
 * 예제 18-9
 * 예제 18-10: 원주율을 계산 해서 출력하는 멀티스레드 프로그램(완성)
 */
public class MultithreadExample4 {
	public static void main(String[] args){
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	}
}
