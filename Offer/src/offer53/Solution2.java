package offer53;

import org.junit.Test;

import java.util.Arrays;

public class Solution2 {
    /***
     *
     * 运行超时了。。。
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int first = 0, second = 0;
        int sep = nums.length / 2;
        if (nums[sep] > target){
            int[] ints = Arrays.copyOfRange(nums, 0, sep);
            search(ints, target);
        } else if (nums[sep] < target) {
            int[] ints = Arrays.copyOfRange(nums, sep, nums.length);
            search(ints, target);
        } else {

            for (int i = sep; i < nums.length; i++) {
                if (nums[i] != target){
                    second = i - 1;
                    break;
                }
            }
            for (int i = sep; i >= 0; i--) {
                if (nums[i] != target){
                    first = i + 1;
                    break;
                }

            }
            return second - first + 1;
        }
        return 0;
    }

    @Test
    public void test(){
        int[] nums = {5,7,7,8,8,10};
        int search = search(nums, 8);
        System.out.println(search);
    }
}
