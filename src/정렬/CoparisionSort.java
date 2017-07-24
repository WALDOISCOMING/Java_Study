package ����;

import java.util.Arrays;
import java.util.Queue;

/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-20
 * ������: ����
 * ���� :������ �ʴ� ����
 * ���� :
 * �̹� �ִ� �����͸� �̿��Ѵ�.
 * ���� ����
 * ���ڸ� �����Ͽ� �ű⿡ ���Ͽ� �ֵ��� ����. 
 * ���⵵�� O(n)��
 * radix ����
 * ���� �ּ� �ڸ����� ���ϰ� ����ϰ� �̿��Ͽ� �ּ� �ڸ������� �ִ� �ڸ����� ���ϴ°�.
 * ���⵵�� O(n)��.
 */

//Comparision sort, �񱳸� ���� �˰����� �ᱹ nlgn���� ������ �� ����.
//Non  Comparision sort ������ �����Ϳ� ���� ���� ������ �̿��Ѵ�.
//Bucket sort,Radix sort.
//bucket sort�� �̹� ���� ü���� ���� ��쿡 ����.
//
//counting sort: n���� ����.�� ��� ������ 0~k(���� ������ �ִ°�.)
//�̶��� ���� k�� ������ ��� ����.
//A={2,5,3,0,2,3,0,3}->n=8,k=5->{2,0,2,3,0,1}.0�� 2��, 1�� 0��.,.. 5�� 1�� �� ��� �̿�
//�̰��� �ᱹ {0,0,2,2,3,3,3,5}�� ������ ���̴�.i
//raidx sort. n���� d�ڸ� ������. ���� ���� �ڸ������� �����Ѵ�.radix�� ť�� ����ϴ°��� ���ϴ�.
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
		/*���� Ư���� ���� ���̸� �����ϴ�. 
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
			System.out.println("��Ŷ ������ ���� 0~9���� ���ڸ� �����մϴ�.");
			for(int i=0;i<Array.length;i++){
				num[Array[i]%10]++;
			
				
			}
			print(num);
			
			
			
			
			
		}
		
	}
	
	class RadixSort
	{
		/*
		 * �Ʒ��ڸ������� ���Ͽ� ���� �ֻ��� ���� ���Ͽ� ��ȯ�ϴ� ��. ť�� ����Ѵ�.
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
		 
		        // �� ��ġ��, ��ġ ��Ŷó�� ���ڸ� ++�����ش�.
		        for (i = 0; i <size ; i++)
		            count[ (Array[i]/exp)%10 ]++;
		 
		        // Change count[i] so that count[i] now contains
		        // actual position of this digit in output[]
		        //������Ų��.
		        for (i = 1; i < 10; i++)
		            count[i] += count[i - 1];
		        		  
		 
		        /*  count[Array[i]/exp%10]���� ���� ������ ���ڸ� �� �� �ִ�. �� ���ڴ� ũ��. �׷��Ƿ� -1�� ����� �� ��ġ�̴�.
		        * �� �Ŀ� ������ -1�� �ѹ� ������.
		        */
		        for (i = size - 1; i >= 0; i--)
		        {
		            output[count[ (Array[i]/exp)%10 ] - 1] = Array[i];
		            count[ (Array[i]/exp)%10 ]--;
		        }
		 
		        // ���� output�� ���� �Ǿ����Ƿ� ������ ��������.
		        for (i = 0; i < size; i++)
		            Array[i] = output[i];
			
		}
		public void Sort(int []Array)
		{
			System.out.println("��� ������ �Ʒ����ں��� ������ �����Ѵ�.");
			//���⿡���� �ְ��� ã�� �װ��� �ڸ����� �˾Ƴ���.
			int m = findBiggest(Array);
			for(int i=1;m/i>0;i=i*10){
				//�̶� �����Ѵ�.
				System.out.print(i+"�� �ڸ����� ��");
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
