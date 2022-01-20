import java.util.HashMap;

/**
 * 76. 最小覆盖子串
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 */
public class Q76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>(); // 匹配的
        HashMap<Character, Integer> mapT = new HashMap<>(); // 被匹配的
        int left = 0, right = 0, valid = 0, start = 0;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        while (right < s.length()) {
            // 被移入窗口的字符
            char c = s.charAt(right);
            right++;
            // 进行窗口的一系列更新
            if (mapT.containsKey(c)) {
                mapS.put(c, mapS.getOrDefault(c, 0) + 1);
                if (mapS.get(c).equals(mapT.get(c))) {
                    valid++;
                }
            }
            // 判断左窗口是否要收缩
            while (valid == mapT.size()) {
                // 更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // 被移出来的字符
                char c1 = s.charAt(left);
                left++;
                if (mapT.containsKey(c1)) {
                    if (mapS.get(c1).equals(mapT.get(c1))) {
                        valid--;
                    }
                    mapS.put(c1, mapS.get(c1) - 1);
                }

            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args) {
        Q76 q76 = new Q76();
        String s = "¼";
        System.out.println(s);
    }
}
