package offer42;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int res = nums[0];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((temp + nums[i]) >= 0) {
                temp = temp + nums[i];
                if (res < temp) res = temp;
            }
            else if (res < nums[i]){
                res = nums[i];
                temp = 0;
            }
            else {
                temp = 0;
            }
        }
        return res;
    }
}
