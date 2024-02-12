package Threads.synchronization;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        Table table = new Table();

       /* new Thread(()->{
            int counter = 0;
            while(++counter<10){
                System.out.println("Pushed" +stack.push(100));
            }
        },"Pusher").start();

        new Thread(()->{
            int counter = 0;
            while (++counter <10){
                System.out.println("Popped" + stack.pop());
            }
        },"Popper").start();*/

        //Easy Example
        new Thread(()->{
            table.printTable1(2);
        },"Table1").start();

        new Thread(()->{
            table.printTable2(10);
        },"Table2").start();
    }

}
