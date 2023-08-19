package ARRAY;

public class kadanealgo {
    public static void kadanes(int number[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }  
        System.out.println("max sum = " + maxSum);     
    }
    public static void kadas(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs =  cs-number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max sum is " + ms);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
          
      }
}
