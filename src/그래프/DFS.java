package 그래프;
/*
 * 생성일: 2017-07-21
 * 생성자: 길경완
 * 수정일: x
 * 수정자: x
 * 제목 :DFS 
 * 내용 :
 *DFS는 깊이 우선 탐색이다.
 */

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Stack;

public class DFS {
	
	

	Stack stack;
	ArrayList<Integer> []Array;
	int[] vertex;
	boolean[] checked;
	
	public DFS()
	{
		stack = new Stack();
		//checked = new boolean[5];
		
		//queue=new Queue<Integer>();
		
	}
	
	
	public void insert(int size,int [][]edge)
	{
		for(int i=0;i<size;i++)
		{
			Array[edge[i][0]].add(edge[i][1]);
			Array[edge[i][1]].add(edge[i][0]);
		}
		
	}
	public void DFS_Recursion(int now,int count)
	{
		if(stack.isEmpty())
			return;
		while(count!=5)
		{
			System.out.print("["+now+"]");
			for(int i=0;i<Array[now].size();i++)
			{
				if(checked[Array[now].get(i)]==false)
				{
					stack.pop();
					checked[Array[now].get(i)]=true;
					stack.push(Array[now].get(i));
					DFS_Recursion(Array[now].get(i),count++);
					
				}
				
			}
			
		}
		
	}
	public void DFS_Check(int start,int size,int [][]edge)
	{
		Array = new ArrayList[size];
		checked = new boolean[size];
		for(int i=0;i<size;i++)
		{
			Array[i] =new ArrayList<Integer>();
		}
		
	
		
		insert(size,edge);
		stack.push(start);
		checked[start] = true;
		DFS_Recursion(start,0);
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		DFS dfs = new DFS();
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
	
		dfs.DFS_Check(start,edgeSize, edge);
		
	}
}
