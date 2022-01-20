import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 438. 找到字符串中所有字母异位词
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 *
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 */
public class Q438 {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> pm = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int left = -1, right = 0, valid = 0;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            pm.put(c, pm.getOrDefault(c, 0) + 1);
        }

        while (right < s.length()) {
            char c = s.charAt(right);
            if (pm.containsKey(c)) {
                sm.put(c, sm.getOrDefault(c, 0) + 1);
                if (sm.get(c).equals(pm.get(c))) {
                    valid++;
                }
            }
            if (right >= p.length()) {
                left = right - p.length();
                char l = s.charAt(left);
                if (pm.containsKey(l)) {
                    if (sm.get(l).equals(pm.get(l))) {
                        valid--;
                    }
                    sm.put(l, sm.get(l) - 1);
                }
            }
            right++;
            if (valid == pm.size()) {
                res.add(left + 1);
            }
        }
       return res;
    }

    public static void main(String[] args) {
        Q438 q438 = new Q438();
        List<Integer> anagrams = q438.findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);

    }
}
