package Chap16;

import java.util.HashMap;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ����ó ���α׷��� ����ó Ŭ����(���� �̳� Ŭ����)
 * ���� 16-13
 */
public class NestedClassExample7 {
	public static void main(String[] args){
		
		class ContactInfo{
			String address;
			String phoneNo;
			public ContactInfo(String address,String phoneNo) {
			this.address=address;this.phoneNo=phoneNo;
				// TODO Auto-generated constructor stub
			}
		}
		
		HashMap<String,ContactInfo> hashtable = new HashMap<String,ContactInfo>();
		hashtable.put("�̼���",new ContactInfo("����� ������","02-457-0000"));
		hashtable.put("������",new ContactInfo("����� ������","02-920-0000"));
		hashtable.put("��ö��",new ContactInfo("��⵵ ����","031-915-0000"));
		ContactInfo obj = hashtable.get("������");
		System.out.println(obj.address);
		System.out.println(obj.phoneNo);
	}
}
