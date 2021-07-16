package level1.java;
import java.util.Scanner;

/**
 * 지능형 기차 2
 * 1~10번 역까지 타거나 내리는 사람 수를 자동으로 인식
 * 출발역에서 종착역까지 가는 도중 기차 안에서 사람이 가장 많을 때의 사람 수
 * (내릴 사람 모두 내린 후 기차에 탄다고 가정)
 * 1. 역 번호 순서대로 운행
 * 2. 출발역 내린 사람 수와 종착역에서 탄 사람 수는 0
 * 3. 각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없음
 * 4. 최대 10000명까지 탑승 가능
 * 
 * input : 내린 사람 수 + " "+ 탄 사람 수(10번 반복)
 * output : 가장 많았던 탑승 명 수
 */
public class IntelligentTrain2_2460 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = 0; //탑승 인원
		int u = 0; //내린 사람 수
		int t = 0; //탄 사람 수
		int answer = 0; //가장 많았던 탑승 명 수
		for(int i=0; i<10; i++){
			u = s.nextInt();
			t = s.nextInt();
			p = p-u+t;
			if(p>answer){
				answer = p;
			}
		}
		System.out.println(answer);
	}
}
