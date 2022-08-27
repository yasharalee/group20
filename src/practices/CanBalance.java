package practices;

/*

Given a non-empty array, return true if there is a place to split the array so that the sum of the
numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true

 */

public class CanBalance {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 1};
        System.out.println(canBalance(arr));
    }

    private static boolean canBalance(int[] nums) {
        boolean balanced = false;
        for (int i = 0; i < nums.length; i++) {
            int leftSide = 0;
            int rightSide = 0;
            for (int j = 0; j < nums.length; j++) {
                int e = nums[j];
                if (j <= i) {
                    leftSide += e;
                } else {
                    rightSide += e;
                }
            } // end inner loop
            if (leftSide == rightSide) {
                balanced = true;
                break;
            }
        } // end outer loop
        return balanced;
    }
}
