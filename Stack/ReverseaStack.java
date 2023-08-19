package Stack;

import java.util.*;
public class ReverseaStack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }


    public static void reverseaStack(Stack<Integer> s) {

        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseaStack(s);
        pushAtBottom(s, top);
        
    }

    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //3--2--1

        reverseaStack(s);
        print(s);
        // 1--2--3
        
    }
}