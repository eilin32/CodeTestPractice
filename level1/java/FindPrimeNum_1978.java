package level1.java;
import java.util.Scanner;

/**
 * 소수 찾기
 * 
 * input : int N int num(N가지 숫자)
 * output : N개의 num 중 소수가 몇 개인지
 */
public class FindPrimeNum_1978 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int count =0;
		for(int i=0;i<N;i++){
			int num = s.nextInt();
			//소수확인
			if(FindPrime(num)){
				count+=1;
			}
		}
		System.out.println(count);
	}
	//num이 소수임을 판정하기 위해선 루트num 까지의 수 중 1을 제외하고 그 자연수의 약수가 있는지 확인하면 된다.
	//즉, num보다 작은 숫자중 제곱 값이 num보다 작거나 같은 경우 나머지가 있는지 확인
	public static Boolean FindPrime(int num){
		if(num<2) return false;
		for(int i=2;i*i<=num;i++){
			if(num%i==0) return false;
		}
		return true;
	}
}
