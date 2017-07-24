package ����;


/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-20
 * ������: ����
 * ���� :���� ����
 * ���� :���� ������  �� ������ �迭�̴�.
 * �־��̶� O(nlgn)�� ������ ���� ������ �迭 ���� ����.
 * tim������ �迭�� �� merge�� �����̴�.
 */

public class MergeSort extends printArray{

	
	public void Sort(int[] Array,int start,int middle,int end){
	       int i = start;
	        int j = middle+1;
	        int k = start;
	        int tmp[]=new int[Array.length];
	        //�迭�� ��, �չ迭�� �� �迭�� ������. �̰��� �ڿ������� ���������� �ö���� �� �������� ���� tmp�� �ִ´�
	        //�� �ݺ��� i�� j�� ������ ������ �ϴ°��̴�.
	        while(i<=middle&&j<=end){
	                if(Array[i]<=Array[j]){
	                tmp[k++]=Array[i++];
	                }else{
	                tmp[k++]=Array[j++];
	                }

	        }
	        //������ ���� ����� �� �����Ƿ� ������ ������ �����̵��� �Ѵ�.
	        while(i<=middle){
	        tmp[k++] = Array[i++];
	        }
	        while(j<=end){
	        tmp[k++] = Array[j++];
	        }
	        for(i=start;i<=end;i++){
	        Array[i] = tmp[i];
	        }
	}
	
	public void MergeRecursion(int []Array,int start,int end){
		
		if(start<end){
			int middle = ((start+end)/2);
			MergeRecursion(Array,start,middle);
			MergeRecursion(Array,middle+1,end);
			Sort(Array,start,middle,end);
			this.print(Array);
		}
		
	}
	
	
	public static void main(String[] args){

		int Array[]={9,2,3,1,5,6,7};
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.print(Array);
		mergeSort.MergeRecursion(Array, 0, 6);
		mergeSort.print(Array);
		
		
	}
}
