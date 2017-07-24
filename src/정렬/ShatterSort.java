package ����;

import java.util.ArrayList;

/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-23
 * ������: ����
 * ���� :shattersort
 * ���� :
 * 
 * 
 * ��ô�̳� ���� �����߿� �ϳ���. �̰Ͱ� merge�� �̿��Ͽ��� tim ������ ����ٰ������� �̰��� �����Ҷ� �� ��ü�� merge���� �׸� ���ƺ����� �ʴ´�...
 */
public class ShatterSort {
	
	int Array[];
	public void shatterParition(int num)
	{
		//õ��. �������ش�.
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
