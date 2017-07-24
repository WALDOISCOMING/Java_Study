package Chap20;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * �ۼ�����:2017_03_21
 * �ۼ���:����
 * TCP/IP�� ����ϴ� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷�(1)
 * ���� 20-1
 */
public class ClientExample1 {
	public static void main(String[] args){
		Socket socket=null;
		try{
			socket = new Socket("###.###.###.###",9000);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str ="Hello server!";
			out.write(str.getBytes());
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try{
				socket.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
