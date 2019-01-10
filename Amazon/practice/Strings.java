import java.util.Arrays;

public class Strings {
	// Order(N)
	public static boolean isUnique(String string) {

		if (string.length() > 128)
			return false;
		char[] array = string.toCharArray();
		boolean[] check = new boolean[128];
		for (char ch : array) {
			if (check[ch]) {
				return false;
			}
			check[ch] = true;
		}
		return true;

	}

	public static boolean checkPermutation(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);
		return new String(array1).equals(new String(array2));

	}

	public static String URLify(String input) {
		char[] array = input.toCharArray();
		char[] outputArray = new char[array.length];

		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				if (j + 2 < array.length) {
					outputArray[j] = '%';
					outputArray[j + 1] = '2';
					outputArray[j + 2] = '0';
					j = j + 3;
				}
			} else {
				outputArray[j] = array[i];
				j++;
			}

		}
		return new String(outputArray);

		// Improvement with single character array

	}

	private static boolean palindromePermutation(String input) {
		int[] counter = new int[128];
		for (char ch : input.toLowerCase().toCharArray()) {
			if (ch == ' ')
				continue;
			counter[ch]++;
		}
		int oddCounter = 0;
		for (int val : counter) {
			if (val % 2 != 0) {
				oddCounter++;
			}

			if (oddCounter > 1)
				return false;

		}
		return true;
	}

	private static boolean oneAway(String input1, String input2) {
		int length1 = input1.length();
		int length2 = input2.length();
		char[] array1 = input1.toLowerCase().toCharArray();
		char[] array2 = input2.toLowerCase().toCharArray();
		if (length1 == length2) {
			// check replacement
			boolean flag = false;
			for (int i = 0; i < length1; i++) {
				if (array1[i] != array2[i]) {
					if (!flag) {
						flag = true;
						continue;
					}
					return false;
				}
			}
			return true;
		} else {
			// check insertion
			if (Math.abs(length1 - length2) != 1) {
				return false;
			}
			if (length1 > length2) {
				for (int i = 0; i < length2; i++) {
					if (array1[i] != array2[i]) {
						if (array1[i + 1] != array2[i]) {
							return false;
						}
					}
				}
			}
			return true;
		}

	}

	private static String stringCompression(String input) {
		String compressedString = "";
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			counter++;
			if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
				compressedString += "" + input.charAt(i) + counter;
				counter = 0;
			}
		}
		return compressedString.length() < input.length() ? compressedString : input;
	}

	private static int[][] rotateMatrix(int[][] inputMatrix) {
		if (inputMatrix.length > 0 && inputMatrix[0].length == inputMatrix.length) {
			int rows = inputMatrix.length;
			int columns = inputMatrix[0].length;
			int[][] rotatedMatrix = new int[rows][columns];
			for (int row = 0; row < inputMatrix.length; row++) {
				for (int col = 0; col < inputMatrix[0].length; col++) {
					rotatedMatrix[col][rows - row - 1] = inputMatrix[row][col];
				}
			}
			return rotatedMatrix;
		}
		return null;
	}

	private static int[][] zeroMatrix(int[][] inputMatrix) {
		int rows = inputMatrix.length;
		int cols = inputMatrix[0].length;
		int[][] zeroMatrix = inputMatrix;
		for (int row = 0; row < rows; row++) {
			
		}
		System.out.println(inputMatrix.length);
		return inputMatrix;
	}	

	private static void print(String string) {
		System.out.println(string);
	}

	private static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void main(String... args) {
		// System.out.println(isUnique("aberdiA"));
		// System.out.println(checkPermutation("abd eaq", "aabdeq "));
		// print(URLify("aqui ckbro ws "));
		// print(palindromePermutation("Tacct Ooaa") + "");
		// print(oneAway("Pale", "balea") + "");
		// print(stringCompression("abcccd"));
		int[][] inputMatrix = new int[][] { { 12, 45, 24 }, { 11, 99, 2 }, { 1, 3, 6 } };
		print(rotateMatrix(inputMatrix));

	}
}
