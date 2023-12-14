public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int LeftDepth = maxDepth(root.left);
        int RightDepth = maxDepth(root.right);
        return Math.max(LeftDepth, RightDepth) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
