package rank.basic;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(2);


        System.out.println(stack.search(2));
        System.out.println(stack.search(0));
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }
}
