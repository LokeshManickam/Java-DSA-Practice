package Trees;

public class MaxValueTree {

    static int findMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(15);
        int maxValue = findMax(root);
        System.out.println("Maximum Value: " + maxValue);
    }
}
