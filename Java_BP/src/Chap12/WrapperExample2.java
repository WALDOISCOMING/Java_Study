package Chap12;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * Wrapper 클래스의 문자열 파라미터를 받는 생성자의 사용 예
 * 예제 12-2
 */
public class WrapperExample2 {
	public static void main(String[] args){
		int total = 0;
		for(int cnt=0;cnt<args.length;cnt++){
			Integer obj = new Integer(args[cnt]);
			total+=obj.intValue();
		}
		System.out.println(total);
		
	}
}
