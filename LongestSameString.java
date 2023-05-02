package day1;

//O(m*n)
public class LongestSameString {

	public static void main(String[] args) {

		String[] str = { "flower","flow", "fly" };
		String sameString = findLongestSameString(str);
		System.out.println(sameString);
	}

	public static String findLongestSameString(String[] str) {

		// find string length of each item in array
		int[] stringLength = new int[str.length];
		for (int i = 0; i < str.length; i++) { //loop: n
			stringLength[i] = str[i].length();
		}
		// find the shortest string
		int min = stringLength[0];
		String minString = null;
		for (int i = 1; i < stringLength.length; i++) { //loop: n
			if (stringLength[i] < min) {
				min = stringLength[i];
				minString = str[i];
			}
		}
		// go through each char of minString
		String sameString = "";
		for (int i = 0; i < min; i++) { //loop: m = min;
			
			char test = minString.charAt(i);
			boolean countSame = false;
			
			for (int j = 0; j < str.length; j++) { // loop: n
				if (str[j].charAt(i) != test) {
					break;
				}
				else countSame = true;
			}
			if (countSame == true) {
				sameString = sameString + minString.charAt(i);
			}
		}
		if (sameString == "") {
			System.out.println("There's no common prefix");
		}
		return sameString;
	}
}
