package BasicSortingAlgorithm;
import java.util.Arrays;
public class inbuiltsort {
    public static void printarry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr,0,3);//ascending order
        // Arrays.sort(arr, Collection.reverseOrder( ));   ----> Descending order
        printarry(arr);
    }
}
