package arrays;

public class BestTimeToBuySellStock1 {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int index = 0; index < prices.length; index++) {

            minPrice = Math.min(minPrice, prices[index]);

            maxProfit = Math.max(maxProfit, prices[index] - minPrice);

        }

        return maxProfit;

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/869174039/

    }
}
