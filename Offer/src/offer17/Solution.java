package offer17;

public class Solution {
    /**
     * 这题什么意思？
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int sum = 0;
        while (n > 0) {
            sum = 10 * sum + 9;
            n--;
        }
        int[] res = new int[sum];
        for (int i = 1; i <= sum; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
