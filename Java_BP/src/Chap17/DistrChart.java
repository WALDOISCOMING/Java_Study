package Chap17;
import java.io.*;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 2차원 배열 필드를 포함하는 클래스
 * 예제 17-8
 * 예제 17-9: 직렬화 메소드와 역직렬화 메소드를 포함하는 직렬화 가능 클래스의 예
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
