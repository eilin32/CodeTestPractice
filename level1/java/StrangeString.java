package level1.java;
/**
 * 이상한 문자
 * 
 * 첫번째 문자는 0번째로 간주
 * 공백을 기준으로 짝수번째 문자는 대문자로, 홀수번째 문자는 소문자로
 */
public class StrangeString {
	public static void ChangeWord(String s){
		int count =0;
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<s.length(); i++){
			System.out.println(s.charAt(i)+" "+count);
			if(String.valueOf(s.charAt(i)).equals(" ")){
				count = 0;
				sb.append(" ");
			}
			else{
				if(count%2==0){
					sb.append(String.valueOf(s.charAt(i)).toUpperCase());
				}
				else sb.append(String.valueOf(s.charAt(i)).toLowerCase());
				count++;
			}
		}
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
		ChangeWord("try hello");
		ChangeWord("sp ace");
	}
}
