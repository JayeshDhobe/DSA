import java.util.*;

public class preordertree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null; // initialize the child as null for each node created in constructor of
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildtree(int nodes[]) {
            idx++;// 1 position
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNodes = new Node(nodes[idx]);
            newNodes.right = buildtree(nodes);
            newNodes.left = buildtree(nodes);

            return newNodes;
        }

        // 1 PREORDER
        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        // 2 INORDER

        public void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
        // 3 POSTORDER

        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }

        // 4 LEVEL ORDER
        public void level(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);

        // tree.preorder(root);
        // tree.Inorder(root);
        // tree.postorder(root);

        System.out.println("level order  ");
        tree.level(root);

    }
}
