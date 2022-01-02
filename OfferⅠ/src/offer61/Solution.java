package offer61;

import org.junit.Test;

import java.util.HashMap;

public class Solution {
    public boolean isStraight(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (max < num) max = num;
        }
        for (int i = 1; i < 5; i++) {
            if (map.containsKey(max - i)) continue;
            else if (map.get(0) != 0) map.put(0, map.get(0) - 1);
            else return false;
        }
        return true;
    }

    @Test
    public void test(){
        int[] n = {0,2,3,4,6};
        System.out.println(isStraight(n));
    }
}
