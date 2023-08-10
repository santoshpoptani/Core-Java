package Collection.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;
/**
 * The PriorityQueue class provides the functionality of the heap data structure.
 *It implements the Queue interface.
 * bydefault PriorityQueue use minheap DS
 * we can reverse it by passing comaprator in constructor
 * comparator.revesrseOrder();
 * **/
public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(1);
        queue.offer(13);
        queue.offer(21);
        queue.offer(11);

        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
