import org.junit.internal.runners.statements.FailOnTimeout;

/**
 * 410. 分割数组的最大值
 * 给定一个非负整数数组 nums 和一个整数 m ，你需要将这个数组分成 m 个非空的连续子数组。
 *
 * 设计一个算法使得这 m 个子数组各自和的最大值最小。
 */

// 算法反推，先定义一个最大值，看最少能有几个数组实现
public class Q410 {
    public int splitArray(int[] nums, int m) {
        int[] sum = new int[nums.length + 1];
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
            maxNum = Math.max(nums[i - 1], maxNum);
        }
        int left = maxNum;
        int right = sum[sum.length - 1];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (split(sum, mid) <= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
    public int split(int[] sum, int max) {
        int left = 0;
        int res = 0;
        for (int right = 1; right < sum.length; right++) {
            if (sum[right] - sum[left] > max) {
                res++;
                left = right - 1;
            }
        }
        return res + 1;
    }

    public static void main(String[] args) {
        int i = new Q410().splitArray(new int[]{1, 4, 4}, 3);
        System.out.println(i);
    }
}
