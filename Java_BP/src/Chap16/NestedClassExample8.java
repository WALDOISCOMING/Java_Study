package Chap16;


/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * �ٸ� Ŭ������ ��ʤ� �޴� ���� �̳� Ŭ������ ��
 * ���� 16-15
 */
public class NestedClassExample8 {
	public static void main(String[] args){
		
		class SateliteSender extends MessageSender{

			@Override
			void send(String message) {
				// TODO Auto-generated method stub
				System.out.println("�߽�:���̴ٽ�");
				System.out.println("����:��������");
				System.out.println(message);
			}
			
		}
		SateliteSender s = new SateliteSender();
		s.send("�¸��");
				
	}
}
