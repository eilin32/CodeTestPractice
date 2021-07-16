package level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 일곱 난쟁이
 * 진짜 일곱 난쟁이들의 키 합은 100
 * 
 * input : 아홉 난쟁이의 키 나열
 * output : 일곱 난쟁이 키 나열
 */
public class SevenDwarfs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> array =new ArrayList<>();
		int sum =0;//아홉난쟁이 키 합
		int tsum =0;//아홉난쟁이 키 합 - 100
		for(int i =0;i<9;i++){
			int key = s.nextInt();
			array.add(key);
			sum+=key;
		}
		tsum=sum-100;
		loop1:
		for(int i=0; i<array.size();i++){
			for(int j=1; j<array.size();j++){
				if(array.get(i)+array.get(j)==tsum){
					array.remove(i);
					array.remove(j-1);
					break loop1;//이중 반복문
				}
			}
		}
		Collections.sort(array);
		for(int i=0; i<array.size();i++){
			System.out.println(array.get(i));//한 원소씩 출력해야 함
		}
	}
}
