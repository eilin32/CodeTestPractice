package Java_study;

import java.util.NoSuchElementException;

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	// Queue 특성상 처음과 끝 노드를 설정
	private Node<T> first;
	private Node<T> last;

	// Queue 노드 추가
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		// last가 null이 아닐 때(저장된 데이터가 있을 경우)
		if (last != null) {
			last.next = t; // 마지막 노드 다음을 t노드로 설정
		}
		last = t; // 마지막 노드를 t로 설정

		// 처음이 null일 때(앞 노드들이 다 빠져서 last가 first로 된 경우)
		if (first == null) {
			first = last;
		}
	}

	// Queue 노드 삭제
	public T remove() {
		// 처음 노드가 없을 경우 예외 처리
		if (first == null) {
			throw new NoSuchElementException();
		}

		// first.data를 data(반환용)에 따로 저장한 다음 first를 first 다음 노드로 설정
		T data = first.data;
		first = first.next;

		if (first == null) {
			last = null;
		}
		return data;
	}

	public T peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}

	public boolean isEmpty() {
		return first == null;
	}
}

public class QueueA {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
	}
}
