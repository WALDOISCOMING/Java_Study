package �׷���;
/*
 * ������: 2017-07-21
 * ������: ����
 * ������: x
 * ������: x
 * ���� :BFS (Breadth-First Search)
 * ���� :
 *�׷����� ��ȸ�� ���ϰ��̴�. ��ȸ�� �׷����� ��� ��带 �湮.
 *BFS�� �ʺ� �켱 Ž���̴�.
 *���ɿ��� ���·� �湮�� �Ѵ�.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * ť�� ���� �ʺ� �켱 Ž��. 
 * 1.���� ��带 cehck�ؼ� �̹� �湮�Ͽ��ٰ� ǥ���Ѵ�.
 * 2.��߳�带 ť�� �ִ´�.
 * 3.ť�� �������� while ����. ������� ��  uncheck�� ���� üũ�ϰ�, ť�� �ִ´�.
 * 
 * �Է�:����/������ �׷��� G=(E,V)�� ��߳�� s��V
 * ��� :��� ��� V�� ���Ͽ�
 * d[v]:s-v���� �ִܰ���� ����(Edge ����)
 * ��[v]:s-v���� �ִܰ�λ󿡼� v�� �������
 */
public class BFS
{
	Queue<Integer> queue;
	ArrayList<Integer> []Array;
	int[] vertex;
	boolean[] checked;
	
	public BFS()
	{
		queue = new LinkedList();
		
		
		//queue=new Queue<Integer>();
		
	}
	
	public void aa()
	{
		
	}
	public void insert(int size,int [][]edge)
	{
		for(int i=0;i<size;i++)
		{
			Array[edge[i][0]].add(edge[i][1]);
			Array[edge[i][1]].add(edge[i][0]);
		}
		
	}
	
	public void BFS_Check(int start,int size,int [][]edge)
	{
		Array = new ArrayList[size];
		checked = new boolean[size];
		for(int i=0;i<5;i++)
		{
			Array[i] =new ArrayList<Integer>();
		}
		
		
		
		insert(size,edge);
		queue.offer(start);
		checked[start] = true;
		
		
		while(!queue.isEmpty())
		{
			int nowVertex = queue.poll();
			System.out.print("["+nowVertex+"]");
			for(int i=0;i<Array[nowVertex].size();i++)
			{
				if(checked[Array[nowVertex].get(i)]==false)
				{
					queue.offer(Array[nowVertex].get(i));
					checked[Array[nowVertex].get(i)]=true;
				}
			}
		//	Array[nowVertex].size()
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		BFS bfs = new BFS();
		int start = 2;
		int edgeSize=6;
		int vertex=5;
		int [][]edge =
			{
					{0,1},
					{0,2},
					{1,3},
					{2,3},
					{2,4},
					{3,4}
			};
	
		bfs.BFS_Check(start,edgeSize, edge);
		
		//bfs.queue.offer(1);
		//System.out.println(bfs.queue.poll());
	}
	
}
