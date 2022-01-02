package offer21;

public class Solution {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (nums[left] % 2 == 0 && nums[right] % 2 == 1){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }
            else if (nums[left] % 2 == 0 && nums[right] % 2 == 0)
                right--;
            else if (nums[left] % 2 == 1 && nums[right] % 2 == 1)
                left++;
            else {
                left++;
                right--;
            }
        }
        return nums;
    }
}
