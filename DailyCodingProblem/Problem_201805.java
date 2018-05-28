import java.util.Arrays;

public class Problem_201805 {
    /**
     * Given a list of numbers, return whether any two sums to k.
     * 
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
     * 17.
     * 
     * Bonus: Can you do this in one pass?
     */
    public boolean checkSumTwoElementsV1(int[] A, int k) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[i] + A[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkSumTwoElementsV2(int[] A, int k) {
        Arrays.sort(A);
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] + A[j] == k) {
                return true;
            }
            if (A[i] + A[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return false;

    }

    public static void main(String... args) {
        Problem_201805 problems = new Problem_201805();
        boolean result = problems.checkSumTwoElementsV2(new int[] { -17, 12,2,6,1,7,8,32 }, 36);
        System.out.println(result);
    }
}