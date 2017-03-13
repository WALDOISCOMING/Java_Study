package Chap09;
import java.util.GregorianCalendar;
import java.util.Calendar;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 현재의 날짜와 시간을 출력하는 프로그램
 * 예제 9-13
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
		String sAMPM = amPm ==Calendar.AM?"오전":"오후";
		System.out.printf("%d년%d월%d일%s%d시%d분%d초",year,month,date,sAMPM,hour,min,sec);
		
	}
}
