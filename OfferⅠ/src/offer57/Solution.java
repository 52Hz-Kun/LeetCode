package offer57;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import jdk.nashorn.internal.ir.WhileNode;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return nums;
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (nums[left] + nums[right] > target)
                right--;
            else if (nums[left] + nums[right] < target)
                left++;
            else return new int[]{nums[left], nums[right]};
        }
        return new int[]{};
    }
}
