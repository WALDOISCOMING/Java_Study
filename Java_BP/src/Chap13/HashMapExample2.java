package Chap13;
import java.util.*;
/*
 * �ۼ�����:2017_03_16
 * �ۼ���:����
 * HashMap Ŭ������ ��� ���� �����ִ� ���α׷�(2)
 * ���� 13-12
 * ���� 13-13: Name Ŭ������ ���� hasCode �޼ҵ带 ȣ���ϴ� ���α׷�
 */
public class HashMapExample2 {
	public static void main(String[] args){
		HashMap<Name,Integer> hashtable = new HashMap<Name,Integer>();
		hashtable.put(new Name("�ظ�", "����"),new Integer(95));
		hashtable.put(new Name("�츣�̿´�","�׷�����"),new Integer(100));
		hashtable.put(new Name("��","����"),new Integer(85));
		hashtable.put(new Name("�巹����","������"),new Integer(93));
		hashtable.put(new Name("�׺�","�չ���"),new Integer(70));
		Integer num = hashtable.get(new Name("�츣�̿´�","�׷�����"));
		System.out.println(num);
		
		Name obj1 = new Name("�츣�̿´�","�׷�����");
		Name obj2 = new Name("�츣�̿´�","�׷�����");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
	}
}
