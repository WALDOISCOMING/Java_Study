package Chap16;

import java.util.HashMap;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 연락처 프로그램과 연락처 클래스
 * 예제 16-12
 */
public class ContactInfoExample {
	public static void main(String[] args){
		HashMap<String,ContactInfo> hashtable = new HashMap<String,ContactInfo>();
		hashtable.put("이순희",new ContactInfo("서울시 강남구","02-457-0000"));
		hashtable.put("한지영",new ContactInfo("서울시 성복구","02-920-0000"));
		hashtable.put("박철규",new ContactInfo("경기도 고양시","031-915-0000"));
		ContactInfo obj = hashtable.get("한지영");
		System.out.println(obj.address);
		System.out.println(obj.phoneNo);
	}
}
