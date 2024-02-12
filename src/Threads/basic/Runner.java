package Threads.basic;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main Therad Starts");
        //this is thread 1 extending Thread Class
        Thread thread1 = new Thread1("Thread1");
        thread1.start();

        //This is Thread 2 implements Runnable interface
        Thread thread2 = new Thread(new Thread2(), "Thread 2");
        thread2.start();

        System.out.println(Thread.currentThread());
        System.out.println("Main Thread exit");
    }
}
