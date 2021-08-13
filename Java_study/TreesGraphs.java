package Java_study;

import java.util.LinkedList;
import java.util.Stack;
/**
 * tree 그래프 BFS, DFS 탐색 구현
 */
class Graph {
	class Node {
		int data;
		LinkedList<Node> adjacent; // 자식 노드(연결 된 노드)
		boolean marked; // 확인된 노드인지 체크

		Node(int data) {
			this.data = data;
			this.marked = false; 
			adjacent = new LinkedList<Node>();
		}
	}

	Node[] nodes; //자식노드가 여러개일 경우 배열로 저장

	Graph(int size) {
		nodes = new Node[size];
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(i); 
		}
	}

	void addEdge(int i1, int i2) {
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		// 같은 연결이 아닌 경우 추가
		if (!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if (!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}

	// DFS stack
	void dfs() {
		dfs(0);
	}

	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked = true;
		while (!stack.isEmpty()) {
			Node r = stack.pop();
			for (Node n : r.adjacent) {
				if (n.marked == false) {
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r);
		}
	}

	// BFS queue
	void bfs() {
		bfs(0);
	}

	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.add(root);
		root.marked = true;
		while (!queue.isEmpty()) {
			Node r = queue.remove();
			for (Node n : r.adjacent) {
				if (n.marked == false) {
					n.marked = true;
					queue.add(n);
				}
			}
			visit(r);
		}
	}

	// DFS 재귀
	void dfsR(Node r) {
		if (r == null)
			return;
		r.marked = true;
		visit(r);
		for (Node n : r.adjacent) {
			if (n.marked == false) {
				dfsR(n);
			}
		}
	}

	void dfsR() {
		dfsR(0);
	}

	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}

	void visit(Node n) {
		System.out.print(n.data + " ");
	}
}

public class TreesGraphs {
	public static void main(String[] args) {
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);

		g.dfs();// 0 1 3 5 7 6 8 4 2
	}
}
