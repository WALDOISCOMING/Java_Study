package Chap16;


/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * �̸� ���� �̳� Ŭ������ ��(1)
 * ���� 16-16
 */
public class NestedClassExample9 {
	public static void main(String[] args){
		
		MessageSender obj = new MessageSender() {
			
			@Override
			void send(String message) {
				System.out.println("�߽�:���̴ٽ�");
				System.out.println("����:��������");
				System.out.println(message);
			}
		};
		obj.send("�¸��");
		
				
	}
}
