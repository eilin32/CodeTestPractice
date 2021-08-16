package Java_study;

/**
 * ArrayList
 */
class ArrayL {
	private Object[] data;
	private int size;
	private int index;

	public ArrayL() {
		this.size = 1;
		this.data = new Object[this.size];
		this.index = 0;
	}

	public void add(Object obj) {
		if (this.index == this.size - 1) {
			doubling();
		}
		data[this.index] = obj;
		this.index++;
	}

	private void doubling() {
		this.size = this.size * 2;
		Object[] newData = new Object[this.size];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
	}

	public Object get(int i) throws Exception {
		if (i > this.index - 1) {
			throw new Exception("ArrayIndexoutOfBound");
		} else if (i < 0) {
			throw new Exception("Negative Value");
		}
		return this.data[i];
	}

	public void remove(int i) throws Exception {
		if (i > this.index - 1) {
			throw new Exception("ArrayIndexoutOfBound");
		} else if (i < 0) {
			throw new Exception("Negative Value");
		}
		for (int x = i; x < this.data.length - 1; x++) {
			data[x] = data[x + 1];
		}
		this.index--;
	}

}

public class ArrayList {
	public static void main(String[] args) throws Exception {
		ArrayL al = new ArrayL();
		al.add("0");
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		System.out.println(al.get(4));
		al.remove(4);
		System.out.println(al.get(4));

	}
}
