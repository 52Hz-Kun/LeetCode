import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 没写完，不会写...
 *
 * 验证二叉搜索树
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if ((root.left != null && root.left.val > root.val) && (root.right != null && root.right.val < root.val)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public boolean isValid(TreeNode root, long lower, long upper){
        return false;
    }
}

class Q98_second {
    public boolean isValidBST(TreeNode root) {
        double pre = -Double.MAX_VALUE;

        if (root == null) return true;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            if (pop.val <= pre) return false;
            pre = pop.val;
            root = pop.right;
        }
        return true;
    }
}
