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

    /**
     * Given an array of integers, return a new array such that each element at
     * index i of the new array is the product of all the numbers in the original
     * array except the one at i.
     * 
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
     * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
     * be [2, 3, 6].
     * 
     * Follow-up: what if you can't use division?
     */
    public int[] productOfAllNumbersExceptItself(int A[]) {
        int product = 1;
        for (int value : A) {
            product *= value;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = product / A[i];
        }
        return A;
    }

    /*
     * Given the root to a binary tree, implement serialize(root), which serializes
     * the tree into a string, and deserialize(s), which deserializes the string
     * back into the tree.
     * 
     * For example, given the following Node class
     * 
     * class Node: def __init__(self, val, left=None, right=None): self.val = val
     * self.left = left self.right = right The following test should pass:
     * 
     * node = Node('root', Node('left', Node('left.left')), Node('right')) assert
     * deserialize(serialize(node)).left.left.val == 'left.left'
     */

    class Node {
        public Node left;
        public Node right;
        public String value;

        public Node(String value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public String serialize(Node root) {
        return serialize(root.left) + "." + root.value + "." + serialize(root.right);
    }

    public Node deserialize(String s) {
        return null;
    }

    public static void main(String... args) {
        Problem_201805 problems = new Problem_201805();
        // boolean result = problems.checkSumTwoElementsV2(new int[] { -17, 12, 2, 6, 1,
        // 7, 8, 32 }, 36);
        // System.out.println(result);
        int result[] = problems.productOfAllNumbersExceptItself(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(Arrays.toString(result));
    }
}