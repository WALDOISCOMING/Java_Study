package Chap10;

import java.io.*;
import java.util.*;
/*
 * 작성일자:2017_03_14
 * 작성자:길경완
 * PrintStream 클래스의 사용 예
 * 예제 10-15
 */
public class PrintStreamExample1{
	public static void main(String[] args){

		System.out.println("------성적표------");
		System.out.printf("%3s :%3d %3d %3d %4.1f %n","김지영",92,87,95,91.3f);
		System.out.printf("%3s :%3d %3d %3d %4.1f %n","박현식",100,90,88,92.7f);
		System.out.printf("%3s :%3d %3d %3d %4.1f %n","최민재",75,88,85,82.7f);
		System.out.printf("작성일자: %1$tY년 %1$tm월 %1$td일",new GregorianCalendar());
		
	}
}

