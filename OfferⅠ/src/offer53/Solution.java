package offer53;

import javafx.beans.binding.When;

public class Solution {
    /**
     * 11.19改
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int right = binarySearch(nums, target, true);
        if (nums[right] != target) return 0;
        int left = binarySearch(nums, target ,false);
        return right - left - 1;


    }
    public int binarySearch(int[] nums, int target, boolean flag){
        // true表示比target大的，false表示比target小的
        int left = 0, right = nums.length - 1;
        if (flag) {
            while (left < right){
                int mid = (left + right) / 2;
                if (nums[mid] > target) right = mid;
                else left = mid + 1;
            }
        } else {
            while (left < right){
                int mid = (left + right) / 2;
                if (nums[mid] < target) {
                    if (left == mid) right--;
                    else left = mid;
                }
                else right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int search = new Solution().search(nums, 1);
        System.out.println(search);
    }
}
//    int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//        if (nums[i] == target){
//        num++;
//        }
//
//        }
//        return num;