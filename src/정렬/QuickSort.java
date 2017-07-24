package 정렬;

/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :퀵 정렬
 * 내용 :퀵 정렬은 보통은 쓸만하다..
 * 보통의 경우 O(nlgn)을 가지는 나름 쓸만한 배열  하지만 최악의 경우, 모든것이 역순으로 되어있다면 O(n^2)를 가진다.
 */

public class QuickSort extends printArray{

	
	public int partition(int []Array,int start,int end)
	{
		int i = start-1;
		int j = start;
		int tmp;
		while(j<end)
		{
			/*
			 * 뒤에 존재값이
			 */
			if(Array[j]>=Array[end])
			{
				j++;
			}else
			{
				i++;
				tmp = Array[j];
				Array[j] = Array[i];
				Array[i] = tmp;
				j++;
			}
		}
		
		i++;
		tmp = Array[i];
	    Array[i] = Array[end];
	    Array[end] = tmp;
	    return i;
		
	}

void quickSort(int[]Array,int p,int r){
	if(p<r){
	//피벗 중심으로 크고 작은것을 나눈다. 이 피벗은 가운데 값을 찾고 그 위치로 움직이게 하는것이다.
	int q = partition(Array,p,r);
	quickSort(Array,p,q-1);
	quickSort(Array,q+1,r);
	}

}


	
	
	
	
	
	
	
	
	public static void main(String[] args){
	
		QuickSort quickSort = new QuickSort();
		int Array[] = {31,8,48,73,11,3,20,29,65,15};
		quickSort.print(Array);
		quickSort.quickSort(Array,0,Array.length-1);
		quickSort.print(Array);
	
	}
}
