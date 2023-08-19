package BasicSortingAlgorithm;

public class selectionsort {
 
    public static void selectionsorts(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;  //minpost == currentpos

            //find min in unsorted array  
            //in increasing order bcz arr.lenght < in J loop
            //if we want decresing order then arr.length > J loop
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {{
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
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
        selectionsorts(arr);
        printarry(arr);
    }
}
