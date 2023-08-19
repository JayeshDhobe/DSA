package Recursion;

//1 DECREASING ORDER
public class basic {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // 2 INCREASING ORDER
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // 3 Factorial
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // 4 SUM OF N NATURAL NUMBER
    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sumN(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // 5 FIBONACCI
    public static int fibon(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fnm1 = fibon(n - 1);
        int fnm2 = fibon(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // 6 SORTED OR NOT
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // 7 FIRST OCCURANCE
    public static int firstocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstocc(arr, key, i + 1);
    }

    // 8 LAST OCCURANCE
    public static int lastocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastocc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // 9 x to th power n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        // int xnm1 = power(x, (n-1));
        // int xn = x* xnm1;
        // return xn;

        return x * power(x, (n - 1));
    }

    // 10 optimise x t the power n
    public static int optimized(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimized(a, n / 2);
        int halfpowersq = halfpower * halfpower;

        // for odd no
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    // 11 tilling problem
    public static int tilling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // //vertical
        // int fnm1 = tilling(n-1);
        // //horizontal
        // int fnm2 = tilling(n-2);
        // //total
        // int totval = fnm1 + fnm2;
        // return totval;
        return tilling(n - 1) + tilling(n - 2);
    }

    // 12 REMOVE DUPLICATE STRING
    public static void duplicate(String str, int idx, StringBuilder newStr, boolean[] bs) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (bs[currChar - 'a'] == true) {
            duplicate(str, idx + 1, newStr, bs);
        } else {
            bs[currChar - 'a'] = true;
            duplicate(str, idx + 1, newStr.append(currChar), bs);

        }
    }

    // 13 FINDING PAIRING
    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // //single
        // int fnm1 = pairing(n-1);

        // //pair -couple
        // int fnm2 = pairing(n-2);

        // int pairways = (n-1) * fnm2;

        // //total ways
        // int totalways = fnm1 + pairways;
        // return totalways;

        return pairing(n - 1) + (n - 1) * pairing(n - 2);
    }

    // 14 BINARY STRING PROBLEM

    public static void binaryString(int n, int LastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryString(n - 1, 0, str + "0"); // 0 is alway present no error come
        if (LastPlace == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // int a = 2;
        int n = 5;
        String str = "appnnacollage";
        int[] arr = { 8, 3, 9, 5, 10, 2, 5, 3 };
        printDec(n);
        printInc(n);
        System.out.println(" "); // for just line break
        System.out.println(fact(n));
        System.out.println(sumN(n));
        System.out.println(fibon(n));
        System.out.println(isSorted(arr, 0));
        System.out.println(firstocc(arr, 5, 0));
        System.out.println(lastocc(arr, 5, 0));
        System.out.println(power(5, 2));
        System.out.println(optimized(n, n));
        System.out.println(tilling(4));
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(pairing(3));
        binaryString(3, 0, "");

    }
}
