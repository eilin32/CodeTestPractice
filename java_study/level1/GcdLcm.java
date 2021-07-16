package level1;
import java.util.Scanner;

/**
 * 최대 공약수 최소 공배수
 * input : int a int b
 * output : gcd \n lcm
 */
public class GcdLcm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int gcd = GCD(a, b);
		int lcm = (a*b)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
public static int GCD(int a, int b){
	if(a%b == 0){
		return b;
	}
	else return GCD(b, a%b);
}
}
