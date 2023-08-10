package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This the example of ArrayList with some of its common methods
 * while removing an inserting element the time complexityis BigO(n)
 * **/
public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // add methods ads elemets to list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //this method will get the list item by proviing index
        System.out.println(list.get(1));

        // set method will set/update the element at provided index
        list.set(3,6);

        //remove method will remove the element from list
        list.remove(2);

        // it will directly remove the element not the element of the index, directly the element
        list.remove(Integer.valueOf(1));

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        //addAll method will add elements from list2 to list
        list.addAll(list2);

        //this will check the elements is present or not in list returns boolean value
        list2.contains(300);


        for(int item : list2){
            System.out.println(item);
        }
    }
}
