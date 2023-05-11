package day4;

public class ReplaceLetter {

	public static void main(String[] args) {
		String[] strs = { "baaaaa", "baaabbaabbba", "baabab" };
		for (String str : strs) {
			int minMoves = MinMoveToGetSrtNo3IdenticalLetter(str);
			System.out.println("Str: " + str + " - Min moves: " + minMoves);
		}
	}

	public static int MinMoveToGetSrtNo3IdenticalLetter(String str) {
		int moves = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				if (str.charAt(i) == 'a') {
					Swap(str.charAt(i + 1), 'b');
				} else
					Swap(str.charAt(i + 1), 'a');
				i = i + 2;
				moves++;
			}
		}
		return moves;
	}

	public static void Swap(char x, char y) {
		char temp = x;
		x = y;
		y = temp;
	}
}
