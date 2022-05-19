// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

public class BestTimetoBuyandSellStock_121 {

    public static int maxProfit(int[] prices) {

        int max = 0;
        int left = 0;
        int curr = 0;

        for (int right = 1; right < prices.length; right++) {
            curr = prices[right] - prices[left];
            if (prices[left] < prices[right]) {
                max = Math.max(max, curr);

                System.out.println(prices[right] + ", " + prices[left] + " => " + max);

            } else {
                left = right;
                System.out.println("\t\t" + prices[right] + ", " + prices[left] + " => " + max);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ////        Input: prices = [7,1,5,3,6,4]
        ////        Output: 5

//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};
//        int[] prices = {7, 6, 4, 3, 9};

        System.out.println(maxProfit(prices));
    } // End main method

//    public static int maxProfit(int[] prices) {
//        int left = 0;
//        int right = 1;
//
//        int max = 0;
//        int curr = 0;
//
//        while (right < prices.length) {
//            curr = prices[right] - prices[left];
//            if (prices[left] < prices[right]) {
//                max = Math.max(max, curr);
//
//                System.out.println(prices[right] + ", " + prices[left] + " => " + max);
//
//            } else {
//                left = right;
//
//                System.out.println("\t\t" + prices[right] + ", " + prices[left] + " => " + max);
//            }
//            right++;
//        }
//        return max;
//    }

} // End class