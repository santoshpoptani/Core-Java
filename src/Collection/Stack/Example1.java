package Collection.Stack;

import java.util.Stack;
/**
 * In stack, elements are stored and accessed in Last In First Out manner.
 * That is, elements are added to the top of the stack and removed from the top of the stack.
 *
 * vector implements list
 * stack extends vector
 * **/
public class Example1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        System.out.println("Peeking: "+stack.peek());

        System.out.println("Removing the element: "+stack.pop());
    }
}
