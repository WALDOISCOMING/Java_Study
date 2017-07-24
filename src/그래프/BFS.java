package 그래프;
/*
 * 생성일: 2017-07-21
 * 생성자: 길경완
 * 수정일: x
 * 수정자: x
 * 제목 :BFS (Breadth-First Search)
 * 내용 :
 *그래프의 순회를 보일것이다. 순회는 그래프의 모든 노드를 방문.
 *BFS는 너비 우선 탐색이다.
 *동심원의 형태로 방문을 한다.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 큐를 통한 너비 우선 탐색. 
 * 1.시작 노드를 cehck해서 이미 방문하였다고 표시한다.
 * 2.출발노드를 큐에 넣는다.
 * 3.큐가 빌때까지 while 돈다. 인접노드 중  uncheck인 것을 체크하고, 큐에 넣는다.
 * 
 * 입력:방향/무방향 그래프 G=(E,V)와 출발노드 s∈V
 * 출력 :모든 노드 V에 대하여
 * d[v]:s-v까지 최단경로의 길이(Edge 길이)
 * π[v]:s-v까지 최단경로상에서 v의 직전노드
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
