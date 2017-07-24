package 정렬;

/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :버블 정렬
 * 내용 :버블 정렬은 대다수의 정렬중에서 가장 최악의 경우를 보여준다.
 * 무조건 2문 for문이 돌기 때문에 n(n-1)의 형태로
 * O(n^2)를 가지는 그리 좋지 못하는 정렬이다.
 */

public class BubbleSort extends printArray{
	
	
	public void Sort(int[] Array){
		int tmp;
		for(int i=0;i<Array.length-1;i++){
			for(int j=i+1;j<Array.length;j++){
				if(Array[j]<Array[i]){
					tmp = Array[j];
					Array[j] = Array[i];
					Array[i] = tmp;
				}
				
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args){
	



		


		printArray print = new printArray();
		BubbleSort bubbleSort = new BubbleSort();
		int[] Array = {-1,2,5,4,5,11,7,16,9,10};
		
		
		System.out.println("정렬하기 전 배열");
		bubbleSort.print(Array);
		bubbleSort.Sort(Array);
		System.out.println("정렬 후 배열");
		bubbleSort.print(Array);
	}
}
