package 中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iter {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root); else return res;
        while (!stack.empty()){
            TreeNode t1 = stack.pop();
            if (t1.left != null) stack.push(t1.left);
            stack.push(t1);
            if (t1.right != null) stack.push(t1.right);


        }
        return res;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //加个边界条件判断
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}
