package level1.java;

import java.util.Scanner;

/**
 * 연산자 끼워넣기 N개 수로 이루어진 수열(순서바꿈 X) N-1개 연산자로 이루어진 수열(+,-,*,/) - 우선 순위 무시, 앞에서부터
 * 계산 음수를 양수로 나눌 땐 양수로 바꾼 뒤 몫을 취한 다음 음수로 바꾼다.
 * 
 * output : 식의 결과 최대, 최솟값
 */
public class InsertOperator_14888 {
	public static int Max = Integer.MIN_VALUE;
	public static int Min = Integer.MAX_VALUE;
	public static int N;
	public static int[] num; // 수열
	public static int[] op = new int[4]; // 연산자 배열(순서대로 + - * / 개수)

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt(); // 수의 개수

		num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = s.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			op[i] = s.nextInt();
		}

		Cal(num[0], 1);
		System.out.println(Max);
		System.out.println(Min);
	}

	public static void Cal(int answer, int idx) {

		if (idx == N) {
			if (Max < answer) {
				Max = answer;
			}
			if (Min > answer) {
				Min = answer;
			}
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (op[i] != 0) {

				op[i]--;
				switch (i) {
					case 0:
						Cal(answer + num[idx], idx + 1);
						break;
					case 1:
						Cal(answer - num[idx], idx + 1);
						break;
					case 2:
						Cal(answer * num[idx], idx + 1);
						break;
					case 3:
						Cal(answer / num[idx], idx + 1);
						break;
				}

				op[i]++;
			}
		}

	}
}
