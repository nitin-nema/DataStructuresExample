package tree;

public class IdenticalBinaryTrees {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Function to check if two binary trees are identical
    public boolean isIdentical(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }

    public static void main(String[] args) {
        IdenticalBinaryTrees solution = new IdenticalBinaryTrees();

        // Constructing two identical binary trees
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        // Check if trees are identical
        boolean identical = solution.isIdentical(root1, root2);
        System.out.println("Are the binary trees identical? " + identical); // Output: true
    }
}
