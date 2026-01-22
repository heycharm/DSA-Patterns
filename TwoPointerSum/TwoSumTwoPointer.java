// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

public class TwoSumTwoPointer {

    public static boolean twoSum(int[] arr, int target) {

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize two pointers
        int left = 0;                  // start pointer
        int right = arr.length - 1;    // end pointer

        // Step 3: Loop until pointers meet
        while (left < right) {

            int sum = arr[left] + arr[right];

            // Step 4: Check conditions
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                return true;
            }
            else if (sum < target) {
                left++;   // need a bigger sum
            }
            else {
                right--;  // need a smaller sum
            }
        }

        // Step 5: If no pair found
        System.out.println("No pair found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 8, 4, 2, 9};
        int target = 10;

        twoSum(arr, target);
    }
}
