package Java_study;

import java.util.EmptyStackException;

class Stack<T> {
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	//맨 위에 있는 top 노드 설정
	private Node<T> top;

	//Stack top 노드 꺼내기 
	public T pop() {
		//스택에 아무것도 안 들어있을 경우 throw
		if (top == null) {
			throw new EmptyStackException();
		}

		T item = top.data; //top 노드 데이터 불러오기
		top = top.next; //top을 다음 노드로 설정하기
		return item;
	}

	//Stack 노드 추가
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top; // t의 다음 노드를 기존 top 노드로 설정
		top = t; // top을 t 노드로 다시 설정
	}

	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	//top이 null일 경우 true 반환
	public boolean isEmpty() {
		return top == null;
	}
}
public class StackA {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}
}
