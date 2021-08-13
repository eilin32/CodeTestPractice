package level1.java;
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
		int a = 0; // n-1
		int b = 1; // n-2
		int answer =0;
		//3번째 숫자부터
		if(n==0){
			System.out.println(a);
		}
		else if(n==1){
			System.out.println(b);
		}
		else{
			for(int i =2; i<=n; i++){
				answer = a+b; // n
				a=b;
				b=answer;
			}
			System.out.println(answer);
		}
	}
}
