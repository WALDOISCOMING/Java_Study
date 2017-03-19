package Chap18.kr.co.asw;


/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * Runnable 인터페이스를 구현하는 numbers의 서브 클래스, 이미 extends를 해서 thread를 extends할 수 없다,
 * 예제 18-8
 */

public class NumbersRunnable extends Chap18.kr.co.bsw.Numbers implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		list(1,30);
	}

}
