package Trees;

public class InorderTraversal {

    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(10);
        root.right = new TreeNode(50);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(30);
        System.out.println("Inorder Traversal");
        inorder(root);
    }
}
