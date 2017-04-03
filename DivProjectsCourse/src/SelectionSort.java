import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) {
		int[] arr = { 100, 5, 10, 3, 8 };
		Arrays.stream(sort(arr)).forEach(System.out::println);
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			swap(i, min, arr);
		}
		return arr;
	}

	public static void swap(int i, int min, int[] arr) {
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
	}
}
