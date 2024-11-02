package org.pixlaunch.Array.remove_duplicates_0026;

public class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i]; // Update the next unique position
                uniqueIndex++;
            }
        }

        return uniqueIndex; // Return the count of unique elements
    }
}