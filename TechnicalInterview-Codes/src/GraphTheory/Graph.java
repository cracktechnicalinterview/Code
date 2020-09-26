package GraphTheory;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private int vertices;
	private LinkedList<Integer> adj[];
	
	Graph(int v) {
		vertices=v;
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	public int getverticesCount() {
		return vertices;
	}
	
	public LinkedList<Integer> getAjacencyMatrix(int vertex){
		return adj[vertex];
	}
	
	void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	void printAdjacencyMetrix() {
		
		for(int i=0;i<vertices;i++) {
			LinkedList<Integer> current= adj[i];
			System.out.print(i+" = ");
			System.out.println(current);
		}
	}
}

