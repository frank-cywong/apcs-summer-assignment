public class Methods{
	public static boolean isDivisible(int n, int m) {
		if (n % m == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isTriangle(int a, int b, int c) {
		if (a > (b + c)) {
			return false;
		}
		if (b > (a + c)) {
			return false;
		}
		if (c > (a + b)) {
			return false;
		}
		return true;
	}
	public static int ack(int m, int n) {
		if (m == 0) {
			return (n + 1);
		}
		if (m > 0 && n == 0) {
			return (ack(m - 1, 1));
		}
		return(ack(m - 1, ack(m, n - 1)));
	}
	public static void main(String[] args) {
		System.out.println(isDivisible(3,2));
		System.out.println(isDivisible(4,2));
		System.out.println(isTriangle(4,3,9));
		System.out.println(isTriangle(4,3,5));
		System.out.println(ack(1,0));
		System.out.println(ack(2,0));
		System.out.println(ack(2,2));
		System.out.println(ack(3,3));
	}
}