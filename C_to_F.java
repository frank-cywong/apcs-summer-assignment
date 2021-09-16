import java.util.Scanner;

public class C_to_F{
	public static void main(String[] args) {
		double celsius;
		System.out.println("Input temperature in Celsius:");
		Scanner in = new Scanner(System.in);
		celsius = in.nextDouble();
		double fahrenheit = (celsius * (double)9 / (double)5 + (double)32);
		System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
	}
}