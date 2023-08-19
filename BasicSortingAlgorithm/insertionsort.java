package BasicSortingAlgorithm;

public class insertionsort {
    public static void insertsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            //find out correct position to insert
            while (prev >=0  && arr[prev] > curr) { //for desendinng < 
               arr[prev + 1] = arr[prev];
               prev--;
            }
            //insertion
            arr[prev+1] =  curr;
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
        insertsort(arr);
        printarry(arr);
    }
    
}
