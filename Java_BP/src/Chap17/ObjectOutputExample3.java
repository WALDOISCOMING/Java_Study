package Chap17;

import java.io.*;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * BBSItem 클래스의 객체를 직렬화 하고 역질렬화 하는 프로그램
 * 예제 17-5
 */


public class ObjectOutputExample3 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output3.dat"));
			BBSItem obj = new BBSItem("최선희","sunshine","정모.","이번주 ㄱ ㅇㅋ?");
			System.out.println(obj.itemNum);
			System.out.println(obj.writer);
			System.out.println(obj.passwd);
			System.out.println(obj.title);
			System.out.println(obj.content);
			out.writeObject(obj);
		}catch(IOException e){
			System.out.println("파일로 출력 불가."+e);
		}finally{
			try{
				out.close();
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}
	
	
}
