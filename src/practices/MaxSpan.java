package practices;

/*

Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of
elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array.
 (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

 */


public class MaxSpan {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 4, 4, 4};
        int[] arr1 = {1, 2, 1, 1, 3};
        int[] arr2 = {3, 9};
        System.out.println(maxSpan(arr));
        System.out.println(maxSpan(arr1));
        System.out.println(maxSpan(arr2));
    }

    public static int maxSpan(int[] nums) {
        int longest = 0; // keeps track of number of elements in a span to find the longest span
        if (nums.length == 0) { // to handle Empty arrays
            return 0;
        }

        for (int i = 0; i < nums.length; i++) { // iterates from 0 to end
            int num = nums[i]; //  possibly leftmost element
            for (int j = nums.length - 1; j > i; j--) { // iterates from end to 0
                int lastPair = nums[j];
                if (lastPair == num) { // rightmost appearances of some value in an array
                    if ((j - i) + 1 > longest) { // calculating number of elements in the span
                        longest = (j - i) + 1;
                    }
                    break; // once we find rightmost pair we don't need to keep iterating
                }
            }
        }
        return longest == 0 ? 1 : longest; // returns 1 if there is no pair just to satisfy the requirement
        //  "A single value has a span of 1"
    }
}
