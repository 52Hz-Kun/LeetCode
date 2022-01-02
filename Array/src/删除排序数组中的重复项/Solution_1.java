package 删除排序数组中的重复项;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
// 是排过序的数组
public class Solution_1 {
    public static void main(String[] args) {
        int result;
        int input[] = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        result = new Solution_1().removeDuplicates(input);
//        System.out.println(result);
        for (int i = 0; i < result; i++) {
            System.out.println(input[i]);
        }
    }

    //双指针解决
    public int removeDuplicates(int[] input) {
        //边界条件判断，去除异常场景
        if (input == null || input.length == 0)
            return 0;
        int left = 1;
        for (int right = 1; right < input.length; right++) {
            if(input[right] != input[right - 1])
            {
                input[left] = input[right];
                left++;
            }
        }
        return left;
    }
}
