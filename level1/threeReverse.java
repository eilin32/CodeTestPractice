import java.util.ArrayList;
import java.util.Collections;

public class threeReverse {

	public static void main(String[] args) {
		int answer = 0;
		int n = 3;
		int a = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();

		while (n >= 3) {
			a = n % 3;
			A.add(a);
			n = n / 3;
		}
		A.add(n);
		Collections.reverse(A);

		System.out.println(A);
		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				answer += A.get(i);
				System.out.println("i가 0: " + answer);
			} else {
				a = A.get(i) * (int) Math.pow(3, i);
				answer += a;
				System.out.println("else" + i + "번: " + answer);
			}
		}
		System.out.println(answer);
	}

}
