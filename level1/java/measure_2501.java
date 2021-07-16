package level1.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * measure
 * 약수 구하기
 * input : int N, int K
 * output : N의 약수 중 K번째 숫자
 */
public class measure_2501 {

	public static void main(String[] args) {
		//input
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		

		//logic
		ArrayList<Integer> m = new ArrayList<Integer>();
		for(int i =1; i<N; i++){
			if(N%i==0){
				int j = N/i;
				if(i<j){
					m.add(i);
					m.add(j);
				}
				else if(i==j){
					m.add(i);
				}
				else{
					break;
				}
			}
		}
		Collections.sort(m);
		//System.out.println(m);
		//output
		if(m.size()>=K){
			System.out.println(m.get(K-1));
		}
		else{
			System.out.println(0);
		}
	}
}