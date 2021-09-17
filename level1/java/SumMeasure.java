package level1.java;

public class SumMeasure {
	public static int sumMeasure(int n){
		int sum =0;
		for(int i=1; i*i<=n; i++){
			if(i*i==n){
				sum+=i;
			}
			else if(n%i==0){
				sum+= (i+n/i);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumMeasure(1));
	}
}
