
public class buildBSTsortedarr {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node ConverToBst(int arr[], int st, int end) {
        int mid = (st + end) / 2;
        Node curr = new Node(arr[mid]);

        curr.left = ConverToBst(arr, st, mid - 1);
        curr.left = ConverToBst(arr, mid + 1, end);
        return curr;
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        /*
         * 8
         * / \
         * 5 11
         * / \ / \
         * 3 6 10 12
         * expected BST
         */

    }
}
