package day3;

public class Feast {
	public static void main(String[] args) {
		int wallet = 30;
		int price = 3;
		int exchange = 2;

		int theFeast = findTheFeast(wallet, price, exchange);
		System.out.println(
				"The feast: " + theFeast + " (wallet: " + wallet + " price: " + price + " exchange: " + exchange + ")");
		System.out.println("O(logn)");
	}

	public static int findTheFeast(int n, int c, int m) {
		int q = Math.floorDiv(n, c);
		int max = 0;
		int exchanged = 0;
		int mode = 0;
		for (int i = 0; Math.pow(m, i) < q; i++) {
			max = Math.max(max, i);
		}

		for (int i = 1; i <= max; i++) {
			exchanged = (int) (exchanged + q / Math.pow(m, i));
			mode = (int) (mode + exchanged % m);
		}

		int theFeast = q + exchanged + (mode + 1) / m;
		return theFeast;
	}
}
