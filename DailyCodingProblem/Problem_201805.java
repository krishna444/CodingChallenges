public class Problem_201805{
/**
 * Given a list of numbers, return whether any two sums to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */
public boolean checkSumTwoElementsV1(int[] A, int k){
   for(int i=0;i<A.length;i++){
       for(int j=i;j<A.length;j++){
            if(A[i]+A[j]==k){
                return true;
            }
       }
   }
   return false;
} 

public static void main(String...args){
    Problem_201805 problems=new Problem_201805();
    boolean result=problems.checkSumTwoElements(new int[]{-17,34}, 17);
    System.out.println(result);
}
}