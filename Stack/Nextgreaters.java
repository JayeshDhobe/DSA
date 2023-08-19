package Stack;
import java.util.*;


public class Nextgreaters {
    
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreat[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {

            // 1. while COMPARE TO NEXT
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //2 IF ELSE --- EMPTY OR NOT
            if(s.isEmpty()) {
                nxtGreat[i] = -1;
            } else {
                nxtGreat[i] = arr[s.peek()];
            }

            //3   push in the stack
            s.push(i);
        }

        //4.  print
        for (int i = 0; i < nxtGreat.length; i++) {
            System.out.print(nxtGreat[i]+ " ");
        }
        System.out.println();
        }
    }