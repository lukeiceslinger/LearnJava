package com.flibustier.SpringJava;

public class Stock {
    public static int maxProfit(int[] prices) {
    int maxProfit = 0;

    for(int i = 0; i < prices.length - 1; i++){
        for(int j = i + 1; j < prices.length; j++){
            int profit = prices[j] - prices[i];
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
    }

    return maxProfit;
}

    public static void main(String[] args) {
        // Test cases
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Maximum profit: " + maxProfit(prices1)); // Expected output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum profit: " + maxProfit(prices2)); // Expected output: 0
    }
}
