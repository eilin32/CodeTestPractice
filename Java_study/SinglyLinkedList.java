package Java_study;

import java.util.Stack;

import Java_study.LinkedList.Node;
class LinkedList {
	 Node header;

	static class Node {
		int data;
		Node next = null;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
		}

		public Node get(int k) {
			Node n = this;
			for (int i = 0; i < k; i++) {
				n = n.next;
			}
			return n;
		}
		public Node addNext(int d){
			Node next = new Node();
			this.next = next;
			next.data =d;
			return next;
		}
		public Node addNext(Node d){
			this.next = d;
			return this.next;
		}
		public void print(){
			Node n = this;
			while(n.next!=null){
				System.out.print(n.data + "->");
				n = n.next;
			}
			System.out.println(n.data);
		}
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

	//---------끝에서 K번째 노드 찾기(전체 길이 - k + 1)
	Node KthToLast1(Node first, int k){
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
	}
	
}

class Reference {
	public int count= 0;
	
}

//합산을 위한 래퍼런스
class Storage{
	int carry =0;
	Node result = null;
}
//회문 확인을 위한 래퍼런스
class Storage2{
	public Node node;
	public boolean result;

	Storage2(Node n, boolean r){
		node = n;
		result = r;
	}
}
public class SinglyLinkedList {
	public static void main(String[] args) {
		/* LinkedList l1 = new LinkedList();
		l1.append(9);
		l1.append(8);
		l1.append(3);
		l1.append(7);
		l1.append(5);
		l1.retrieve();
		
		int k =2; */
		/* Reference r = new Reference();
		Node found = KthToLast(l1.getFirst(), k, r);
		System.out.println(found.data); */

		/* Node find = KthToLast(l1.getFirst(), k);
		System.out.println(find.data); */

		/* deleteNode(l1.get(2));
		l1.retrieve(); */

	/* 	Node n = Partition1(l1.get(1), 5);
		while(n.next != null){
			System.out.print(n.data + " -> ");
			n=n.next;
		}
		System.out.println(n.data); */

		Node n1 = new Node(5);
		Node n2 = n1.addNext(7);
		Node n3 = n2.addNext(9);
		Node n4 = n3.addNext(10);
		Node n5 = n4.addNext(7);
		Node n6 = n5.addNext(6);

		Node m1 = new Node(6);
		Node m2 = m1.addNext(8);
		Node m3 = m2.addNext(n4);

		n1.print();
		m1.print();

		Node result = getIntersection(n1, m1);
		System.out.println(result.data);
	}
	
