package Chap18;
/*
 * 작성일자:2017_03_20
 * 작성자:길경완
 * notifyall 메소드의 사용 예를 보여주는 프로그램
 * 예제 18-17
 */
public class MultithreadExample8 {
	public static void main(String[] args){
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		SimplePrintThread thread3 = new SimplePrintThread();
		LuxuryPrintThread thread4 = new LuxuryPrintThread();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread3.sharedArea = obj;
		thread4.sharedArea = obj;
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
