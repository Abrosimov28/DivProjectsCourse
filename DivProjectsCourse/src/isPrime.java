import java.util.Scanner;

public class isPrime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		System.out.println(prime(number));
	}
	
	public static boolean prime(int number) {
		if (number == 2) {
			return false;
		}
		if (number < 2 || number % 2 == 0) {
			return false;
		}
		for (int i = 3; i < number; i = i + 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
