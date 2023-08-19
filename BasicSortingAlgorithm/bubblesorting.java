package BasicSortingAlgorithm;
import java.util.Arrays;

public class bubblesorting {
    public static void bsort(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int i = 0; i < arr.length-1-turn; i++) {
             if (arr[i] > arr[i+1]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
             }
            }
        }
        }
        public static void printarry(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        // bsort(arr);
        Arrays.sort(arr,0,3);
        printarry(arr);
    }
}
