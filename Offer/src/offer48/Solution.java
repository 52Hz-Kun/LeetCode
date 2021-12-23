package offer48;

import org.junit.Test;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                for (int j = 0; j < stringBuilder.length(); j++) {
                    if (stringBuilder.charAt(j) != c){
                        set.remove(stringBuilder.charAt(j));
                        stringBuilder.deleteCharAt(j);
                        j--;
                    } else {
                        set.remove(c);
                        stringBuilder.deleteCharAt(j);
                        break;
                    }
                }
            }
            set.add(c);
            stringBuilder.append(c);
            res = Math.max(res, set.size());
        }
        return res;
    }
    @Test
    public void test(){
        String s = "rmsmxmredhxgkvqzb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
