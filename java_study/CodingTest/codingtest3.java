package CodingTest;
public class codingtest3 {
	public static void main(String[] args) {
		String s = "aabcbcd";
		String t = "abc";
		int result = -1;
		while (true) {
			++result;
			if (s.indexOf(t) != -1) {
				System.out.println(s.replaceAll(t, ""));
				s = s.replaceAll(t, "");
				System.out.println(result);
			} else {
				break;
			}
		}
		System.out.println("최종" + result);
	}

}
