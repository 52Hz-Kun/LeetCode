/**
 * 最长递增子序列
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 *
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q300 {
    public int lengthOfLIS(int[] nums) {
        int[] len = new int[nums.length];
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            len[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) len[i] = Math.max(len[i], len[j] + 1);
                max = Math.max(max, len[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Q300 q300 = new Q300();
        int i = q300.lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6});
        System.out.println(i);

    }
}
