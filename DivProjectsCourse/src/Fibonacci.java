import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int fib[] = fibonacci(size);
		for (int i = 0; i < size; i++) {
			System.out.print(fib[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < size; i++) {
			System.out.print(fibonacci_rec(i) + " ");
		}
	}
	
	// iteration
	public static int[] fibonacci(int number) {
		int fib[] = new int[number];
		fib[0] = 0;
		if (number == 0) {
			return fib;
		}
		fib[1] = 1;
		if (number == 1) {
			return fib; 
		}
		for (int i = 2; i < number; i++){
			fib[i] = fib[i-2] + fib[i-1];
		}
		return fib;
	}


	// recursion
	public static int fibonacci_rec(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci_rec(number - 1) + fibonacci_rec(number - 2);
	}
}