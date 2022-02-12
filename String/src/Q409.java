import java.util.HashMap;
import java.util.Map;

/**
 * 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 *
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 */

// 直接用数组更快
public class Q409 {
    public int longestPalindrome(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) == 2) {
                map.put(c, 0);
                res += 2;
            }
        }
        for (Integer value : map.values()) {
            if (value == 1) {
                res ++;
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Q409().longestPalindrome("bbc"));
    }
}
