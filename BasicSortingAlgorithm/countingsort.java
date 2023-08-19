package BasicSortingAlgorithm;

public class countingsort {
    public static void countsort(int arr[]) {

        int largest =  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];//+1 because of we starting from the 0 & also  postive number
        //frequency count
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while (arr[i] > 0 ) {
                arr[j] = i;
                j++;
                count[i]--;
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
        int[] arr = { 5, 4, 3, 2, 1 };
        countsort(arr);
        printarry(arr);
    }
}
