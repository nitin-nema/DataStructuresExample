package tree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeCountNodes {

    // Function to count nodes in a binary tree
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeCountNodes solution = new BinaryTreeCountNodes();

        // Constructing the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Count nodes in the tree
        int nodeCount = solution.countNodes(root);
        System.out.println("Number of nodes in the binary tree: " + nodeCount); // Output: 5
    }
}
