package org.pixlaunch.Array.sellStock_0121;

import java.util.HashMap;

public class Solution {

    public int maxProfit(int[] prices) {

        int maxProfit =0;
        int max = prices[prices.length-1];

        for(int i = prices.length-1; i>=0;i--) {
            if(prices[i] > max) {
                max= prices[i];
            }

            if(max- prices[i] > maxProfit) {
                maxProfit =  max- prices[i];
            }
        }
        return maxProfit;
    }
}