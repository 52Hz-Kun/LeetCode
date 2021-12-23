package offer54;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        recur(root);
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    void recur(TreeNode node){
        if (node == null) return;
        list.add(node.val);
        recur(node.left);
        recur(node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
