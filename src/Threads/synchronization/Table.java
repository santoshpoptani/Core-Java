package Threads.synchronization;

public class Table {
    public  void printTable1(int n ){
        for(int i = 1; i<5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public  void printTable2(int y){
        for(int i = 1; i<5; i++){
            System.out.println(y*i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
