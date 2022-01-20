import java.util.*;

public class Q316 {
    public String removeDuplicateLetters(String s) {
        StringBuilder stringBuilder = new StringBuilder(26);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
                stringBuilder.append(c);
            } else {
                String s1 = stringBuilder.toString();
                String s2 = stringBuilder.substring(0, map.get(c)) + stringBuilder.substring(map.get(c) + 1) + c;
                if (s1.compareTo(s2) > 0) {
                    stringBuilder = new StringBuilder(s2);
                    map.put(c, i);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new Q316().removeDuplicateLetters("bcabc");
    }
}
