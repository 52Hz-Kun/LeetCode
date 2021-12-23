/**
 * 打家劫舍1
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[][] sum = new int[2][nums.length];
        // 第一行代表抢，第二行代表不抢
        sum[0][0] = nums[0];
        sum[1][0] = 0;
        for (int i = 1; i < nums.length; i++) {
            sum[0][i] = nums[i] + sum[1][i - 1]; // 抢
            sum[1][i] = Math.max(sum[0][i - 1], sum[1][i - 1]); // 不抢
        }
        return Math.max(sum[0][nums.length - 1], sum[1][nums.length - 1]);
    }

    public static void main(String[] args) {
        int[] r = new int[]{1, 2, 3, 1};
        int rob = new Q198().rob(r);
        System.out.println(rob);
    }
}
