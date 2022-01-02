package 移动零;

public class Solution2 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        for (; right < nums.length; right++) {
            if(nums[right] != 0){
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }
        }
    }
}
