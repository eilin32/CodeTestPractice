
public class codingtest2 {
	public static void main(String[] args) {
		
		String s ="abcxyptxyabc";
		String[] answer ={};

		StringBuffer A = new StringBuffer();
    StringBuffer B = new StringBuffer();
		
    for(int i =0; i <s.length()/2;i++){
			
				A.append(s.charAt(i));
				B.insert(0, s.charAt((s.length()-1)-i));
				System.out.println(A +", " +B);

				if(A.toString().equals(B.toString())){
					s=s.substring(0, i+1)+" "+s.substring(i+1,(s.length()-1)-i)+" "+s.substring((s.length()-1)-i);
					System.out.println(s);
					
					A.setLength(0);
					B.setLength(0);
					i++;
				}

		}
		s=s.replaceAll("\\s{2}", " ");
		answer = s.split(" ");
		for(int i=0; i<answer.length; i++){
			System.out.println(answer[i]);
		}
		
	}
}
