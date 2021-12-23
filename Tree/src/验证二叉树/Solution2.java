package 验证二叉树;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
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
