package practices;

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.


zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
 */

import java.util.Arrays;

public class ZeroFront {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1};
        int[] arr2 = {-1, 0, 0, -1, 0};
        int[] arr3 = {1, 0};
        System.out.println(Arrays.toString(zeroFront(arr1)));
        System.out.println(Arrays.toString(zeroFront(arr2)));
        System.out.println(Arrays.toString(zeroFront(arr3)));
    }

    public static int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, k = 0, j = nums.length - 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[k++] = nums[i];
            } else {
                arr[j--] = nums[i];
            }
        }
        return arr;
    }
}
