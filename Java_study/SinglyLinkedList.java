package Java_study;

import Java_study.LinkedList.Node;

class LinkedList {
	Node header;

	static class Node {
		int data;
		Node next = null;
	}

	LinkedList() {
		header = new Node();
	}

	// 노드 추가
	void append(int d) {
		Node end = new Node();
		end.data = d;
		Node n = header;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	// 노드 삭제
	void delete(int d) {
		Node n = header;
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}
	}

	// 노드 출력
	void retrieve() {
		Node n = header.next;
		while (n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);
	}

	//중복값 제거
	void removeDups() {
		Node n = header;
		while (n != null && n.next != null) {
			Node r = n;
			while (r.next != null) {
				if (n.data == r.next.data) {
					r.next = r.next.next;
				} else {
					r = r.next;
				}
			}
			n = n.next;
		}
	}
	
	// 첫번째 노드 불러오기
	Node getFirst() {
		Node n = header;
		return n;
	}

	// k번째 노드 불러오기
	Node get(int k) {
		Node n = header;
		for (int i = 0; i < k; i++) {
			n = n.next;
		}
		return n;
	}

	//끝에서 K번째 노드 찾기(전체 길이 - k + 1)
	/* Node KthToLast(Node first, int k){
		Node n = first;
		int total =1;
		while(n.next !=null){
			total++;
			n=n.next;
		}
		n=first;
		for(int i =1; i<total-k+1; i++){
			n=n.next;
		}
		return n;
	} */
	
}

class Reference {
	public int count= 0;
	
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.append(9);
		l1.append(8);
		l1.append(3);
		l1.append(7);
		l1.append(5);
		l1.retrieve();
		
		int k =2;
		/* Reference r = new Reference();
		Node found = KthToLast(l1.getFirst(), k, r);
		System.out.println(found.data); */

		/* Node find = KthToLast(l1.getFirst(), k);
		System.out.println(find.data); */

		/* deleteNode(l1.get(2));
		l1.retrieve(); */

		Node n = Partition(l1.get(1), 5);
		while(n.next != null){
			System.out.print(n.data + " -> ");
			n=n.next;
		}
		System.out.println(n.data);
	}

	//x보다 큰 값, 작은 값 각각 오른쪽, 왼쪽으로 정렬하기(head, tail)
	private static Node Partition(Node n, int x){
		Node head = n;
		Node tail = n;

		while (n!=null){
			Node next = n.next;
			if(n.data <x){
				n.next = head; // head->n.next(head)
				head = n; // head(n)
			}else {
				tail.next =n;
				tail = n;
			}
			n = next;
		}
		tail.next = null;

		return head;
	}
	//x보다 큰 값, 작은 값 각각 오른쪽, 왼쪽으로 정렬하기(포인터)
	/* private static Node Partition(Node n, int x) {
		Node s1 = null;
		Node e1 = null;
		Node s2 = null;
		Node e2 = null;

		while (n != null) {
			Node next = n.next; //n을 s1,s2에 추가할 때 다음 노드는 없어야하기 때문에 초기화 전 다음 노드를 따로 저장한다.
			n.next = null;
			if (n.data < x) {
				if (s1 == null) {
					s1 = n; 
					e1 = s1;//s1의 포인터 개념과 같은 것, el.next로 추가되면 s1에도 추가 됨.

				} else {
					e1.next = n; //el의 다음에 노드를 추가하고
					e1 = n;//e1이 마지막 노드가 되도록 한다.
				}

			} else {
				if (s2 == null) {
					s2 = n;
					e2 = s2;

				} else {
					e2.next = n;
					e2 = n;
				}

			}
			n = next;
		}
		if(s1==null){
			return s2;
		}
		e1.next = s2;
		return s1;
	} */

	//끝에서 k번째 노드 찾기 (재귀호출)
	/* private static Node KthToLast(Node n, int k, Reference r){
		if(n==null){
			return null;
		}
		Node found = KthToLast(n.next, k, r);
		r.count++;
		if(r.count ==k){
			return n;
		}
		return found;
	} */

	// 끝에서 k번째 노드 찾기 (포인터 활용)
	private static Node KthToLast(Node first, int k) {
		Node p1 = first;
		Node p2 = first;

		for (int i = 0; i < k; i++) {
			if (p1 == null)
				return null;
			p1 = p1.next;
		}

		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	//중간 노드 삭제하기
	private static boolean deleteNode(Node n){
		if(n==null|| n.next==null){
			return false;
			//처음과 마지막 노드는 삭제 불가
		}
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}
}
