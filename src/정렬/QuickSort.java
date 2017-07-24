package ����;

/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-20
 * ������: ����
 * ���� :�� ����
 * ���� :�� ������ ������ �����ϴ�..
 * ������ ��� O(nlgn)�� ������ ���� ������ �迭  ������ �־��� ���, ������ �������� �Ǿ��ִٸ� O(n^2)�� ������.
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
			 * �ڿ� ���簪��
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
	//�ǹ� �߽����� ũ�� �������� ������. �� �ǹ��� ��� ���� ã�� �� ��ġ�� �����̰� �ϴ°��̴�.
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
