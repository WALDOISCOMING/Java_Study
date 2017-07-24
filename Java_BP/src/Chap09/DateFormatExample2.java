package Chap09;
import java.util.*;
import java.text.*;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * DateFormat 클래스를 사용하여 날짜와 시간을 포맷하는 프로그램
 * 예제 9-16
 */


public class DateFormatExample2 {
	public static void main(String[] args){
		GregorianCalendar cal = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String str = dateFormat.format(cal.getTime());
		System.out.println(str);
		
		
	}
}
