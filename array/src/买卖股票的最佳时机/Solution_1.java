package 买卖股票的最佳时机;

/**
 * 给定一个数组 prices ，其中prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class Solution_1 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int max = new Solution_1().maxProfit(prices);
        System.out.println(max);
    }
    public int maxProfit(int[] prices) {
        int max_money = 0;
        int start = 0;
        if (prices == null || prices.length == 1 || prices.length == 0)
            return 0;
        for(int end = 1; end < prices.length; end++)
        {
            if(prices[end] < prices[end-1])
            {
                max_money += prices[end-1] - prices[start];
                start = end;
            }
            else if(prices[end] > prices[start] && end == prices.length-1)
            {
                max_money += prices[end] - prices[start];
            }
        }
        return max_money;
    }
}
