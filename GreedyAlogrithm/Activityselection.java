package GreedyAlogrithm;

import java.util.*;

public class Activityselection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // IF END QUEU IS NOT IN SORTED MANNER
        int activites[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        // LAMBDA FUNCTION == SHORT FORM
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);
        int LastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= LastEnd) {
                maxAct++;
                ans.add(i);
                LastEnd = end[i];
            }
        }
        System.out.println("maxActivity= " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

    }
}
