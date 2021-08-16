package Java_study;

/**
 * 해쉬 테이블
 */

import java.util.LinkedList;

class HashT {
	class Node {
		String key;
		String value;

		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}

		String value() {
			return value;
		}

		void value(String value) {
			this.value = value;
		}
	}

	LinkedList<Node>[] data;

	HashT(int size) {
		this.data = new LinkedList[size];
	}
	//해쉬 코드 구현하기
	int getHashCode(String key) {
		int hashcode = 0;
		for (char c : key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}
	//정보를 넣을 해쉬테이블 인덱스 정하기
	int convertToIndex(int hashcode) {
		return hashcode % data.length;
	}
	//해쉬 테이블에서 해당 key가 있는 list 검색하기
	Node searchKey(LinkedList<Node> list, String key) {
		if (list == null)
			return null;
		for (Node node : list) {
			if (node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}

	void put(String key, String value) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		if (list == null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}
		Node node = searchKey(list, key);
		if (node == null) {
			list.addLast(new Node(key, value));//해당 linkedlist 마지막에 새 노드 추가
		} else {
			node.value(value);
		}
	}

	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		return node == null ? "Not found" : node.value();
	}
}

public class HashTable {
	public static void main(String[] args) {
		HashT h = new HashT(3);
		h.put("sung", "She is pretty");
		h.put("jin", "She is a model");
		h.put("hee", "She is an angel");
		h.put("min", "She is cute");
		System.out.println(h.get("sung"));
	}
}
