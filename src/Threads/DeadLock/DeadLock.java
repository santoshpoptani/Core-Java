package Threads.DeadLock;

/*
*
* Important Interview Question
*
* This is how the simple deadlock is created
*
* to prevent this scenario always ensure the order in which thread acquire lock is same
*
* */
public class DeadLock {
    public static void main(String[] args) {
        String lock1 = "San";
        String lock2 = "Ghost";

        Thread thread = new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Lock Acquired");
                }
            }
        }, "Thread1");

        Thread thread2 = new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Lock Acquired");
                }
            }
        },"Thread2");

        thread.start();
        thread2.start();
    }
}
