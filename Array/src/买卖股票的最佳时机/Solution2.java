package 买卖股票的最佳时机;

public class Solution2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int max = new Solution2().maxProfit(prices);
        System.out.println(max);
    }
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1 || prices.length == 0)
            return 0;
        // 初始条件
        int no_stock = 0;
        int yes_stock = -prices[0];
        int dp_no = 0; // 手里没有股票
        int dp_yes; // 手里有股票
        for (int price : prices) {
            // 迭代公式
            dp_no = Math.max(no_stock, yes_stock + price);
            dp_yes = Math.max(yes_stock, no_stock - price);
            no_stock = dp_no;
            yes_stock = dp_yes;
        }
        return dp_no;
    }
}
