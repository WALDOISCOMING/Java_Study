package Chap18.kr.co.asw;


/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * Runnable �������̽��� �����ϴ� numbers�� ���� Ŭ����, �̹� extends�� �ؼ� thread�� extends�� �� ����,
 * ���� 18-8
 */

public class NumbersRunnable extends Chap18.kr.co.bsw.Numbers implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		list(1,30);
	}

}
