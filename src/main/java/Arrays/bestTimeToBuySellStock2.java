package Arrays;

public class bestTimeToBuySellStock2 {

    static int maxProfit(int []prices){

        int index = 0, buy, sell, profit = 0, N = prices.length - 1;

        // peak-valley approach

        while (index < N) {

            while (index < N && prices[index + 1] <= prices[index]) {      // find valley(smallest). will buy on that point.
                index++;
            }

            buy = prices[index];

            while (index < N && prices[index + 1] > prices[index]) {        // find peak(largest). will sell at that point
                index++;
            }

            sell = prices[index];

            profit += sell - buy;

        }

        return profit;

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/869181449/l

    }
}
