package Java_study;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 2. 이진트리를 레벨단위 리스트로 변경하기(BSTtoList)
 */

class Tree3 {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	Tree3(int size) {
		root = makeBST(0, size - 1);
	}

	public Node makeBST(int start, int end) {
		if (start > end)
			return null;// 재귀 함수 종료 조건
		int mid = (start + end) / 2;// 중간 값
		Node node = new Node(mid);
		node.left = makeBST(start, mid - 1);
		node.right = makeBST( mid + 1, end);
		return node;
	}

	// ----------------------------------------------------------
	// 1. 함수 호출할 때마다 level 반환하기(재귀))
	ArrayList<LinkedList<Node>> BSTtoList() {
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		BSTtoList(root, lists, 0);
		return lists;
	}

	void BSTtoList(Node root, ArrayList<LinkedList<Node>> lists, int level) {
		if (root == null)
			return; // 재귀 종료 족건
		LinkedList<Node> list = null;
		if (lists.size() == level) { //lists의 크기가 호출된 level과 같으면 새로 리스트 만들기
			list = new LinkedList<Node>();
			lists.add(list); //lists에 새 연결 노드 list추가
		} else {
			list = lists.get(level); //다르면 lists의 해당 레벨 연결 노드 불러오기
		}
		list.add(root);//해당 노드 연결 노드 list에 넣기
		BSTtoList(root.left, lists, level + 1);
		BSTtoList(root.right, lists, level + 1);
	}

	// 2. 자식노드 별로 리스트에 새로 저장하기
	ArrayList<LinkedList<Node>> BSTtoList2() {
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current = new LinkedList<Node>(); //현재 연결 노드
		if (root != null) {//null이 아니면 현재 연결 노드에 넣기
			current.add(root);
		}
		while (current.size() > 0) {//현재 연결 노드 없어질 때까지 반복
			result.add(current); // 현재 연결 노드 arraylist에 저장
			LinkedList<Node> parents = current;//현재 연결 노드를 부모 노드로 저장
			current = new LinkedList<>();//새로 현재 연결 노드 정의
			for (Node parent : parents) { // 자식 노드를 현재 연결 노드에 저장
				if (parent.left != null)
					current.add(parent.left);
				if (parent.right != null)
					current.add(parent.right);
			}
		}
		return result;
	}
	// 리스트 출력하기 
	void printList(ArrayList<LinkedList<Node>> arr) {
		for (LinkedList<Node> list : arr) {
			for (Node node : list) {
				System.out.print(node.data + " ");
			}
			System.out.println();
		}
	}

}

public class BSTtoList {
	public static void main(String[] args) {
		Tree3 t = new Tree3(10);
		t.printList(t.BSTtoList());
		System.out.println();
		t.printList(t.BSTtoList2());
	}
}
