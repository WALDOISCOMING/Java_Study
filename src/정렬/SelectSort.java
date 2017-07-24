package 정렬;
/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :선택 정렬
 * 내용 :선택 정렬은 나름 Bubble정렬보다 나은 정렬이다.
 * 최선의 경우 nlgn의 
 * 대다수의 정렬중에서 가장 최악의 경우를 보여준다.
 * 무조건 2문 for문이 돌기 때문에 n(n-1)의 형태로
 * O(n^2)를 가지는 그리 좋지 못하는 정렬이다.
 */
public class SelectSort extends printArray
{

	public void Sort(int[] Array,int size)
	{
		/*
		 * 선택정렬은 방법에 따라 다르겠지만 여기에서는 배열안에서 가장 큰것을 가장 뒤로 보낸다.
		 * 그 다음으로 큰 것을 그 다음으로 뒤로 보내어 순차적으로 small->big으로 보여주는 정렬이다.
		 * 여기에서는 귀납적으로 호출을 하기대문에 인자를 size로 보내주어 이 size에 따라 종료할지 하지 않을지를 결정한다.
		 * 
		 */
		//여기에서 전제조건 0보다 큰것들을 정렬하도록 한다..
		int biggest=0;
		int index=0;
		if(size==0)
		{
			return;
		}
		for(int i=0;i<size;i++)
		{
			if(Array[i]>=biggest)
			{
				biggest = Array[i];
				index = i;
			}
		
		}
		
		Array[index] =Array[size-1];
		Array[size-1] = biggest;
		Sort(Array,size-1);
		
	}
	
	public static void main(String[] args)
	{
		SelectSort selectSort = new SelectSort();
		int[] Array = {1,4,3,2};
		
		System.out.println("정렬하기 전");
		selectSort.print(Array);

		selectSort.Sort(Array, Array.length);
		
		System.out.println("정렬 후");
		selectSort.print(Array);
		
			
	}
}
