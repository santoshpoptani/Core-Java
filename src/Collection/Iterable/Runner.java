package Collection.Iterable;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        Example1<Integer> ex = new Example1<>();
        ex.add(1);
        ex.add(2);
        ex.add(3);

       /* Iterator<Integer> iterator = ex.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        for(int item : ex){
            System.out.println(item);
        }
    }
}
