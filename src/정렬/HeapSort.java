package 정렬;

import java.util.ArrayList;

/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :힙 정렬
 * 내용 :
 * 트리구조를 통하여 정렬을 한다.
 * 사실 제대로된 정렬이 아닌, 부모 자식간 일정 조건만 성립하는 정렬이다.
 * 여기에서는 Max가 아닌 minheap으로 만든다. 허프만코드에서 이것을 이용한다.
 */

public class HeapSort 
{
	
	private int[] Heap;
	private int size;
	private int maxsize;
	private static final int FRONT=1;
	
	public HeapSort(int maxsize)
	{
		this.maxsize = maxsize;
		this.size=0;
		Heap = new int[this.maxsize+1];
		Heap[0] = Integer.MIN_VALUE;
	}
	
	public int parent(int pos)
	{
		return pos/2;
	}
	
	public int leftChild(int pos)
	{
		return 2*pos;
	}
	
	public int rightChild(int pos)
	{
		return (2*pos)-1;
	}
	
	  private boolean isLeaf(int pos)
	    {
	        if (pos >=  (size / 2)  &&  pos <= size)
	        { 
	            return true;
	        }
	        return false;
	    }
	 
	    private void swap(int fpos, int spos)
	    {
	        int tmp;
	        tmp = Heap[fpos];
	        Heap[fpos] = Heap[spos];
	        Heap[spos] = tmp;
	    }
	
	public void minHeapify(int pos)
	{
		if(!isLeaf(pos))
		{
			if ( Heap[pos] > Heap[leftChild(pos)]  || Heap[pos] > Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }	
		}
	}
	
	   public void insert(int element)
	    {
	        Heap[++size] = element;
	        int current = size;
	 
	        while (Heap[current] < Heap[parent(current)])
	        {
	            swap(current,parent(current));
	            current = parent(current);
	        }	
	    }
	   
	   
	   public void print()
	    {
	        for (int i = 1; i <= size / 2; i++ )
	        {
	            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i] 
	                + " RIGHT CHILD :" + Heap[2 * i  + 1]);
	            System.out.println();
	        } 
	    }
	 
	   public void minHeap()
	    {
	        for (int pos = (size / 2); pos >= 1 ; pos--)
	        {
	            minHeapify(pos);
	        }
	    }
	 
	    public int remove()
	    {
	        int popped = Heap[FRONT];
	        Heap[FRONT] = Heap[size--]; 
	        minHeapify(FRONT);
	        return popped;
	    }
	
//	ArrayList<Integer> i;
	ArrayList<Integer> Array;
//	int[] Array;
	public HeapSort()
	{
	Array = new ArrayList<Integer>();
	}
	
	public void Sort(int value,int index)
	{
		if(index==0){
			return;
			}
		
		int parent = index%2==0?parent=(index/2)-1:(index/2);
		if(index==1||index==2)
		{
			parent=0;
		}
		if(Array.get(parent)<value){
			value = Array.get(parent);
			Array.set(parent,Array.get(index));
			Array.set(index,value);
		
			Sort(value,parent);
			}
	}
	public void Insert(int value,int index)
	{
	
		Array.add(value);
	
		Sort(value,index);
		print();
		
		
	}
	public void Delete()
	{
		
	}
	
	public static void main(String[] args)
	{
		HeapSort heapSort = new HeapSort(15);
		
	        heapSort.insert(5);
	        heapSort.insert(3);
	        heapSort.insert(17);
	        heapSort.minHeap();
	        heapSort.print();
	        System.out.println("----------------------------");
	        heapSort.insert(10);
	        heapSort.insert(84);
	        heapSort.insert(19);
	        heapSort.insert(6);
	        heapSort.insert(22);
	        heapSort.insert(9);
	        heapSort.minHeap();
	 
	        heapSort.print();
	        System.out.println("The Min val is " +heapSort.remove());
//		int Array[] = {1,3,4,5};
	}
}
