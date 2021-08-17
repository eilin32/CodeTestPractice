package Java_study;

import java.util.HashMap;

/**
 * 문자열 안의 문자들이 고유한지 확인하기
 *
 */
public class isUniqueString {
	public static void main(String[] args) {
		System.out.println(isUnique("abcddef"));
		System.out.println(isUnique("abcdef"));
		System.out.println(-------------------);
		System.out.println(isUnique2("abcddef"));
		System.out.println(isUnique2("abcdef"));
	}

	// Unicode - 해쉬 코드 이용
	private static boolean isUnique(String str) {
		HashMap<Integer, Boolean> hashmap = new HashMap<Integer, Boolean>();
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if (hashmap.containsKey(c)) {
				return false;
			}
			hashmap.put(c, true);
		}
		return true;
	}

	// ASCII - 128 크기 배열 활용
	private static boolean isUnique2(String str) {
		if (str.length() > 128)
			return false;
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
