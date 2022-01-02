/**
 * 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
 *
 * 实现 NumArray 类：
 *
 * NumArray(int[] nums) 使用数组 nums 初始化对象
 * int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
 */
public class Q303 {
    class NumArray {
        int[] sum;
        public NumArray(int[] nums) {
            int[] res = new int[nums.length + 1];
            System.arraycopy(nums, 0, res, 1, nums.length);
            for (int i = 1; i < res.length; i++) {
                res[i] = res[i - 1] + nums[i - 1];
            }
            sum = res;
        }

        public int sumRange(int left, int right) {
            return sum[right + 1] - sum[left];
        }
    }
}
