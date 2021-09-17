package level1.java;
/**
 * 2016년 1월 1일 금요일
 * 2016년 a월 b일은 무슨 요일?
 */
public class year2016 {
	static String[] day={"SUN","MON","TUE","WED","THU","FRI","SAT"};
	static int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
	public static void calDay(int a, int b){
		int sum =0;
		for(int i=0; i<a; i++){
			sum+=days[i];
		}
		System.out.println(day[7-(sum+b)%7]);
	}
	public static void main(String[] args) {
		

		calDay(5,24);
	}
	
}
