package level1.java;

import java.util.Scanner;

/**
 * 쉽게 푸는 문제 1 2 2 3 3 3 4 4 4 4 ... n 배열 중
 * 
 * input : int A(구간 시작), int B(구간 끝) output : A번째 숫자 부터 B번째 숫자까지 합
 */
public class EasyQ_1292 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();s.close();
		int sum = 0;// 숫자가 커질 때마다의 해당 숫자 마지막 순서
		int numA = 0;// A번째 해당 숫자
		int numB = 0;// B번째 해당 숫자
		int restA = 0;// A번째 해당 숫자의 남은 수
		int restB = 0;// B번째 해당 숫자의 이전 개수
		int answer =0;// 구간 총 합

		// A구간 찾기
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum >= A) {
				numA = i;
				restA = sum - A + 1;
				sum = 0;
				break;
			}
		}
		System.out.println("A구간 : "+numA +", "+restA);
		// B구간 찾기
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum >= B) {
				numB = i;
				restB = i - (sum - B);
				sum = 0;
				break;
			}
		}
		System.out.println("B구간 : "+numB +", "+restB);
		// 합 구하기
		if(numA==numB){
			answer = numA*(B-A+1);
			System.out.println(answer);
		}
		else{
			for (int i = numA; i <= numB; i++) {
				if (i == numA) {
					answer += (i * restA);
				} else if (i == numB) {
					answer += (i * restB);
				} else {
					answer += i * i;
				}
	
			}
			System.out.println(answer);
		}
		
	}
}
