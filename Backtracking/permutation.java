package Backtracking;

public class permutation {
    public static void permut(String str, String ans) {

        //BASE
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }


        //RECURSION
        for(int i=0; i<str.length(); i++) {
            char pickedChar = str.charAt(i);
       
            // "abcde" == ab+ de ;  remove c used. substring()--- string inbuilt function
            String restStr = str.substring(0,i) + str.substring(i+1);
            permut(restStr, ans+pickedChar);
        }
        }
    public static void main(String[] args) {
        String str = "abc";
        permut(str, " ");
    }
}
