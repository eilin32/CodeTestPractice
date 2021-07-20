package Java_study;
//자바 내장 함수 활용

import java.util.Iterator;
import java.util.LinkedList;

public class New_LinkedList {
	public static void main(String[] args) {
		//링크리스트 선언
		LinkedList<Integer> list = new LinkedList<>();

		//링크리스트 원소 추가
		list.add(1);
		list.add(2); //데이터 추가 1->2
		list.addFirst(3); //가장 앞에 데이터 추가 3->1->2
		list.addLast(1); //가장 뒤에 데이터 추가 3->1->2->4
		list.add(2, 5); //index 2 뒤에 데이터 5 추가 3->1->5->2->4

		//링크리스트 원소 삭제
		//list.removeFirst(); //가장 앞 데이터 제거
		//list.removeLast(); //가장 뒷 데이터 제거
		//list.remove(); //index 제거 생략 시 0번째 제거
		//list.clear(); //모든 값 제거
		
		//링크리스트 길이
		int length = list.size();

		//링크리스트 값 출력
		for(int i : list){
			System.out.println(i);
		}

		Iterator<Integer> iter = list.iterator(); // Iterator 선언

		while(iter.hasNext()){
			System.out.println(iter.next());
		}

		//링크리스트 값 검색
		boolean chk = list.contains(1);//list에 1이 있는가(true/false)
		System.out.println(list.indexOf(1));//1이 있는 첫번째 index 반환(없으면 -1)
	}

}
