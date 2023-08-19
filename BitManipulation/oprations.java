package BitManipulation;

public class oprations {

    //1 GET INIT
    public static int getinit(int n, int i) {
        int bitmask =  1<<i;
        if ((n & bitmask) ==0) {
            return 0;
        }else{
            return 1 ;
        }
    }
    //2 SET INIT
    public static int setinit(int n, int i) {
        int bitmask = ~(1<<i);
        return n | bitmask;
    }

    //3 CLEAR INIT
    public static int clearinit(int n, int i) {
        int bitmask =  1<<i;
        return n |bitmask;
    }
   
      // 4 UPDATE INIT
    public static int updateinit(int i, int n , int newbit) {
        if (newbit ==0) {
            return clearinit(n, i);
        }else{
            return setinit(n, i);
        }
    }
    //CLEAR I NUMBER TH OF BITS
    public static int clearIthnit(int n, int i) {
        int bitmask = (~0)<<1;
        return n & bitmask;
    }
  //CLEAR RANGE OF BITS
  public static int clearrange(int n, int i, int j) {
    int a = ((~0)<<(j+1));
    int b = ((i<<1)-1);
    int bitmask = a|b;
    return n & bitmask;
  }

  //CHECK POWER OF 2 
  public static boolean isPowerof2(int n) {
    return  (n & (n-1))==0 ;
  }
 
  //GOOGLE
  // COUNT NUMBER OF 1 IN BITS == Calculated by log2n+1
  public static int countbits(int n) {
    int count =0;
    while (n > 0) {
        if ((n & 1) !=0) {
            count++;
        }
       n = n>>1;
    }
    return count;
  }
  
    public static void main(String[] args) {
        System.out.println( getinit(10, 2));
        System.out.println( setinit(10, 2));
        System.out.println( clearinit(10, 1));
        System.out.println( updateinit(10, 2, 1));
        System.out.println( clearIthnit(10, 1));
        System.out.println( clearrange(10, 2, 4));
        System.out.println( isPowerof2(4));
        System.out.println(" BELOW ASKED IN GOOGLE ");
        System.out.println( countbits(10));


       
    }
}
