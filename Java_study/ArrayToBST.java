package Java_study;

/**
 * 1. 배열을 binary search tree로 만들기(makeTree)
 */

class Tree2 {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;
	// 1.---------------------------------------------------
	// 배열을 트리로 만들기 시작할 함수(배열, 첫번째 요소, 마지막 요소)
	public void makeTree(int[] a) {
		root = makeTreeR(a, 0, a.length - 1);
	}

	// 반복 재귀 함수
	public Node makeTreeR(int[] a, int start, int end) {
		if (start > end)
			return null;//재귀 함수 종료 조건
		int mid = (start + end) / 2;// 중간 값
		Node node = new Node(a[mid]); // 중간 노드 정의
		node.left = makeTreeR(a, start, mid - 1);
		node.right = makeTreeR(a, mid + 1, end);
		return node;
	}
	// 이진 검색 확인
	public void searchBTree(Node n, int find) {
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			searchBTree(n.left, find);
		} else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			searchBTree(n.right, find);
		} else {
			System.out.println("Data found!");
		}
	}
}

public class ArrayToBST {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		Tree2 t = new Tree2();
		t.makeTree(a);
		t.searchBTree(t.root, 2);
	}
}
