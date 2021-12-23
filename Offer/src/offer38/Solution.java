package offer38;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 */
public class Solution {
    HashSet<String> set = new HashSet<>();
    public String[] permutation(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        backtrack(stringBuilder, chars);
        String[] res = new String[set.size()];

        int k = 0;
        for (String ss : set){
            res[k] = ss;
            k++;
        }
        return res;

    }
    public void backtrack(StringBuilder s, char[] list){
        if (s.length() == list.length) {
            set.add(s.toString());
            System.out.println(s);
            return;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] != '0'){
                char choose = list[i];
                s.append(choose);
                list[i] = '0';
                backtrack(s, list);
                list[i] = choose;
                s.deleteCharAt(s.length() - 1);
            }
        }
    }

    @Test
    public void test(){
        String s = "ads";
        String[] permutation = permutation(s);
    }
}
