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
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Stack;

public class DFS {
	public final static int SIMPLEX=0;
	public final static int MULTIPLEX=1;
	static SimplexDFS simplexDFS;
	static MultiplexDFS multiplexDFS;
	
	DFS(int v,int type){
		if(type==SIMPLEX)
		simplexDFS = new SimplexDFS(v);
		else{
			multiplexDFS = new MultiplexDFS(v);			
		}
			
	}
	
	public void addEdge_sim(int v,int w){
		simplexDFS.addEdge(v, w);
	}
	
    public void start_SimplexDFS(int v)
    {
        simplexDFS.DFS(v);
    }
    public void addEdge_mul(int v,int w){
    	multiplexDFS.addEdge(v, w);
    }
    public void start_MultiplexDFS(int v)
    {
        multiplexDFS.DFS(v);
    }
	
	
	class SimplexDFS{
		private int V;
		private LinkedList<Integer> adj[];
		SimplexDFS(int v) {
			V=v;
			adj = new LinkedList[V];
			for(int i=0;i<V;i++)
				adj[i]=new LinkedList();
			// TODO Auto-generated constructor stub
		}
		
		  void addEdge(int v, int w)
		    {
		        adj[v].add(w);  
		    }
		 
		    void DFSUtil(int v,boolean visited[])
		    {
		      
		        visited[v] = true;
		        System.out.print(v+" ");
		 

		        LinkedList<Integer> list = adj[v];
		        for(int i=0;i<list.size();i++){	        	        	
		        	 if (!visited[list.get(i)]){
			                DFSUtil(list.get(i), visited);
			               
		        	 }
		        }
		   
		    }
		 
		    void DFS(int v)
		    {
		        boolean visited[] = new boolean[V];
		 
		        DFSUtil(v, visited);
		    }	 		
		
	}
	
	class MultiplexDFS{
		private int V;
		private LinkedList<Integer> adj[];
		MultiplexDFS(int v) {
			V=v;
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
		 
		    void DFSUtil(int v,boolean visited[])
		    {
		      
		        visited[v] = true;
		        System.out.print(v+" ");
		 

		        LinkedList<Integer> list = adj[v];
		        for(int i=0;i<list.size();i++){	        	        	
		        	 if (!visited[list.get(i)]){
			                DFSUtil(list.get(i), visited);
			               
		        	 }
		        }
		   
		    }
		 
		    void DFS(int v)
		    {
		        boolean visited[] = new boolean[V];
		 
		        DFSUtil(v, visited);
		    }	
		
		
		
	}
	
	    public static void main(String args[])
	    {
	    	
	    	DFS dfs= new DFS(5,SIMPLEX);
	    	dfs.addEdge_sim(0, 1);
	    	dfs.addEdge_sim(0, 2);
	    	dfs.addEdge_sim(0, 4);
	    	dfs.addEdge_sim(1, 2);
	    	dfs.addEdge_sim(2, 0);
	    	dfs.addEdge_sim(2, 3);
	    	dfs.addEdge_sim(4, 3);
	    	dfs.addEdge_sim(3, 4);
	    	System.out.println("단방향 DFS에서의 시작.");
	    	dfs.start_SimplexDFS(1);
	 
	    	
	     	DFS dfs2= new DFS(5,MULTIPLEX);
	    	dfs2.addEdge_mul(0, 1);
	    	dfs2.addEdge_mul(0, 2);
	    	dfs2.addEdge_mul(0, 4);
	    	dfs2.addEdge_mul(1, 2);
	    	dfs2.addEdge_mul(2, 0);
	    	dfs2.addEdge_mul(2, 3);
	    	dfs2.addEdge_mul(4, 3);
	    	dfs2.addEdge_mul(3, 4);
	    	System.out.println("\n양방향 DFS에서의 시작.");
	    	dfs2.start_MultiplexDFS(1);
	 
	    	
	    	
	    }
}
