import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestAnagram {
	/*
	 * Given two strings, and , that may or may not be of the same length,
	 * determine the minimum number of character deletions required to make and
	 * anagrams. Any characters can be deleted from either of the strings.
	 */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String wordOne = sc.nextLine();
		String wordTwo = sc.nextLine();
		
		System.out.println("Minimum number of characters is " + charsNeeded(wordOne, wordTwo));
	}
	
	private static int charsNeeded(String first, String second) {
	    List<Character> a = new ArrayList<>();
	    List<Character> b = new ArrayList<>();

	    // Add all characters from first and second to lists
	    for (Character ch : first.toCharArray()) {
	        a.add(ch);
	    }
	    for (Character ch : second.toCharArray()) {
	        b.add(ch);
	    }

	    for (int i = 0; i < first.length(); i++) {
	        Character ch = first.charAt(i);
	        if (b.contains(Character.valueOf(ch))) {
	            b.remove(Character.valueOf(ch));
	        }
	    }

	    for (int i = 0; i < second.length(); i++) {
	        Character ch = second.charAt(i);
	        if (a.contains(Character.valueOf(ch))) {
	            a.remove(Character.valueOf(ch));
	        }
	    }

	    return a.size() + b.size();
	}
	
	
}
