package ����;

/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-20
 * ������: ����
 * ���� :���� ����
 * ���� :���� ������ ��ټ��� �����߿��� ���� �־��� ��츦 �����ش�.
 * ������ 2�� for���� ���� ������ n(n-1)�� ���·�
 * O(n^2)�� ������ �׸� ���� ���ϴ� �����̴�.
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
		
		
		System.out.println("�����ϱ� �� �迭");
		bubbleSort.print(Array);
		bubbleSort.Sort(Array);
		System.out.println("���� �� �迭");
		bubbleSort.print(Array);
	}
}
