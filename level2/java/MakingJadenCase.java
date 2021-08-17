package level2.java;
/**
 * JadenCase 문자열 만들기
 */
public class MakingJadenCase {
	public static void main(String[] args) {
		String s = "   A peOple unFollowed me";
		StringBuilder sb = new StringBuilder(s);
		String answer = makeJadenCase(sb);
		System.out.println(answer);
	}
	private static String makeJadenCase(StringBuilder s){
		int count =0;
		for(int i=0; i<s.length(); i++){
			System.out.println(count);
			if(count ==0 && Character.isLowerCase(s.charAt(i))){
				s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else if(count!=0 && Character.isUpperCase(s.charAt(i))){
				s.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
			count++;
			if(s.charAt(i)==' '){
				count =0;
			}
		}
		return s.toString();
	}
}
