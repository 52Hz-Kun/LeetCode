package offer63;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int low = prices[0];
        int high;
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (low > prices[i]) low = prices[i];
            high = prices[i];
            if ((high - low) > res) res = high - low;
        }
        return res;
    }
}
