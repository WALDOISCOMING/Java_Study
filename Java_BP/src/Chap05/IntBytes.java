package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 정적메소드로만 구성된 기능 클래스
 * 예제 5-39
 */
public class IntBytes{
	static byte firstByte(int num){
		num = (num>>24) &0Xff;
		return (byte)num;
	}
	
	static byte secondByte(int num){
		num = num>>16&0Xff;
		return (byte)num;
	}
	static byte thirdByte(int num){
		num = num>>8&0Xff;
		return (byte)num;
	}
	static byte forthByte(int num){
		num = num>>0&0Xff;
		return (byte)num;
	}
	public static void main(String[] args){
		IntBytes a = new IntBytes();
		int num=0xFFFFFFFF;//1111 1111
		System.out.println(num);
		System.out.println(a.firstByte(num));//FF
		System.out.println(a.secondByte(num));//FF
		System.out.println(a.thirdByte(num));//FF
		System.out.println(a.forthByte(num));//FF
	}
}
