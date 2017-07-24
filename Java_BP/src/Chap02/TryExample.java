package Chap02;

/*
 * 작성일자:2017_03_07
 * 작성자:길경완
 * 두 종류 이상의 익셉션 처리 try 문
 * 예제 2-51
 */
public class TryExample {
	public static void main(String[] args){
		int div[]={5,4,3,2,1,0};
		for(int cnt=0;cnt<10;cnt++){
			try{
				int share = 100/div[cnt];
				System.out.println(share);
			}catch(ArithmeticException e){
				System.out.println("0으로 나눌려고 했다.");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("잘못된 익덱스 참조");
			}
			
		}
		
		System.out.println("Done.");
	}
}
