package Chap11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;;
/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * getClass 메소드의 사용 예를 보여주는 프로그램
 * 예제 11-13
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
		System.out.println("필드 ");
		for(int cnt=0;cnt<field.length;cnt++){
			System.out.println("  "+field[cnt]);
		}
		Method  method[] = cs.getDeclaredMethods();
		System.out.println("메소드 ");
		for(int cnt=0;cnt<method.length;cnt++){
			System.out.println("  "+method[cnt]);
		}
	}

}
