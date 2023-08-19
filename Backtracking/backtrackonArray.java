package Backtracking;

public class backtrackonArray {

    public static void chnageArr(int arr[], int i , int val) {

        //BASE CASE
        if (i == arr.length) {
           printArry(arr);
           return;
        }

        //RECURSION
        arr[i] =  val;
        chnageArr(arr, i+1, val+1);        
        arr[i] = arr[i] - 2;
        
    }
    public static void printArry(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        chnageArr(arr, 0, 1);
        printArry(arr);

    }
}
