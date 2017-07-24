package Chap18;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 계좌 이체와 잔액 합계 출력을 동시에 하는 멀티스레드 프로그램(미완성)
 * 예제 18-12
 * 예쩨 18-13:계좌 이체와 잔액 합계 출력을 동시에 하는 멀티 스레드 프로그램(1)
 */
public class MultithreadExample5 {
	public static void main(String[] args){
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","이몽룡",20000000);
		area.account2 = new Account("222-222-2222","성춘향",10000000);
		TransferThread thread1 = new TransferThread(area);
		printThread thread2 = new printThread(area);
		thread1.start();
		thread2.start();
	}
}
