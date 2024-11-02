package org.pixlaunch.Array.plusOne_0066;

public class Solution {



    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
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