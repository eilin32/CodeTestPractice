package level1.java;
import java.util.Scanner;

/**
 * n번째 큰 수
 * 
 * input : int T(테스트 케이스) int n(공백으로 숫자 입력 10번)
 * output : 크기가 10인 배열 숫자 중 3번째 큰 수
 */
public class NthLargeNum_2693 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T>0){
			//테스트 케이스마다 새로 array 정의
			int[] array=new int[10];
			for(int i=0; i<10;i++){
				array[i]=s.nextInt();
			}
			//내림차순 정렬
			for(int i =0; i<10;i++){
				for(int j =i+1; j<10;j++){
					if(array[j]>array[i]){
						int t=array[i];
						array[i]=array[j];
						array[j]=t;
					}
				}
			}
			//3번째 원소 출력
			System.out.println(array[2]);
			T-=1;
		}
		
	}
}
