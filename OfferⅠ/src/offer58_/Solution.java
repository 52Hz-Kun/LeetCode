package offer58_;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(s.split("\\s+")));
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
            if (i != list.size() - 1)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    @Test
    public void test(){
        String s = "the sky is blue";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

}
