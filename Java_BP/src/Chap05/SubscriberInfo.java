package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * �ΰ��� �����ڸ� ������ ������ ���� Ŭ����
 * ���� 5-6
 * ���� 5-8: �Ķ���� ������ �̸��� �ٸ��ٰ� �ٸ��� ���� ���� �ʴ´ٸ� �� �����ִ� ��
 * ���� 5-10: no-arg �����ڸ� �߰�.
 * ���� 5-11: �����ڿ��� �����ڸ� ȣ��
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
