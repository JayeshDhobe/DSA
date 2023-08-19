// package Queue;
// import java.util.*;

// public class Twoqueuestack {
// static class stack{
// static Queue<Integer> q1 = new LinkedList<>();
// static Queue<Integer> q2 = new LinkedList<>();

// public static boolean isEmpty(){
// return (q1.isEmpty() && q2.isEmpty());
// }

// //1 PUSH
// public static void push(int data){
// if(!q1.isEmpty()){
// q1.add(data);
// }else{
// q2.add(data);
// }
// }

// //2 REMOVE
// public static int pop(){
// if (!q1.isEmpty()) {
// System.out.println("Stack is empty");
// return -1;
// }
// int top = -1;

// //CASE 1 -- Empty queue
// if (!q1.isEmpty()) {
// while (!q1.isEmpty()) {
// top = q1.remove();
// if (!q1.isEmpty()) {
// break;
// }
// q2.add(top);

// }
// } else{ //CASE 2
// while (!q2.isEmpty()) {
// top = q2.remove();
// if (!q2.isEmpty()) {
// break;
// }
// q1.add(top);
// }
// return top;
// }
// return top;
// }

// //PEEK
// public static int peek(){
// if (!q1.isEmpty()) {
// System.out.println("Stack is empty");
// return -1;
// }
// int top = -1;

// //CASE 1 -- Empty queue
// if (!q1.isEmpty()) {
// while (!q1.isEmpty()) {
// top = q1.remove();
// q2.add(top);

// }
// } else{ //CASE 2
// while (!q2.isEmpty()) {
// top = q2.remove();
// q1.add(top);
// }
// return top;

// }
// return top;
// }

// public static void main(String[] args) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);
// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }

// }
// }
// }
