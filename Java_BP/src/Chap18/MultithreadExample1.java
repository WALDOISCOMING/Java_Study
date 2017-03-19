package Chap18;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 알파벳과 숫자를 동시에 출력하는 멀티 스레드 프로그램(미완성)
 * 예제 18-1
 * 예제 18-2: 알파벳과 숫자르 동시에 출력하는 멀티 스레드 프로그램(1)
 * 예제 18-3: 알파벳과 숫자를 동시에 출력하는 멀티 스레드 프로그램(2)
 */
public class MultithreadExample1 {
	public static void main(String[] args){
		Thread thread = new DigitThread();
		thread.start();
		
		for(char ch='A';ch<='Z';ch++){
			System.out.println(ch);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
