package day1;

//O(n)

public class RomanNumber {
	public static void main(String[] args) {
		String s = "MCMXCIV";

		// create array contain value of each symbol
		int[] values = new int[s.length()];
		int sum = 0;

		// sum value of all symbols
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			switch (letter) {
			case 'M':
				values[i] = 1000;
				break;
			case 'D':
				values[i] = 500;
				break;
			case 'C':
				values[i] = 100;
				break;
			case 'L':
				values[i] = 50;
				break;
			case 'X':
				values[i] = 10;
				break;
			case 'V':
				values[i] = 5;
				break;
			case 'I':
				values[i] = 1;
				break;
			}
			sum = sum + values[i];
		}

		// deduct special cases:
		for (int j = 0; j < values.length - 1; j++) {
			if (values[j] < values[j + 1]) {
				sum = sum - 2 * values[j];
			}
		}
		System.out.println("Roman string: " + s + " - Value converted: " + sum);
	}
}
