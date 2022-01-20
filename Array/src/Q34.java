import java.util.Arrays;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 */
public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int l1 = 0, l2 = 0;
        int r1 = nums.length, r2 = nums.length;
        // 寻找左边界
        while (l1 < r1) {
            int mid = l1 + (r1 - l1) / 2;
            if (nums[mid] >= target) r1 = mid;
            else l1 = mid + 1;
        }
        // 寻找右边界
        while (l2 < r2) {
            int mid = l2 + (r2 - l2) / 2;
            if (nums[mid] <= target) l2 = mid + 1;
            else r2 = mid;
        }
        if (l2 - 1 < l1) return new int[]{-1, -1};
        return new int[]{l1, l2 - 1};
    }

    public static void main(String[] args) {
        int[] ints = new Q34().searchRange(new int[]{1}, 0);
        System.out.println(Arrays.toString(ints));
    }
}
