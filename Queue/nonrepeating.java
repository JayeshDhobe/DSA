package Queue;

import java.util.*;

public class nonrepeating {
    public static void printNonRepeating(String str) {

        int freq[] = new int[26]; // A--Z
        Queue<Character> q = new LinkedList<>(); // TO STORE BCZ IT IS IN STREAM

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) { // IF OCCCUR MORE THA 1 THEN REMOVE FROM QUEUE
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }

        System.out.println();
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}