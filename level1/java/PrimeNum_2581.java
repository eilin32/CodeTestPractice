package level1.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 소수
 * 
 * input : int M (M<=N) int N
 * output : M이상 N이하 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합, 둘째 줄에 최솟 값
 * 단, 소수 없을 땐 첫째 줄 -1 출력
 */
public class PrimeNum_2581 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		int sum=0;
		int min=10000;
		ArrayList<Integer> array = new ArrayList<>();

		for(int i = M; i<=N; i++){
			//i이 소수인지 확인 후 소수가 맞으면 array에 추가
			if(FindPrime(i)){
				array.add(i);
			}		
		}
		if(array.size()>0){
			for(int i:array){
				sum +=i;
				if(min>i){
					min=i;
				}
			}
			System.out.println(sum);
			System.out.println(min);

		}
		else{
			System.out.println(-1);
		}
	}
	public static Boolean FindPrime(int n){
		if(n<2) return false;
		for(int i=2; i*i<=n; i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
