package level1.java;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피보나치 수 5
 * 
 * input : int n (0<=n<=20)
 * output : n번째 피보나치 수
 */
public class FibonacciNum_10870 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();s.close();
		
		//System.out.println("1. 재귀호출 방법: "+fibo(n));

		Integer[] memo = new Integer[n+1];
		System.out.println("2. 결과 저장 재귀호출 방법: "+fibo2(n,memo));

		System.out.println("3. bottom_up 방법: "+fibo3(n));
	}

	//재귀 호출 (O(2^n)) 시간이 비효율적이다
	public static int fibo(int n){
		if(n==0) return 0;
		else if(n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}

	//이미 구한 값은 m 배열에 저장함으로써 중복된 재귀 호출을 줄일 수 있다.
	public static int fibo2(int n, Integer[] m){
		// int 형은 null 체크가 안 되므로 Integer배열로 받아야한다.
		if(m[n] != null) return m[n];
		int result;
		if(n==0) result = 0;
		else if(n==1) result =1;
		else result = fibo2(n-1,m) + fibo2(n-2, m);
		return result;
	}
	
	//배열에 순차적으로 값을 저장하고 더해가면서 n번째 숫자 구하기
	public static int fibo3(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		ArrayList<Integer> bottom_up = new ArrayList<Integer>();
		bottom_up.add(0);
		bottom_up.add(1);
		for(int i=2; i<=n; i++){
			bottom_up.add(i,bottom_up.get(i-1)+bottom_up.get(i-2));
		}
		return bottom_up.get(n);
	}
}
