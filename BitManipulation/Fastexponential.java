package BitManipulation;

public class Fastexponential {
     public static int exponential(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) !=0) { // LSB
                ans = ans*a;
            }
            a = a*a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(exponential(3, 5));
    }
}
