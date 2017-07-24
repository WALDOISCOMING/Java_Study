package 정렬;


/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :멀지 정렬
 * 내용 :멀지 정렬은  꽤 쓸만한 배열이다.
 * 최악이라도 O(nlgn)을 가지는 나름 쓸만한 배열 이후 나올.
 * tim과같은 배열도 이 merge의 변형이다.
 */

public class MergeSort extends printArray{

	
	public void Sort(int[] Array,int start,int middle,int end){
	       int i = start;
	        int j = middle+1;
	        int k = start;
	        int tmp[]=new int[Array.length];
	        //배열을 반, 앞배열과 뒷 배열로 나눈다. 이것을 뒤에서부터 순차적으로 올라오며 더 작은것을 먼저 tmp에 넣는다
	        //이 반복은 i와 j가 끝까지 가도록 하는것이다.
	        while(i<=middle&&j<=end){
	                if(Array[i]<=Array[j]){
	                tmp[k++]=Array[i++];
	                }else{
	                tmp[k++]=Array[j++];
	                }

	        }
	        //한쪽이 먼저 종료될 수 있으므로 각각의 끝까지 움직이도록 한다.
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
