package Chap17;

import java.io.*;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 게시물 클래스의 객체를 직렬화 하고 역직렬화 하는 프로그램.
 * 예제 17-7
 */


public class ObjectOutputExample4 {
	public static void main(String[] args){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream("src/Chap17/output4.dat"));
			BBSItem obj = new BBSItem("이석영","moonlight","자료파일","파일 첨부 참고.");
			obj.addAttachment(new Object());
			System.out.println(obj.itemNum);
			System.out.println(obj.writer);
			System.out.println(obj.passwd);
			System.out.println(obj.title);
			System.out.println(obj.content);
			System.out.println(obj.attachment);
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
