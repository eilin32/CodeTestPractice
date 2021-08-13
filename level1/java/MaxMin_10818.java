package level1.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
최소, 최대
input : long N (1<=N<=1000000) = 정수의 개수
				long array num = 정수들
output : 정수 중 최솟값, 최댓값 공백 구분 출력
*/
public class MaxMin_10818 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		ArrayList<Long> num = new ArrayList<>();
		for(int i =0; i<N; i++){
			num.add(i,s.nextLong());
		}

		s.close();
		Collections.sort(num);
		System.out.println(num.get(0)+" "+num.get(num.size()-1));
	}
}
