package Java_study;

import java.util.LinkedList;

class Graph2 {
	class Node {
		int data;
		LinkedList<Node> adjacent;
		boolean marked;

		Node(int data) {
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}

	Node[] nodes;

	Graph2(int size) {
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

	// Node의 marked가 모두 false로 초기화
	void initMarks() {
		for (Node n : nodes) {
			n.marked = false;
		}
	}

	boolean search(int i1, int i2) {
		return search(nodes[i1], nodes[i2]);
	}

	boolean search(Node start, Node end) {
		initMarks(); // 모든 플래그가 false가 되도록 초기화
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(start);// 처음 시작 노드 큐에 저장
		while (!q.isEmpty()) { // q가 빌 때까지 반복
			Node root = q.removeFirst(); // 노드를 하나 꺼냈을 때
			if (root == end) {// end의 노드와 같으면
				return true;// true를 반환
			}
			for (Node n : root.adjacent) { // 자식노드 for문
				if (n.marked == false) { // 처음 발견할 때
					n.marked = true; // marked true로 변환
					q.add(n); // q에 n 노드로 다시 초기화
				}
			}
		}
		return false; // 끝까지 돌아도 true 리턴이 안되었을 때 false 반환
	}

}

public class IsConnectGraph {
	public static void main(String[] args) {
		Graph2 g = new Graph2(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		// g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);

		System.out.println(g.search(1, 8));
	}
}
