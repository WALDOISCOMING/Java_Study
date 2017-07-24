package Chap05;
/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 두 생성자를 갖는 클래스의 객체를 생성하는 프로그램
 * 예제 5-7
 * 예제 5-9:파라미터 없는 생성자
 */
public class ContrExample2 {
	public static void main(String[] args){
		SubscriberInfo obj1,obj2,obj3;
		obj1 = new SubscriberInfo("연흥부","poorman","zebi");
		obj2 = new SubscriberInfo("연놀부", "richman","money","02-000-0000","타워펠리스");
		obj3 = new SubscriberInfo();
		printSubscrberInfo(obj1);
		printSubscrberInfo(obj2);
		printSubscrberInfo(obj3);
	}
	static void printSubscrberInfo(SubscriberInfo obj){
		System.out.println("이름:"+obj.name);
		System.out.println("아이디:"+obj.id);
		System.out.println("패스워드:"+obj.password);
		System.out.println("전화번호:"+obj.phoneNo);
		System.out.println("주소:"+obj.address);
		System.out.println("");

	}
}
