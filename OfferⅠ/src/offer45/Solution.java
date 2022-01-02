package offer45;


import java.util.HashMap;

public class Solution {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            strings[i] = String.valueOf(num);
        }
        for (int i = 0; i < strings.length; i++) {
            int n = 0;
        }
        return null;

    }

    /**
     * 返回的是第一个数字，和原本数字的位数
     * @param num
     * @return
     */
    public HashMap<Integer, Integer> parse(int num){
        int n = 0;
        while (num / 10 != 0){
            n ++;
            num = num / 10;
        }
        return new HashMap<>(num, n);
    }
}
