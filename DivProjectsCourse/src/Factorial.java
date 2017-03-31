import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(factorial(number));
		System.out.println(factorialRec(number));
	}
	
	//iteration
	public static int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = i * fact;
		}
		return fact;
	}
	
	//recursion
	public static int factorialRec(int number) {
		int result;
		if (number == 0 || number == 1) {
			return 1;
		}
		result = factorialRec(number - 1) * number;
		return result;
	}
}
