import java.util.ArrayList;
import java.util.List;

/**
 * 单词拆分
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典，判定 s 是否可以由空格拆分为一个或多个在字典中出现的单词。
 *
 * 说明：拆分时可以重复使用字典中的单词。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-break
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 递归超时
 */
public class Q139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) return true;
        boolean[] dp = new boolean[s.length()];
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i))){
                dp[i - 1] = true;
                index.add(i);
            }
            else {
                for (Integer integer : index) {
                    if (wordDict.contains(s.substring(integer, i))) {
                        dp[i - 1] = true;
                        index.add(i);
                        break;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }

   /**
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) return true;
        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i))){
                String sub = s.substring(i);
                if (wordBreak(sub, wordDict)) return true;
            }
        }
        return false;
    }
    */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        list.add("er");
        String s = "leetcodeer";
        System.out.println(new Q139().wordBreak(s, list));
    }
}
