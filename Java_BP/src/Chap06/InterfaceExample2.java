package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * Lenable 인터페이스 변수의 다형성을 이용하는 프로그램
 * 예제 6-29
 */


public class InterfaceExample2 {
	public static void main(String[] args){
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("833","푸코의 진자","에코");
		arr[1] = new SeparateVolume("609","서양미술사","곰브리치");
		arr[2] = new AppCDInfo("2002-1742","XML을 위한 자바프로그램");
		checkOutAll(arr,"윤지혜","20060315");
		
	}
	static void checkOutAll(Lendable arr[],String borrower,String date){
		for(int cnt=0;cnt<arr.length;cnt++)
			try{
			arr[cnt].checkOut(borrower,date);
			}catch(Exception e){
				System.out.println(e);
			}
	}
}
