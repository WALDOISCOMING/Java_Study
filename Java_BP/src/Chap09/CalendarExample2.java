package Chap09;

import java.util.*;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * 런던의 현재 날짜와 시간을 출력하는 프로그램
 * 예제 9-14
 */

public class CalendarExample2 {
	public static void main(String[] args){
		Calendar cal = new GregorianCalendar();
		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		cal.setTimeZone(timeZone);
		
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
