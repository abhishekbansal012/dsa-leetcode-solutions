package org.pixlaunch.Array.singleNumber_0136;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {

    public int singleNumber(int[] nums) {

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;


        //return solutionNotOptimized(nums);
    }

    private Integer solutionNotOptimized(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }


        Optional<Integer> keyWithCountOne = getKeyWithCountOne(hmap);

        return keyWithCountOne.orElse(0);
    }

    Optional<Integer> getKeyWithCountOne(HashMap<Integer, Integer> hmap) {
        return hmap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }
}