package org.pixlaunch.Array.twoSum_0001;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++) {
            int sno = target-nums[i];
            if(map.containsKey(sno)) {
                ans[0]=map.get(sno);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
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