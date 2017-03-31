import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String palindrome = sc.nextLine();
		System.out.println(isPalindrome(palindrome));

	}

	public static boolean isPalindrome(String palindrome) {
		char c[] = palindrome.toCharArray();
		int i1 = 0;
		int i2 = palindrome.length() - 1;

		while (i2 > i1) {
			if (c[i1] != c[i2]) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;

	}
}
