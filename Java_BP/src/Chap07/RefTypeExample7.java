package Chap07;

/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ���� Ŭ���� ������ ���� ���� Ŭ���� ������ �����ϴ� �߸��� ���α׷�
 * ���� 7-10
 */
public class RefTypeExample7 {
	public static void main(String[] args){
		Account obj1 = new CheckingAccount("111022033333333","ȫ�浿",10,"4444-5555-6666-7777");
	//	CheckingAccount obj2 = obj1;
		try{
			//int amount = obj.pay("4444-5555-6666-7777",47000);
		//	System.out.println(amount);
		//	System.out.println(obj.cardNo);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}