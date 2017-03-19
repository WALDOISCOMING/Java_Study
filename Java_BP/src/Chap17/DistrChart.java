package Chap17;
import java.io.*;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * 2���� �迭 �ʵ带 �����ϴ� Ŭ����
 * ���� 17-8
 * ���� 17-9: ����ȭ �޼ҵ�� ������ȭ �޼ҵ带 �����ϴ� ����ȭ ���� Ŭ������ ��
 */
public class DistrChart implements Serializable {
	int arr[][];
	public DistrChart() {
		arr = new int[10][10];
		// TODO Auto-generated constructor stub
	}
	
	
	private void writeObject(ObjectOutputStream out)throws IOException{
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[0].length;col++){
				if(arr[row][col]!=0){
					out.writeInt(row);
					out.writeInt(col);
					out.writeInt(arr[row][col]);
				}
			}		
		}		
	}
	
	private void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
		arr = new int[10][10];
		try{
			while(true){
				int row = in.readInt();
				int col = in.readInt();
				int data = in.readInt();
				arr[row][col] = data;
			}
		}catch(EOFException e){
			System.out.println(e);
		}
	}
	
}
