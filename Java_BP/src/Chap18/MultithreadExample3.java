package Chap18;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 한글 자음과 영문 소문자를 동시에 출력하는 멀티 스레드 프로그램(미완성)
 * 예제 18-5
 */
public class MultithreadExample3 {
	public static void main(String[] args){
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch:arr)
			System.out.print(ch);
		
	}
}
