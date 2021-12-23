package offer58;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        int move = n % length;
        String s1 = s.substring(0, move);
        String s2 = s.substring(move, length);
        return s2 + s1;
    }

}
