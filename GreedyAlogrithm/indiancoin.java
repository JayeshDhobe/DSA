package GreedyAlogrithm;

import java.util.*;

public class indiancoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Collections.reverseOrder());

        int countofcoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countofcoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }

        }
        System.out.println("Total min coins used " + countofcoins);

        // TP PRINT WHICH COIN IS USED
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
