package 验证回文串;

import org.junit.Test;

public class Solution1 {
    @Test
    public void test(){
        String s = "ssFSFFA,FAG";
        System.out.println(isPalindrome(s));
    }
    public boolean isPalindrome(String s) {

        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }
}
