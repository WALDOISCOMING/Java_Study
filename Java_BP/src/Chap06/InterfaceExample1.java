package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 단행본 클래스와 부록 CD 클래스를 사용하는 프로그램
 * 예제 6-27
 */


public class InterfaceExample1 {
	public static void main(String[] args){
		SeparateVolume obj1 = new SeparateVolume("863?774개","개미","베르베르");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		try{
		obj1.checkOut("김영숙","20060315");
		obj2.checkOut("박희경","20060317");

		obj1.checkIn();
		obj2.checkIn();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
