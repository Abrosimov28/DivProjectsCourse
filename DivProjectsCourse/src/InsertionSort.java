import java.util.Arrays;

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr = { 100, 5, 10, 3, 8 };
		Arrays.stream(sort(arr)).forEach(System.out::println);
	}
	
	public static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i ; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					swap(j, arr);
				}
			}
		}
		return arr;
	}
	public static void swap(int i, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[i-1];
		arr[i-1] = temp;
	}
}
