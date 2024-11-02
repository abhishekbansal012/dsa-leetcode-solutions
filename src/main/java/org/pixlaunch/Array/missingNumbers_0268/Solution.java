package org.pixlaunch.Array.missingNumbers_0268;

public class Solution {
    public int missingNumber(int[] nums) {

        int length = nums.length;
        long sum = lengthOfFirstNnumbers(length);
        long currentSum = 0;
        for (int num : nums) {
            currentSum = currentSum + num;
        }

        return (int) (sum - currentSum);
    }

    private long lengthOfFirstNnumbers(int length) {
        int sum=0;
        for(int i=0;i<=length;i++) {
            sum+=i;
        }
        return sum;
    }


}