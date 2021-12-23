/**
 * 乘积最大子数组
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 */

public class Q152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[][] mul = new int[2][nums.length]; // 两行，第一行保存最大的正数，第二行保存最小的负数
        if (nums[0] > 0) mul[0][0] = nums[0];
        else mul[1][0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                mul[0][i] = Math.max(nums[i], nums[i] * mul[0][i - 1]);
                mul[1][i] = nums[i] * mul[1][i - 1];
            } else {
                mul[0][i] = nums[i] * mul[1][i - 1];
                mul[1][i] = Math.min(nums[i], nums[i] * mul[0][i - 1]);
            }
            max = Math.max(mul[0][i], max);
        }
        return max;
    }
}
