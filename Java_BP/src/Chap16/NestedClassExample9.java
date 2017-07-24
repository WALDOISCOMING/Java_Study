package Chap16;


/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 이름 없는 이너 클래스의 예(1)
 * 예제 16-16
 */
public class NestedClassExample9 {
	public static void main(String[] args){
		
		MessageSender obj = new MessageSender() {
			
			@Override
			void send(String message) {
				System.out.println("발신:마이다스");
				System.out.println("수신:빌게이츠");
				System.out.println(message);
			}
		};
		obj.send("굿모닝");
		
				
	}
}
