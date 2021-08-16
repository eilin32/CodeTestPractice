package Java_study;
/**
 * StringBuilder
 */
class StringB {
	private char[] value;
	private int size;
	private int index;
	
	StringB() {
		size =1;
		value = new char[size];
		index = 0;
	}
	
	public void append(String str){
		if(str == null) str = null;
		int len = str.length();
		ensureCapacity(len);
		for(int i =0; i<str.length(); i++){
			value[index] = str.charAt(i);
			index++;
		}
		System.out.println(size +", "+index);
	}

	private void ensureCapacity(int len){
		if(index + len > size){
			size=(size+len)*2;
			char[] newValue = new char[size];
			for(int i =0; i<value.length; i++){
				newValue[i] = value[i];
			}
			value = newValue;
			System.out.println("*** "+size +", "+index);
		}
	}

	public String toString(){
		return new String(value,0, index);
	}
}
public class StringBuilder {
	public static void main(String[] args) {
		StringB sb = new StringB();
		sb.append("sung"); // 10 수용량 늘리고 다음 index 4
		sb.append(" is"); // 다음 index 7
		sb.append(" pretty"); // 수용량 늘려서 크기 34 다음 index 14
		System.out.println(sb.toString());
	}
}
