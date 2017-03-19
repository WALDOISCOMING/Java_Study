package Chap17;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 상품 정보 클래스와 서브 클래스들
 * 예제 17-11
 * 예제 17-12: java.io.Serializable 인터페이스를 구현하는 도서 정보 클래스
 * 예제 17-15: writeObject,readObject 메소드를 추가해 슈퍼 클래스도 직렬화 하는 클래스
 * 예제 17-16: deaultWriterObject와 defulatReadObject 메소드를 호출하는 BookInfo 클래스
 */
public class BookInfo extends GoodsInfo implements java.io.Serializable{
	
	String writer;
	int page;
	public BookInfo(String name, String code, int price,String writer,int page) {
		super(name, code, price);
		this.writer=writer;this.page=page;
		// TODO Auto-generated constructor stub
	}
	private void writeObject(ObjectOutputStream out)throws IOException{
		out.writeUTF(code);
		out.writeUTF(name);
		out.writeInt(price);
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
		code = in.readUTF();
		name = in.readUTF();
		price = in.readInt();
		in.defaultReadObject();
	}
}
