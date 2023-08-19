package GreedyAlogrithm;

import java.util.*;

public class FractionalKnapsnack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0 col mein index
        // 1 col mein ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // Ascending sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // But we want in descendding order therefire we reverser the loop
        int capacity = w;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // INCLUDE FULL ITEAM
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {// INCLUDE FRACTIONLA VALUE I..E === REMAININNG
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("finalVal= "+ finalVal );
    }
}
