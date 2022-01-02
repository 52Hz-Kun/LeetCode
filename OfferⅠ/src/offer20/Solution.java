package offer20;

import org.junit.Test;

import java.util.Objects;

public class Solution {
    public boolean isNumber(String s) {

        String s1 = s.trim();
        String s2 = s1.toLowerCase();
        if("".equals(s2)) return false;
        if (s2.charAt(s2.length() - 1) == 'e') return false;
        String[] es = s2.split("e");
        if (es.length == 1){
            return isFloat(es[0]) || isInteger(es[0]);
        } else if (es.length == 2){
            boolean res1 = isFloat(es[0]) || isInteger(es[0]);
            return res1 && isInteger(es[1]);
        }
        return false;
    }
    public boolean isInteger(String s) {
        if("".equals(s))
            return false;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            if (s.length() < 2){
                return false;
            }
            for (int i = 1; i < s.length(); i++) {
                boolean digit = Character.isDigit(s.charAt(i));
                if (!digit){
                    return false;
                }
            }

        }
        else {
            for (int i = 0; i < s.length(); i++) {
                boolean digit = Character.isDigit(s.charAt(i));
                if (!digit){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isFloat(String s) {
        if("".equals(s))
            return false;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            String s1 = s.substring(1);
            String[] split = s1.split("\\.");
            if (split.length == 0) return false;
            for (String value : split) {
                for (int j = 0; j < value.length(); j++) {
                    if (!Character.isDigit(value.charAt(j))) {
                        return false;
                    }
                }
            }

        } else {
            String[] split = s.split("\\.");
            if (split.length == 0 || split.length > 2) return false;
            for (String value : split) {
                for (int j = 0; j < value.length(); j++) {
                    if (!Character.isDigit(value.charAt(j))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Test
    public void test(){
        String s = "0..";
        System.out.println(isNumber(s));
    }

    @Test
    public void test1(){}

}
