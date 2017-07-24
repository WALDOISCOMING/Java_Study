package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 두개의 생성자를 가지는 가입자 정보 클래스
 * 예제 5-6
 * 예제 5-8: 파라미터 변수의 이름만 다르다고 다르게 이해 하지 않는다를 걸 보여주는 예
 * 예졔 5-10: no-arg 생성자를 추가.
 * 예제 5-11: 생성자에서 생성자를 호출
 */
public class SubscriberInfo {
	String name,id,password;
	String phoneNo,address;
	public SubscriberInfo(){
		
	}
	public SubscriberInfo(String name,String id,String password) {
	this.name=name;this.id=id;this.password=password;			
	}
	public SubscriberInfo(String name,String id,String password,String phoneNo,String address) {
	this(name,id,password);this.phoneNo=phoneNo;this.address=address;
	}
	void changePassword(String password){
		this.password = password;
	}
	void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	void setAddress(String address){
		this.address = address;
	}
	
	
}
