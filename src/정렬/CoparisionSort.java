package 정렬;

import java.util.Arrays;
import java.util.Queue;

/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :비교하지 않는 정렬
 * 내용 :
 * 이미 있는 데이터를 이용한다.
 * 버켓 정렬
 * 숫자를 한정하여 거기에 버켓에 넣듯이 실행. 
 * 복잡도는 O(n)임
 * radix 정렬
 * 가장 최소 자릿수를 버켓과 비슷하게 이용하여 최소 자릿수부터 최대 자릿수를 비교하는것.
 * 복잡도는 O(n)임.
 */

//Comparision sort, 비교를 통한 알고리즘은 결국 nlgn보다 좋아질 수 없다.
//Non  Comparision sort 정렬한 데이터에 대한 사전 지식을 이용한다.
//Bucket sort,Radix sort.
//bucket sort는 이미 시험 체점과 같은 경우에 유용.
//
//counting sort: n개를 정렬.단 모든 정수는 0~k(사전 지식이 있는것.)
//이때는 비교적 k가 작을때 사용 가능.
//A={2,5,3,0,2,3,0,3}->n=8,k=5->{2,0,2,3,0,1}.0이 2개, 1이 0개.,.. 5가 1개 의 방식 이용
//이것은 결국 {0,0,2,2,3,3,3,5}로 나오는 것이다.i
//raidx sort. n개의 d자리 정수들. 가장 낮은 자리수부터 정렬한다.radix는 큐를 사용하는것이 편하다.
public class CoparisionSort {

	private RadixSort radixSort;
	private BucketSort bucketSort;
	
	public CoparisionSort() 
	{
		radixSort=new RadixSort();
		bucketSort =new BucketSort();
	}
	
	public void callBucketSort(int []Array)
	{
		bucketSort.Sort(Array);
	}
	
	public void callRadixSort(int []Array)
	{
		radixSort.Sort(Array);
	}
	public void print(int Array[])
	{
		for(int i=0;i<Array.length;i++)
		{
				System.out.print("["+Array[i]+"]");						
		}
		System.out.println("");
			
	}
	class BucketSort
	{
		/*오직 특정한 숫자 사이만 가능하다. 
		 * 
		 */
		public void print(int Array[])
		{
			for(int i=0;i<Array.length;i++){
				while(Array[i]!=0){
					System.out.print("["+i+"]");
					Array[i]--;
				}							
			}
			System.out.println("");
				
		}
		public void Sort(int []Array){
			int []num=new int[10];
			System.out.println("버킷 정렬은 오직 0~9사이 숫자만 가능합니다.");
			for(int i=0;i<Array.length;i++){
				num[Array[i]%10]++;
			
				
			}
			print(num);
			
			
			
			
			
		}
		
	}
	
	class RadixSort
	{
		/*
		 * 아랫자릿수부터 비교하여 가장 최상위 수를 비교하여 교환하는 것. 큐를 사용한다.
		 */
		public int findBiggest(int[] Array){
			int biggest=0;
			for(int i=0;i<Array.length;i++){
				if(Array[i]>=biggest)
					biggest = Array[i];
			}			
			return biggest;
		}
		
		public void Sort(int []Array,int exp)
		{
			int size = Array.length;
			 int output[] = new int[size]; // output array
		     int i;
		     int count[] = new int[10];
		     Arrays.fill(count,0);
		 
		        // 각 위치에, 마치 버킷처럼 숫자를 ++시켜준다.
		        for (i = 0; i <size ; i++)
		            count[ (Array[i]/exp)%10 ]++;
		 
		        // Change count[i] so that count[i] now contains
		        // actual position of this digit in output[]
		        //누적시킨다.
		        for (i = 1; i < 10; i++)
		            count[i] += count[i - 1];
		        		  
		 
		        /*  count[Array[i]/exp%10]으로 가면 누적된 숫자를 볼 수 있다. 이 숫자는 크기. 그러므로 -1을 해줘야 실 위치이다.
		        * 그 후에 실제도 -1을 한번 해주자.
		        */
		        for (i = size - 1; i >= 0; i--)
		        {
		            output[count[ (Array[i]/exp)%10 ] - 1] = Array[i];
		            count[ (Array[i]/exp)%10 ]--;
		        }
		 
		        // 시제 output에 복사 되었으므로 원래에 덮어주자.
		        for (i = 0; i < size; i++)
		            Array[i] = output[i];
			
		}
		public void Sort(int []Array)
		{
			System.out.println("라딕스 정렬은 아래숫자부터 정렬을 시작한다.");
			//여기에서의 최고값을 찾아 그것의 자릿수를 알아낸다.
			int m = findBiggest(Array);
			for(int i=1;m/i>0;i=i*10){
				//이때 정렬한다.
				System.out.print(i+"의 자리수일 때");
				Sort(Array,i);		
				print(Array);
			}
			
			
			
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(Integer.SIZE);
		CoparisionSort copraisionSort = new CoparisionSort();
		int Array[] ={1,6,5,7,4,2,7,9,8,5,2,4,1,6,8,8,2};
		copraisionSort.callBucketSort(Array);
		
		
		int Array2[] ={1,26,5,57,4,2,7,79,8,5,2,4,1,6,118,528,1112};
		copraisionSort.callRadixSort(Array2);
		
	}
	
}
