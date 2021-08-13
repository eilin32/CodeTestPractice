package level1.java;

/**
 * n개의 숫자들의 최소 공배수 구하기
 * 최소 공배수 : 배수 중 공통이 되는 가장 작은 숫자
 */
public class NnumLCM {
	//최대 공약수 구하기
	public static int gcd(int a, int b) {
		if(b!=0){
			int r = a%b;
			return gcd(b,r);
		}
		else return a;
	}
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int answer = arr[0];

		for(int i =1; i<arr.length; i++){
			answer = answer*arr[i]/gcd(answer,arr[i]);
		}
		System.out.println(answer);
	}
}
