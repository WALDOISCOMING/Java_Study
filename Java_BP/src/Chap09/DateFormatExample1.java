package Chap09;
import java.util.*;
import java.text.*;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * DateFormat Ŭ������ ����Ͽ� ��¥�� �ð��� �����ϴ� ���α׷�
 * ���� 9-15
 */


public class DateFormatExample1 {
	public static void main(String[] args){
		GregorianCalendar cal = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		String str = dateFormat.format(cal.getTime());
		System.out.println(str);
		
		
	}
}
