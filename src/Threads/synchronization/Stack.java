package Threads.synchronization;
/*
*
* link to for What is Synchronization
* https://www.scientecheasy.com/2020/08/synchronization-in-java.html/
*
* */
public class Stack {
    int array[];
    int stackTop;

    public Stack(int size) {
        array = new int[size];
        stackTop =-1;
    }

    public synchronized boolean push(int element){
        if(isFull())
            return false;

        ++ stackTop;
        //the below line of code sleep the Thread for 1 sec
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        array[stackTop] = element;

        return true;
    }

    public synchronized int pop(){
        if(isEmpty())
            return Integer.MIN_VALUE;

        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;

        try{ Thread.sleep(1000);} catch (Exception e){System.out.println(e);}

        stackTop --;
        return obj;
    }

    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop > array.length-1;
    }
}
