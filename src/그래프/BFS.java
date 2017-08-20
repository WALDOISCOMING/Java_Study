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
	SimplexBFS simplexBFS;
	MultiplexBFS multiplexBFS;
	public static final int SIMPLEX=0;
	public static final int MULTIPLEX=1;
	
	
	Queue<Integer> queue;
	ArrayList<Integer> []Array;
	int[] vertex;
	boolean[] checked;
	
	public BFS()
	{
		queue = new LinkedList();				
		//queue=new Queue<Integer>();		
	}

	public BFS(int v,int type){
		if(type==MULTIPLEX)
		multiplexBFS =new MultiplexBFS(v);
		else
		simplexBFS = new SimplexBFS(v);
			
	}
	
	public void addEdge_sim(int v,int w){
		simplexBFS.addEdge(v, w);
	}
	    
	public void start_SimplexDFS(int v){
		simplexBFS.BFS(v);
	
	}
		
		 
	public void addEdge_mul(int v,int w){
		multiplexBFS.addEdge(v, w);
	}
	    
	public void start_MultiplexDFS(int v){
		multiplexBFS.BFS(v);
	
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
	class SimplexBFS{
		private int V;
		private LinkedList<Integer> adj[];
		Queue<Integer> que;
		SimplexBFS(int v) {
			
			V=v;
			que= new LinkedList<Integer>();
			adj = new LinkedList[V];
			for(int i=0;i<V;i++)
				adj[i]=new LinkedList();
			// TODO Auto-generated constructor stub
		}
		
		  void addEdge(int v, int w)
		    {
		        adj[v].add(w);  		       
		    }
		 
		    void BFSUtil(int v,boolean visited[])
		    {
		    
		    	if(visited[v]!=true)
		    		System.out.print(v+" ");
		    	
		        visited[v] = true;
		 
		        LinkedList<Integer> list = adj[v];
		        
		 		        
		        for(int i=0;i<list.size();i++){	        	        	
		        	 if (!visited[list.get(i)]){
		        		 System.out.print(list.get(i)+" ");
		        		 visited[list.get(i)]=true;
		        		 que.offer(list.get(i));
		        	 }
		        }
		        for(int i=0;i<que.size();i++){
		        	int nowvertex=que.poll();
		        	BFSUtil(nowvertex, visited);
		        }
		        
		       		   
		    }
		 
		    void BFS(int v)
		    {
		        boolean visited[] = new boolean[V];		        
		        que.offer(v);
		        
		        BFSUtil(que.poll(), visited);
		    }	
	}
	
	class MultiplexBFS{
		private int V;
		private LinkedList<Integer> adj[];
		Queue<Integer> que;
		MultiplexBFS(int v) {
			
			V=v;
			que= new LinkedList<Integer>();
			adj = new LinkedList[V];
			for(int i=0;i<V;i++)
				adj[i]=new LinkedList();
			// TODO Auto-generated constructor stub
		}
		
		  void addEdge(int v, int w)
		    {
		        adj[v].add(w);  
		        adj[w].add(v);
		    }
		 
		    void BFSUtil(int v,boolean visited[])
		    {
		    
		    	if(visited[v]!=true)
		    		System.out.print(v+" ");
		    	
		        visited[v] = true;
		 
		        LinkedList<Integer> list = adj[v];
		        
		 		        
		        for(int i=0;i<list.size();i++){	        	        	
		        	 if (!visited[list.get(i)]){
		        		 System.out.print(list.get(i)+" ");
		        		 visited[list.get(i)]=true;
		        		 que.offer(list.get(i));
		        	 }
		        }
		        for(int i=0;i<que.size();i++){
		        	int nowvertex=que.poll();
		        	BFSUtil(nowvertex, visited);
		        }
		        
		       		   
		    }
		 
		    void BFS(int v)
		    {
		        boolean visited[] = new boolean[V];		        
		        que.offer(v);
		        
		        BFSUtil(que.poll(), visited);
		    }	
		
	}
	
	
	public static void main(String[] args)
	{
		
		/*
		BFS bfs = new BFS();
		int start = 1;
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
		
		*/
		
    	BFS bfs= new BFS(5,SIMPLEX);
    	
    	bfs.addEdge_sim(0, 1);
    	bfs.addEdge_sim(0, 2);
    	bfs.addEdge_sim(0, 4);
    	bfs.addEdge_sim(1, 2);
    	bfs.addEdge_sim(2, 0);
    	bfs.addEdge_sim(2, 3);
    	bfs.addEdge_sim(4, 3);
    	bfs.addEdge_sim(3, 4);
    
    	System.out.println("단방향 BFS에서의 시작.");
    	bfs.start_SimplexDFS(1);
 
     	BFS bfs2= new BFS(5,MULTIPLEX);
    	bfs2.addEdge_mul(0, 1);
    	bfs2.addEdge_mul(0, 2);
    	bfs2.addEdge_mul(1, 3);
    	bfs2.addEdge_mul(2, 3);
    	bfs2.addEdge_mul(2, 4);
    	bfs2.addEdge_mul(3, 4);
   
    	System.out.println("\n양방향 BFS에서의 시작.");
    	bfs2.start_MultiplexDFS(1);
	}
	
}
