import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		int[] arr = {1, 5, 10, 3, 8};
		Arrays.stream(arr).forEach(System.out::println);
		Arrays.stream(sort(arr)).forEach(System.out::println);
	}
	
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(i, j, arr);
				}
			}
		}
		return arr;
	}
	public static void swap(int a, int b, int[] arr) {
		int temp; 
		temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
}
