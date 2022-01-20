import java.util.HashMap;

/**
 * 567. 字符串的排列
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 *
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 */
public class Q567 {
    public boolean checkInclusion(String s1, String s2) {
        int left = -1, right = 0, valid = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        while (right < s2.length()) {
            char c = s2.charAt(right);
            if (right >= s1.length()) left++;
            right++;
            if (map1.containsKey(c)) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
                if (map2.get(c).equals(map1.get(c))) {
                    valid++;
                }
            }
            if (left != -1) {
                char move = s2.charAt(left);
                if (map1.containsKey(move)) {
                    if (map2.get(move).equals(map1.get(move))) {
                        valid--;
                    }
                    map2.put(move, map2.get(move) - 1);
                }
            }
            if (valid == map1.size()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ccccbbbbaaaa";
        Q567 q567 = new Q567();
        boolean b = q567.checkInclusion(s1, s2);
        System.out.println(b);
    }
}
