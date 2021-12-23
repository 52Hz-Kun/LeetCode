import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * 用递归，不是用动态规划！！！
 */
public class Q22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        recur(res, new StringBuilder(), 0, 0, n);
        return res;

    }
    public void recur(List<String> res, StringBuilder string, int left, int right, int n){
        if (string.length() == n * 2) {
            res.add(string.toString());
            return;
        }
        if (left < n) {
            string.append('(');
            recur(res, string, left + 1, right, n);
            string.deleteCharAt(string.length() - 1);
        }
        if (right < left){
            string.append(')');
            recur(res, string ,left, right + 1, n);
            string.deleteCharAt(string.length() - 1);
        }
    }
}
