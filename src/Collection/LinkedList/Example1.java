package Collection.LinkedList;

import java.util.LinkedList;
import java.util.Queue;
/**
 * A Queue is designed in such a way so that the elements added to it
 * are placed at the end of Queue and removed from the beginning of Queue
 *
 * Queue interface in Java collections has two implementation:
 * LinkedList and PriorityQueue, these two classes implements Queue interface.
 *
 * This is the LinkedList Implementation of Queue
 *
 * About LinkedList
 * A LinkedList in Java is a data structure that organizes elements in a linear order
 * Each element, known as a node, holds the actual data and a reference to the next node in the sequence
 * it Follows FIFO (First In First Out)
 * **/
public class Example1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

        //Inserts the specified element into the queue.
        // If the task is successful,offer() returns true, if not it returns false.
        queue.offer("Cat");
        queue.offer("Dog");
        queue.offer("Lion");
        queue.offer("Tiger");
        System.out.println(queue);

        //Returns the head of the queue. Returns null if the queue is empty.
        System.out.println("Accessed element: "+queue.peek());

        //Returns and removes the head of the queue. Returns null if the queue is empty.
        System.out.println("Removed element: "+ queue.poll());
        System.out.println("Updated: "+queue);

        //Below methods are not used because they throw exceptions

        //Inserts the specified element into the queue. If the task is successful,
        // add() returns true, if not it throws an exception.
        queue.add("Horse");
        //Returns the head of the queue. Throws an exception if the queue is empty.
        System.out.println("element Methods: "+queue.element());
        //Returns and removes the head of the queue. Throws an exception if the queue is empty.
        System.out.println("Removed method: "+queue.remove());
        System.out.println(queue);
    }
}
