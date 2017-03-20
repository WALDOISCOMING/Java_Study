package Chap18;
/*
 * 작성일자:2017_03_20
 * 작성자:길경완
 * notify 메소드와 wait 메소드의 사용 예를 보여주는 원주율 계산 프로그램
 * 예제 18-16
 */
public class MultithreadExample7 {
	public static void main(String[] args){
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	}
}
