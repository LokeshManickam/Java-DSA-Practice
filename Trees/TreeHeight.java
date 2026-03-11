package Trees;

public class TreeHeight {

    static int Height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int LeftHeight = Height(root.left);
        int RightHeight = Height(root.right);
        return 1 + Math.max(LeftHeight, RightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        int h = Height(root);
        System.out.println("Height of th Tree: " + h);
    }
}
