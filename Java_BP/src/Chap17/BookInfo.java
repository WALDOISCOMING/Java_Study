package Chap17;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * ��ǰ ���� Ŭ������ ���� Ŭ������
 * ���� 17-11
 * ���� 17-12: java.io.Serializable �������̽��� �����ϴ� ���� ���� Ŭ����
 * ���� 17-15: writeObject,readObject �޼ҵ带 �߰��� ���� Ŭ������ ����ȭ �ϴ� Ŭ����
 * ���� 17-16: deaultWriterObject�� defulatReadObject �޼ҵ带 ȣ���ϴ� BookInfo Ŭ����
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
