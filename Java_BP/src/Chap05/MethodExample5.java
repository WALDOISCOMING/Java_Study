package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �ͼ��� �߻��ϴ� withdraw ȣ��
 * ���� 5-30
 */
public class MethodExample5 {
	public static void main(String[] args){
		Account obj = new Account("777-777-7777777","��",10);
		try{
			int amount =  obj.withdraw(10000000);
			System.out.println(amount);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
