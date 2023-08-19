package ARRAY;

public class buysellstock {
   
    public static int stocks(int price[]) {
        int buyprice = Integer.MAX_VALUE; //lowest buying price
        int maxProfit = 0; //calculate  max profit
        
        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) { //profit
                int profit = price[i] - buyprice; //today profit
                maxProfit = Math.max(maxProfit, profit);//global profit 
        }else{
            buyprice = price[i];
        }
    }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[]  = {7,1,5,3,6,4};
    System.out.println(stocks(prices));    
}
    
}
//O(n)