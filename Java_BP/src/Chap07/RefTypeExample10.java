package Chap07;

/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ��ü�� ĳ��Ʈ �ϱ� ���� instanceof �����ڷ� �˻��ϴ� ��
 * ���� 7-13
 */
public class RefTypeExample10 {
	public static void main(String[] args){
		Account obj1 = new CheckingAccount("111-22-33333333","ȫ�浿",10000000,"4444-5555-6666-7777");
		if(obj1 instanceof CheckingAccount)
			pay((CheckingAccount)obj1);
		else
			System.out.println("ĳ��Ʈ �� �� ���� Ÿ���Դϴ�.");
		
		
		
	}
	
	static void pay(CheckingAccount obj){
		try{
			int amount = obj.pay("5555-6666-7777-8888",47000);
			System.out.println(amount);
			System.out.println(obj.cardNo);
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
}
