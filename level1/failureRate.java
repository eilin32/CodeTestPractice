import java.util.*;
import java.util.stream.Stream;

/**
 * failureRate
 */
public class failureRate {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		//N+1은 마지막 스테이지(N)까지 클리한 사람
		int[] answer;
		int count=0;//스테이지 도달 인원수
		int failcount =0;//스테이지 실패 인원
		HashMap<Integer,Float> fmap = new HashMap<Integer,Float>();

		for(int n=1; n<=N; n++){
			for(int i =0; i<stages.length; i++){
				if(stages[i]>=n){
					count+=1;
					if(stages[i]==n){
						failcount+=1;
					}
				}
			}
			System.out.println();
			fmap.put(n, (float)failcount/count);
			failcount =0;
			count=0;
		}
		
		System.out.println(fmap);
		Stream<Map.Entry<Integer,Float>> sorted=fmap.entrySet().stream().sorted(Map.Entry.comparingByKey());
		sorted.forEach(s->array[]);
		System.out.println(sorted);
	
	}
}