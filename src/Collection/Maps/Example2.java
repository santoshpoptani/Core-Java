package Collection.Maps;

import java.util.Map;
import java.util.TreeMap;
/**
 * This is the example for Tree map
 * The TreeMap class of the Java collections framework provides the tree data structure implementation.
 *  the elements in TreeMap are sorted naturally (ascending order).
 * **/
public class Example2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();

        map.put(1,"Ross");
        map.put(2,"Joey");
        map.put(3,"Chandler");

        System.out.println(map);

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry);
        }

        String value1 = map.get(3);
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        String value2 = map.getOrDefault(4, "Null");
        System.out.println("Using getOrDefault(): " + value2);
    }
}
