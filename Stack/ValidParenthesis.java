package Stack;
import java.util.*;

public class ValidParenthesis {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char Ch = str.charAt(i);

            //OPENING
            if (Ch == '(' || Ch == '{' || Ch == '[') {
               s.push(Ch);
        }else{
            //CLOSING
            if (s.isEmpty()) {
                return false;
            }

            if ((s.peek() == '(' && Ch == ')')
            || (s.peek() == '{' && Ch == '}')
            || (s.peek() == '[' && Ch == ']')) {

                s.pop();
            }else{
                return false;
            }

        }
        
    }
    if (s.isEmpty()) {
        return true;
    }else{
        return false;
    }
}
    public static void main(String[] args) {
        String str ="({})[]";
        System.out.println(isValid(str));
    }
}
