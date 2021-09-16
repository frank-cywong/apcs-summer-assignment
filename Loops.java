public class Loops{
	public static double power(double x, int n){
		double output = 1;
		for(int i = 1; i <= n; i++){
			output *= x;
		}
		return output;
	}
	public static int factorial(int x){
		int output = 1;
		for (int i = 1; i <= x; i++){
			output *= i;
		}
		return output;
	}
	public static double myexp(double x, int n){
		double output = 1;
		for (int i = 2; i <= n; i++){
			output += Math.pow(x,i-1)/(double)(factorial(i-1));
		}
		return output;
	}
	public static double myexp_fast(double x, int n){
		double output = 1;
		double lastterm = 1;
		for (int i = 1; i < n; i++){
			lastterm = lastterm * x / i;
			output += lastterm;
		}
		return output;
	}
	public static void check(double x){
		System.out.println(x + "\t" + myexp_fast(x, 100) + "\t" + Math.exp(x));
	}
	public static void check_10(double x){
		System.out.println(x + "\t" + myexp(x, 10) + "\t" + myexp_fast(x, 10) + "\t" + Math.exp(x));
	}
	public static void main(String[] args){
		System.out.println(power(3,2));
		System.out.println(power(1.5,4));
		System.out.println(factorial(6));
		System.out.println(factorial(10));
		check_10(1);
		check(1);
		for (double i = 0.1; i <= 100; i *= 10){
			check(i);
		}
		// Perfect accuracy except for e^100, which couldn't even get the first digit right (although both have the same magnitude).
		for (double i = -0.1; i >= -100; i *= 10){
			check(i);
		}
		// Accuracy for earlier terms worse than the previous one (correct to 15, 14, and 7 decimal points), while the e^(-100) one was off by 3 orders of magnitude.
	}
}