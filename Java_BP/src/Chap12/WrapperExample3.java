package Chap12;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * Wrapper 클래스의 parse- 메소드 사용 예
 * 예제 12-3
 */
public class WrapperExample3 {
	public static void main(String[] args){
		int total = 0;
		for(int cnt=0;cnt<args.length;cnt++){
			total+=Integer.parseInt(args[cnt]);
			System.out.println(total);
		}
		
	}
}