	//-----------교차점 찾기 ---------------
	private static Node getIntersection(Node l1, Node l2){
		int len1 = getListLength(l1);
		int len2 = getListLength(l2);

		if(len1 > len2){
			l1 = l1.get(len1-len2);
		}else if(len1<len2){
			l2 = l2.get(len2-len1);
		}

		while(l1 != null && l2 != null){
			if(l1 ==l2){
				return l1;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		return null;
	}
	//----------회문인지 확인하기(두 개 포인터(재귀 호출))----------------
	private static boolean isPalindrome3(Node head) {
		int length = getListLength(head);
		Storage2 storage2 = isPalindromeRecursive(head, length);
		return storage2.result;
	}

	private static Storage2 isPalindromeRecursive(Node head, int length) {
		if (head == null || length <= 0) {
			return new Storage2(head, true);

		} else if (length == 1) {
			return new Storage2(head.next, true);
		}
		Storage2 storage2 = isPalindromeRecursive(head.next, length - 2);
		if (!storage2.result || storage2.node == null) {
			return storage2;
		}
		storage2.result = (head.data == storage2.node.data);

		storage2.node = storage2.node.next;
		return storage2;
	}
	//----------회문인지 확인하기(두 개 포인터(거북이와 토끼))----------------
	private static boolean isPalindrome2(Node head) {
		Node fast = head;
		Node slow = head;

		// char을 비교하려면 Node data와 stack의 타입을 Character로 바꿔야 함
		Stack<Integer> stack = new Stack<Integer>();

		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		//홀수인 경우 fast 다음이 null일 경우 slow를 한 칸 더 가게 함
		if (fast != null) {
			slow = slow.next;
		}
		//스택에서 쌓인 순서대로 slow data와 비교함
		while (slow != null) {
			int c = stack.pop();

			if (slow.data != c) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	//----------회문인지 확인하기(거꾸로 바꿔서 비교)----------------
	private static boolean isPalindrome1(Node head){
		Node reversed = reverseAndClone(head);
		return isEqual(head, reversed);
	}
	private static Node reverseAndClone(Node node){
		Node head = null;
		while(node != null){
			Node n = new Node(node.data);
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;
	}
	private static boolean isEqual(Node one, Node two){
		while(one !=null && two != null){
			if(one.data != two.data){
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two ==null;
	}
	//-----------Digit 합산 알고리즘---------------------
	private static Node sumLists1(Node l1, Node l2, int carry) {
		//l1, l2, c가 모두 값이 없으면 null 반환
		if (l1 == null && l2 == null && carry == 0) {
			return null;
		}
		Node result = new Node();//결과 값 노드 정의
		int value = carry;

		//자리 수가 다를 경우 l1, l2중 하나만 남았을 경우를 고려하여 하나씩 더해감
		if (l1 != null) {
			value += l1.data;
		}
		if (l2 != null) {
			value += l2.data;
		}
		result.data = value % 10;

		if (l1 != null || l2 != null) {
			Node next = sumLists1(l1 == null ? null : l1.next, l2 == null ? null : l2.next, value >= 10 ? 1 : 0);
			result.next = next;
		}
		return result;
	}

	//-----------Digit 합산 알고리즘2---------------------
	private static Node sumLists2(Node l1, Node l2) {
		int len1 = getListLength(l1);
		int len2 = getListLength(l2);

		if (len1 > len2) {
			l2 = LPadList(l2, len1 - len2);
		} else {
			l1 = LPadList(l1, len2 - len1);
		}

		Storage storage = addLists(l1, l2);
		if (storage.carry != 0) {
			storage.result = insertBefore(storage.result, storage.carry);
		}
		return storage.result;
	}

	//두 개의 노드를 각각 더하고 반환하는 함수
	private static Storage addLists(Node l1, Node l2) {
		if (l1 == null && l2 == null) {
			Storage storage = new Storage();
			return storage;
		}
		Storage storage = addLists(l1.next, l2.next);
		int value = storage.carry + l1.data + l2.data;
		int data = value % 10;
		storage.result = insertBefore(storage.result, data);
		storage.carry = value / 10;
		return storage;
	}

	// 각 노드 길이 구하는 함수
	private static int getListLength(Node l) {
		int total = 0;
		while (l != null) {
			total++;
			l = l.next;
		}
		return total;
	}

	// 해당 노드 앞에 추가해주는 함수
	private static Node insertBefore(Node node, int data) {
		Node before = new Node(data);
		if (node != null) {
			before.next = node;
		}
		return before;
	}

	// 원하는 길이 만큼 앞에 0의 값을 가진 노드를 붙여주는 함수
	private static Node LPadList(Node l, int length) {
		Node head = l;
		for (int i = 0; i < length; i++) {
			head = insertBefore(head, 0);
		}
		return head;
	}

	//--------------x보다 큰 값, 작은 값 각각 오른쪽, 왼쪽으로 정렬하기(head, tail)
	private static Node Partition1(Node n, int x){
		Node head = n;
		Node tail = n;

		while (n!=null){
			Node next = n.next;
			if(n.data <x){
				n.next = head;
				head = n;
			}else {
				tail.next =n;
				tail = n;
			}
			n = next;
		}
		tail.next = null;

		return head;
	}
	//-----------x보다 큰 값, 작은 값 각각 오른쪽, 왼쪽으로 정렬하기(포인터)--------
	
	private static Node Partition2(Node n, int x) {
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
	}

	//--------끝에서 k번째 노드 찾기 (재귀호출)-----------

	private static Node KthToLast2(Node n, int k, Reference r){
		if(n==null){
			return null;
		}
		Node found = KthToLast2(n.next, k, r);
		r.count++;
		if(r.count ==k){
			return n;
		}
		return found;
	}

	// -------------끝에서 k번째 노드 찾기 (포인터 활용)----------

	private static Node KthToLast3(Node first, int k) {
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

	//----------중간 노드 삭제하기---------------

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
