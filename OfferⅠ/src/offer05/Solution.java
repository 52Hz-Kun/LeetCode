package offer05;

public class Solution {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer();
        int n = s.length();
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (c == ' '){
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
