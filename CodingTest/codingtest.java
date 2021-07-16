import java.lang.reflect.Array;

public class codingtest {
	public static void main(String[] args) {
		int prices[] = { 13000, 88000, 10000 };
		int discounts[] = { 30, 20 };
		int answer = 0;
		int index = 0;

		for (int a = 0; a < prices.length; a++) {
			for (int b = a + 1; b < prices.length; b++) {
				if (prices[a] < prices[b]) {
					int tmp = prices[a];
					prices[a] = prices[b];
					prices[b] = tmp;
				}
			}
		}
		for (int a = 0; a < discounts.length; a++) {
			for (int b = a + 1; b < discounts.length; b++) {
				if (discounts[a] < discounts[b]) {
					int tmp = discounts[a];
					discounts[a] = discounts[b];
					discounts[b] = tmp;
				}
			}
		}
		for (int i : prices) {
			if (index >= discounts.length) {
				answer += i;
				System.out.println("if문 내" + index + ", " + answer);
			} else {
				answer += (i * (1 - (float) (discounts[index] * 0.01)));
				System.out.println(1 - (float) (discounts[index] * 0.01));
				System.out.println("else문 내" + index + ", " + answer);
			}
			index++;
		}
		System.out.println(answer);

	}

}
