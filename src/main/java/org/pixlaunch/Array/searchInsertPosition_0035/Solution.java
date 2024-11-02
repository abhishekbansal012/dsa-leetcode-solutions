package org.pixlaunch.Array.searchInsertPosition_0035;

import java.util.HashMap;

public class Solution {

    public int searchInsert(int[] nums, int target) {

        int length = nums.length;
        int searchIndex = length/2;

        while(searchIndex==0) {
            if (nums[searchIndex] == target) {
                return searchIndex;
            } else if(nums[searchIndex] > target){
                searchIndex = searchIndex/2;
            }
            else {
                searchIndex = (length-searchIndex)/2;
            }
        }




        return searchIndex;



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