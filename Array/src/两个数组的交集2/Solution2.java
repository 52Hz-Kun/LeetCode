package 两个数组的交集2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        while (index1 < nums1.length && index2 < nums2.length){
            if (nums1[index1] < nums2[index2])
                index1++;
            else if (nums1[index1] > nums2[index2])
                index2++;
            else {
                list.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
