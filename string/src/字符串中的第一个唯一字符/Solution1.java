package 字符串中的第一个唯一字符;

import org.junit.Test;

import java.util.HashSet;

public class Solution1 {
    @Test
    public void test(){
        String s = "llovvessa";
        System.out.println(firstUniqChar(s));
    }
    public int firstUniqChar(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if(!set.add(ss[i])){
                set.remove(ss[i]);
            }
        }
        for (int i = 0; i < ss.length; i++) {
            if(set.contains(ss[i])){
                return i;
            }
        }
        return -1;
    }

}
