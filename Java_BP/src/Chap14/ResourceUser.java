package Chap14;

public class ResourceUser {
	public ResourceUser() {
	System.out.println("시스템 자원을 할당 받습니다.");
		// TODO Auto-generated constructor stub
	}
	void use(){
		System.out.println("시스템 자원을 사용합니다.");
	}
	protected void finalize(){
		System.out.println("시스템 자원의 할당을 해제합니다.");
	}
}
