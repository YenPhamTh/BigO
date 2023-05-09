package day3;

public class MinDistance {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 3, 7, 1, 3, 4, 1, 1, 7 };
		int minDistance = findMinDistance(arr);
		System.out.println("minDistance: " + minDistance);
		System.out.println("O(n^2)");
	}

	public static int findMinDistance(int[] arr) {
		int min = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					min = Math.min(min, j - i);
				}
			}
		}
		return min;
	}
}