package Backtracking;

public class subset {
    public static void findSub(String str, String ans, int i) {
        //BASE
        if (i == str.length()) {
            if (ans.length() ==0) {
                System.out.println("Null");
            }else{
            System.out.println(ans);
            }
            return;
        }

        //RECURSION
        //YES
        findSub(str, ans+str.charAt(i), i+1);
        //NO
        findSub(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSub(str, " ", 0);
    }
}
