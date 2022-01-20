import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int len = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        for (; right < s.length(); right++) {
            char c = s.charAt(right);
            while (map.containsKey(c) && map.get(c) == 1) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            len = Math.max(right - left + 1, len);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return len;
    }
}
