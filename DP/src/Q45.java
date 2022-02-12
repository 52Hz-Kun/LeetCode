import java.util.Arrays;

/**
 * 45. 跳跃游戏 II
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 假设你总是可以到达数组的最后一个位置。
 */
public class Q45 {
    // 用的动态规划
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (j + nums[j] >= i) {
                    dp[i] = Math.min(dp[j] + 1, dp[i]);
                }
            }
        }
        return dp[nums.length - 1];
    }
    // 尝试用贪心的方法
    public int jump2(int[] nums) {
        int fastest = 0;
        int res = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            fastest = Math.max(fastest, i + nums[i]);
            if (end == i) {
                res++;
                end = fastest;
            }
        }
        return res;
    }
}
