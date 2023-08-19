package BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println( ( 5 & 6)); //AND 
        System.out.println( ( 5 | 6));//OR
        System.out.println( ( 5 ^ 6));//XOR
        System.out.println( (~5)); //1's compliment or NOT
        System.out.println( ( 5 << 6));//LEFT-SHIFT
        System.out.println( ( 6 >> 1));//RIGHT-SHIFT
    }
}
