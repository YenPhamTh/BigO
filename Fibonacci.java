package day2;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 20;
		int fiboN = findFibonacci(n);
		System.out.println("Fibo(" + n + "): " + fiboN);
		System.out.println("BigO: O(n)");
	}

	public static int findFibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			int[] fibo = new int[n + 1];
			fibo[0] = 0;
			fibo[1] = 1;
			for (int i = 2; i <= n; i++) {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
			return fibo[n];
		}
	}
}
