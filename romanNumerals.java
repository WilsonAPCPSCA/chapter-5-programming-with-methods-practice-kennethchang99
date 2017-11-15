import java.util.Scanner;
public class romanNumerals {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer between 1 and 99.");
		int n = in.nextInt();
		System.out.println(romanDigit(n));
	}
	public static String romanDigit( int n) {
		String x = "";
		int y = (n / 10) % 10;
		int z = n % 10;
		if (y >= 5) {
			if (y == 9) {
				System.out.print("XC");
			}
			else {
				System.out.print("L");
				for (int i = 0; i < y - 5; i++) {
					System.out.print("X");
				}
			}
		}
		if (y < 5) {
			if (y == 4) {
				System.out.print("XL");
			}
			else {
				for (int i = 0; i < y; i++) {
					System.out.print("X");
				}
			}
		}
		if (z >= 5) {
			if (z == 9) {
				System.out.print("IX");
			}
			else {
				System.out.print("V");
				for (int i = 0; i < z - 5; i++) {
					System.out.print("I");
				}
			}
		}
		if (z < 5) {
			if (z == 4) {
				System.out.print("IV");
			}
			else {
				for (int i = 0; i < z; i++) {
					System.out.print("I");
				}
			}
		}
		return x;
	}
}