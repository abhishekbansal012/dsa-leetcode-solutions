package org.pixlaunch.Array.remove_duplicates_0026;

import java.util.HashMap;
import java.util.HashSet;

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


/**
 Notes


 # Intuition
 <!-- Describe your first thoughts on how to solve this problem. -->

 # Approach
 <!-- Describe your approach to solving the problem. -->

 # Complexity
 - Time complexity:
 <!-- Add your time complexity here, e.g. $$O(n)$$ -->

 - Space complexity:
 <!-- Add your space complexity here, e.g. $$O(n)$$ -->

 */