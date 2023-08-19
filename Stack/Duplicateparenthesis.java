package Stack;
import java.util.*;

public class Duplicateparenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);

            //CLOSING 

            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') { //check with the value in the stack         i.e------->>> opening parenthrses
                    count++;
                }
                if (count < 1) { //DUPLICATE
                    return true;
                }
            }

            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //  String str = "((a+b))"; //true
         String str1 = "(a-b)"; //false
         System.out.println(isDuplicate(str1));
    }
}
