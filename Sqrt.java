package day1;

//Big O = x/2*10000 = x*5000 ---> O(n)
public class Sqrt {
	public static void main(String[] args) {
		double x = 1999999999;
		System.out.println("My sqrt  : " + mySqrt(x));
		System.out.println("Math.sqrt: " + Math.sqrt(x));
	}

	public static double mySqrt(double num) {
		double incremental = 0.0001;
		double sqrt = 0;
		
		while ((sqrt * sqrt < num) && (sqrt < num)) {
			sqrt = sqrt + incremental;
		}
		
		return sqrt;
	}
}
