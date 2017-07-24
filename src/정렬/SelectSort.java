package ����;
/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-20
 * ������: ����
 * ���� :���� ����
 * ���� :���� ������ ���� Bubble���ĺ��� ���� �����̴�.
 * �ּ��� ��� nlgn�� 
 * ��ټ��� �����߿��� ���� �־��� ��츦 �����ش�.
 * ������ 2�� for���� ���� ������ n(n-1)�� ���·�
 * O(n^2)�� ������ �׸� ���� ���ϴ� �����̴�.
 */
public class SelectSort extends printArray
{

	public void Sort(int[] Array,int size)
	{
		/*
		 * ���������� ����� ���� �ٸ������� ���⿡���� �迭�ȿ��� ���� ū���� ���� �ڷ� ������.
		 * �� �������� ū ���� �� �������� �ڷ� ������ ���������� small->big���� �����ִ� �����̴�.
		 * ���⿡���� �ͳ������� ȣ���� �ϱ�빮�� ���ڸ� size�� �����־� �� size�� ���� �������� ���� �������� �����Ѵ�.
		 * 
		 */
		//���⿡�� �������� 0���� ū�͵��� �����ϵ��� �Ѵ�..
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
		
		System.out.println("�����ϱ� ��");
		selectSort.print(Array);

		selectSort.Sort(Array, Array.length);
		
		System.out.println("���� ��");
		selectSort.print(Array);
		
			
	}
}
