package day1;

//O(n)
public class Sort {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 2, 2, 1, 0, 0, 2, 1, 1, 0, 2 };

		int[] arrSorted = sortArray(arr);
		for (int num : arrSorted) {
			System.out.print(num + " ");
		}
	}

	// array have zeros, ones, twos
	public static int[] sortArray(int[] arr) {
		int count0 = 0;
		int count1 = 0;

		for (int num : arr) {
			if (num == 0) {
				count0++;
			}
			if (num == 1) {
				count1++;
			}
		}

		int[] arrSorted = new int[arr.length];
		for (int i = 0; i < count0; i++) {
			arrSorted[i] = 0;
		}
		for (int j = count0; j < (count0 + count1); j++) {
			arrSorted[j] = 1;
		}
		for (int k = count0 + count1; k < arr.length; k++) {
			arrSorted[k] = 2;
		}
		return arrSorted;
	}
}
