import java.util.Scanner;

/*
이진수

Input : int T(테스트 케이스 개수), long n  (1 ≤ T ≤ 10, 1 ≤ n ≤ 10^6)
​
Output : n을 이진수로 나타냈을 경우 1의 위치를 모두 출력 (최하위 위치 0)
*/
public class Binary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		for(int i=0; i<T; i++){
			long n = s.nextInt();
			binary(n);
		}
	}

	public static void binary(long n){
		String answer ="";
		int chk =0;
		while(n>=1){
			//System.out.println("while문 시작");
			if(n%2==1){
				//System.out.println("1발견");
				answer+=chk+" ";	
			}
			else if(n==1){
				answer+=chk;
			}
			n/=2;
			chk++;
		}
		System.out.println(answer);
	}
	
}
