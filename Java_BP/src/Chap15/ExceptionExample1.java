package Chap15;

/*
 * �ۼ�����:2017_03_17
 * �ۼ���:����
 * checked exception�� unchecked exception�� �߻��ϴ� ���α׷�
 * ���� 15-1
 */
public class ExceptionExample1 {
	public static void main(String[] args){
		int sum = 1+ -2;
		if(sum<0)
		//	throw new Exception("���� �߻�");
		System.out.println(sum);
	}
}
