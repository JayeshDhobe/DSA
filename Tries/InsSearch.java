package Tries;

public class InsSearch {
    static class Node {
        Node[] children = new Node[26]; // children node array
        boolean eow = false;

        public Node() { // constructor
            for (int i = 0; i < children.length; i++) {
                // initialize children node with null
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // 1. INSERT
    public static void insert(String word) { // create a trie
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            // find index
            int idx = word.charAt(i) - 'a'; // index of that word in the string
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node(); // add new node agar curr children arr pr kuch nahe hai to
            }
            curr = curr.children[idx]; // curr ko update krdo
        }
        curr.eow = true;
    }

    // 2. SEARCH
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            // find index
            int idx = key.charAt(i) - 'a'; // index of that word in the string
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx]; // curr ko update krdo
        }
        return curr.eow = true;
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]); // creating a trie
        }

        System.out.println(search("zeb"));
    }
}
