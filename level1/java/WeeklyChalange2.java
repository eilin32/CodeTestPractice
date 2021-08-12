package level1.java;

/**
 * 상호평가 - 자기 자신에게 매긴 점수가 유일한 최고점, 최저점일 경우 제외 - 모든 점수를 평균매겨 A,B,C,D,E,F로 학점 정하기 -
 * 하나의 문자열로 나타내 출력
 */

public class WeeklyChalange2 {
	public static void main(String[] args) {
		int[][] scores = { { 75, 50, 100 }, { 75, 100, 20 }, { 100, 100, 20 } };
		String answer = "";
		int size = scores.length;

		for (int i = 0; i < size; i++) {
			int max = -1, min = 101, sum = 0, count = 0;
			for (int j = 0; j < size; j++) {
				if (scores[i][i] == scores[j][i]) {
					count += 1;
				}
				if (max < scores[j][i]) {
					max = scores[j][i];
				}
				if (min > scores[j][i]) {
					min = scores[j][i];
				}
				sum += scores[j][i];
			}
			// System.out.println("i : "+i+" count : "+count);
			if (count == 1 && (max == scores[i][i] || min == scores[i][i])) {
				sum -= scores[i][i];
				answer += check(sum / (size - 1));
				// System.out.println("sum :" + sum +" avg :"+sum/(size - 1));
			} else {
				answer += check(sum / size);
				// System.out.println("sum :" + sum +" avg :"+sum/size);
			}
		}
		System.out.println(answer);
	}

	public static String check(float num) {
		if (num >= 90) {
			return "A";
		} else if (num >= 80) {
			return "B";
		} else if (num >= 70) {
			return "C";
		} else if (num >= 50) {
			return "D";
		} else
			return "F";
	}

}
