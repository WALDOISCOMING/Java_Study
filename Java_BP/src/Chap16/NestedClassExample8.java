package Chap16;


/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 다른 클래스를 사옷ㄱ 받는 로컬 이너 클래스의 예
 * 예제 16-15
 */
public class NestedClassExample8 {
	public static void main(String[] args){
		
		class SateliteSender extends MessageSender{

			@Override
			void send(String message) {
				// TODO Auto-generated method stub
				System.out.println("발신:마이다스");
				System.out.println("수신:빌게이츠");
				System.out.println(message);
			}
			
		}
		SateliteSender s = new SateliteSender();
		s.send("굿모닝");
				
	}
}
