public class devcoding1 {
	public static void main(String[] args) {
		int d[] = {1,3,2,5,4};
		int m = 6;
		int answer = 0;
        int box =1;
        int i =0;
        while(i<d.length){
            if(box<=d[i]){
                m-=box;
                answer+=1;
                box*=2;
                if(m<=0){
                    break;
                }
            }
            else{
                box=1;
								answer+=1;
            }
						System.out.println(d[i] + " " +answer);
						i+=1;
						
        }
        if(m>0){
            answer =-1;
        }
			System.out.println(answer);
	
	}
}
