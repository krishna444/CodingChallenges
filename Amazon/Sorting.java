
import java.util.Arrays;

public class Sorting {

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	// O(n^2)
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					// Swap
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	/*
	 * public static int[] insertionSort(int[] array) { return null; }
	 */

	// O(nlogn) =>O(n^2)
	public static int[] quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
		return array;
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int p = partition(array, low, high);
			quickSort(array, low, p - 1);
			quickSort(array, p + 1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		// finally swap pivot and a[i]
		int temp = array[i + 1];
		array[high] = temp;
		array[i + 1] = array[high];
		return i + 1;
	}

	/*
	 * public static int[] shellSort(int[] array){ return null; }
	 */

	// O(nlogn)
	public static int[] mergSort(int[] array) {
		return null;
	}

	public static int[] radixSort(int[] array) {
		return null;
	}

	public static int[] heapSort(int[] array) {
		return null;
	}

	private static int[] createRandomIntArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			int value = (int) (Math.random() * 10000);
			array[i] = value;
		}
		return array;
	}

	private static long tic = 0;
	private static long toc = 0;

	private static void tic() {
		tic = System.currentTimeMillis();
	}

	private static long toc() {
		toc = (System.currentTimeMillis() - tic);
		return toc;
	}

	private static void print(int[] original, int[] sorted) {
		System.out.println("Before sort" + Arrays.toString(original));
		System.out.println("Afer sort  " + Arrays.toString(sorted));
	}

	public static void main(String... args) {
		int[] array = createRandomIntArray(100);
		// Test Bubble sort
		System.out.println("::::::::::::::::::BUBBLE SORT::::::::::::::::::::");
		tic();
		int[] sortedArray = bubbleSort(array.clone());
		toc();
		 print(array, sortedArray);
		System.out.println("Execution took " + toc + " milliseconds");

		// Test Selection sort
		System.out.println("::::::::::::::::::SELECTION SORT::::::::::::::::::::::");
		tic();
		sortedArray = selectionSort(array.clone());
		toc();
	    print(array, sortedArray);
		System.out.println("Execution took " + toc + " milliseconds");

		// Test Selection sort
		System.out.println("::::::::::::::::::QUICK SORT::::::::::::::::::::::");
		tic();
		sortedArray = quickSort(array.clone());
		toc();
		print(array, sortedArray);
		System.out.println("Execution took " + toc + " milliseconds");

	}
}
