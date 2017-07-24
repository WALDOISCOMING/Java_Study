package Chap18;
/*
 * 작성일자:2017_03_20
 * 작성자:길경완
 * 모니터링 스레드가 추가된 원주율 계산 프로그램ㅁ
 * 예제 18-18
 */
public class MultithreadExample9 {
	public static void main(String[] args){
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread();
		printThread thread2 = new printThread();
		MonitorThread thread3 = new MonitorThread(thread1);

		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
		thread3.start();

	}
}
