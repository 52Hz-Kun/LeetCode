package offer36;

public class Solution {
    public Node treeToDoublyList(Node root) {
        return null;
    }

    public void recur(Node root, Node node, int flag){
        if (node.left == null && node.right== null) {
            if (flag == 1){
                node.right = root;
            } else if (flag == 2){
                node.left = root;
                node.right = root.right;
            }

        }
    }
    public void left(Node left){

    }

    public void right(Node right){

    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
