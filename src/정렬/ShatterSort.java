package 정렬;

import java.util.ArrayList;

/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-23
 * 수정자: 길경완
 * 제목 :shattersort
 * 내용 :
 * 
 * 
 * 무척이나 좋은 정렬중에 하나다. 이것과 merge를 이용하여서 tim 정렬을 만든다고하지만 이것을 보아할때 이 자체는 merge보다 그리 좋아보이지 않는다...
 */
public class ShatterSort {
	
	int Array[];
	public void shatterParition(int num)
	{
		//천장. 높임해준다.
		int shatters = (int)Math.ceil(Array.length/(double)num);
		ArrayList<Integer>[] registers = new ArrayList[shatters];
		for(int i=0;i<shatters;i++)
		{
			registers[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<Array.length;i++)
		{
			registers[Array[i]/num].add(Array[i]);
	
		}
		
	}
	
	public void shatterSort(int num)
	{
		int shatters = (int)Math.ceil(Array.length/(double)num);
		shatterParition(num);
		int []tmp = new int[num];
		for(int i=0;i<shatters;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i*num+j>=Array.length)
					tmp[j]=-1;
				else
					tmp[j]=Array[i*num+j];
			}
			
			for(int j=0;j<tmp.length;j++)
			{
				int tmpj = tmp[j];
				 if(i*num+(tmpj%num)>=Array.length || tmpj == -1)
	                    break;
	                Array[i*num+(tmpj%num)]=tmpj;
	               
			}
		}
		
		
	}

	
	public void simpleShatterSort(int num,int rate)
	{
		for(int i=num;i>1;i=i/rate)
		{
			shatterParition(i);
		}
		shatterParition(1);
	}
}
