package Collection.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This the Example of Sets Hashsets and LinkedHashSets are the concrete implementation of set
 *
 * Property of sets is it doesnot allow duplicate values or elements
 *
 * order of insertion is not maintained by Hashset
 * LinkedHashSet maintain insertion order
 * **/
public class Example1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println(set1);

        set1.remove(2);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        set1.addAll(list);
        System.out.println(set1);
    }
}
