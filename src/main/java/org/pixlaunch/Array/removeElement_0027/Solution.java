package org.pixlaunch.Array.removeElement_0027;

import java.util.HashMap;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int k = 0; // Pointer for the position to place non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place non-val element at position k
                k++; // Move the k pointer
            }
        }
        return k; // The new length of the array
    }

}