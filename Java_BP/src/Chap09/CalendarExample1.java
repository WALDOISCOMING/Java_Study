package Chap09;
import java.util.GregorianCalendar;
import java.util.Calendar;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * ������ ��¥�� �ð��� ����ϴ� ���α׷�
 * ���� 9-13
 */

public class CalendarExample1 {
	public static void main(String[] args){
		GregorianCalendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int amPm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		String sAMPM = amPm ==Calendar.AM?"����":"����";
		System.out.printf("%d��%d��%d��%s%d��%d��%d��",year,month,date,sAMPM,hour,min,sec);
		
	}
}
