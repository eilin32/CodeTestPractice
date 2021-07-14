import java.util.ArrayList;
import java.util.Arrays;


public class devcoding2 {
	public static void main(String[] args) {
		int deposit[] = {2000,500,500,-1000};
		int[] answer={};
        ArrayList<Integer> Answer = new ArrayList<Integer>();
        int j = 0;
        for(int i =0; i<deposit.length; i++){
            if(deposit[i]>0){
                Answer.add(deposit[i]);
                j+=1;
								System.out.println(Answer+", j="+j);
            }
            else{
                Answer.set(j-1,Answer.get(j-1)+deposit[i]);
								if(Answer.get(j-1)<0){
									while(Answer.get(j-1)<0){
										Answer.set(j-2,Answer.get(j-2)+Answer.get(j-1));
										Answer.remove(j-1);
                    j-=1;
									} 
                }
								System.out.println(Answer+", j="+j);
            }
        }
				Answer.removeAll(Arrays.asList(Integer.valueOf(0)));
        System.out.println(Answer);
        answer= Answer.stream().mapToInt(Integer::intValue).toArray();
				System.out.println(answer);
	}
}
