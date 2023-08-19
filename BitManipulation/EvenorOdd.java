package BitManipulation;

public class EvenorOdd {
    public static void oddoreven(int n ) {
        int bitmask = 1;
        if ((n & bitmask) ==0) {
            System.out.println("even no");
        }else{
            System.out.println("Odd no");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(11);
        oddoreven(4);
    }
}
