package Chap11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;;
/*
 * �ۼ�����:2017_03_15
 * �ۼ���:����
 * getClass �޼ҵ��� ��� ���� �����ִ� ���α׷�
 * ���� 11-13
 */
public class ObjectExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(10,20);
		Class cs = obj.getClass();
		String name = cs.getName();
		System.out.println("class name"+name);
		Class spcs = cs.getSuperclass();
		String supername = spcs.getName();
		System.out.println("super class name"+supername);
		Field field[] = cs.getDeclaredFields();
		System.out.println("�ʵ� ");
		for(int cnt=0;cnt<field.length;cnt++){
			System.out.println("  "+field[cnt]);
		}
		Method  method[] = cs.getDeclaredMethods();
		System.out.println("�޼ҵ� ");
		for(int cnt=0;cnt<method.length;cnt++){
			System.out.println("  "+method[cnt]);
		}
	}

}
