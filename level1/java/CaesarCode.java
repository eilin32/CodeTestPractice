package level1.java;

public class CaesarCode {
	public static String Caesar(String s,int n){
		String answer ="";
		for(int i =0; i<s.length(); i++){
			char c = s.charAt(i);
			if(String.valueOf(c).equals(" ")){
				answer+=" ";
			}
			else{
				int AscNum = (int)c+n;
				if(AscNum>90&&Character.isUpperCase(c)){
					AscNum = 64+(AscNum-90);
				}
				else if(AscNum >122&&Character.isLowerCase(c)){
					AscNum = 96+(AscNum-122);
				}
				answer+=String.valueOf((char)AscNum);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(Caesar("z",1));
	}
}
