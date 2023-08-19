package GreedyAlogrithm;

import java.util.*;

public class chocolate {
    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            // FOR horizontal cut
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp); // Horizintal piece * vertical
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp); // vertical piece * horizontal
                vp++;
                v++;
            }

        }

        while (h < costHor.length) { // bigger is horizontal therefore horizontal pieces
            cost += (costHor[h] * vp); // Horizintal piece * vertical
            hp++;
            h++;
        }
        while (v < costVer.length) { // bigger is horizontal therefore horizontal pieces
            cost += (costVer[v] * hp); // vertical piece * horizontal
            vp++;
            v++;
        }
        System.out.println("min cost of cutting = " + cost);

    }
}
