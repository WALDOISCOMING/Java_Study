package Chap16;

import java.util.HashMap;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ����ó ���α׷��� ����ó Ŭ����
 * ���� 16-12
 */
public class ContactInfoExample {
	public static void main(String[] args){
		HashMap<String,ContactInfo> hashtable = new HashMap<String,ContactInfo>();
		hashtable.put("�̼���",new ContactInfo("����� ������","02-457-0000"));
		hashtable.put("������",new ContactInfo("����� ������","02-920-0000"));
		hashtable.put("��ö��",new ContactInfo("��⵵ ����","031-915-0000"));
		ContactInfo obj = hashtable.get("������");
		System.out.println(obj.address);
		System.out.println(obj.phoneNo);
	}
}
