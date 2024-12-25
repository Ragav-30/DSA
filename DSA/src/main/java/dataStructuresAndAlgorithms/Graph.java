package dataStructuresAndAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	ArrayList<ArrayList<Integer>> a = new ArrayList<>();

	Graph(int v) {
		for (int i = 0; i < v; i++) {
			a.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int vertex, int adjacent) {

		a.get(vertex).add(adjacent);
		a.get(adjacent).add(vertex);

	}

	public void BFS(int v) {
		int V = a.size();
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[V];
		visited[v] = true;
		q.add(v);
		while (q.size() != 0) {
			int vertex = q.remove();
			System.out.println(vertex);
			for (int i = 0; i < a.get(vertex).size(); i++) {
				int av = a.get(vertex).get(i);
				if (!visited[av]) {
					q.add(av);
					visited[av] = true;
				}
			}
		}

	}

	public void DFS(int v) {
		int V = a.size();
		boolean[] visited = new boolean[V];
		DFS2(v, visited);

	}

	private void DFS2(int v, boolean[] visited) {
		// TODO Auto-generated method stub
		System.out.println(v);
		visited[v] = true;

		for (int i = 0; i < a.get(v).size(); i++) {
			int av = a.get(v).get(i);
			if (!visited[av]) {
				DFS2(av, visited);
			}
		}

	}
}
