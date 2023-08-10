package Collection.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values.
 * A map cannot contain duplicate keys. And, each key is associated with a single value.
 * HashMap is unordered collection i.e Doesn’t maintain insertion order.
 * It allows null keys and values. However only one null key is allowed. Multiple null values are allowed.
 * **/
public class Example1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //this Method put entries into map
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);

        // this method get the value of key in map
        System.out.println(map.get("four"));

        System.out.println(map);

        //Returns boolean if key/value is present in map
        System.out.println(map.containsKey("two"));
        System.out.println(map.containsValue(3));

        //Iterating over map usnig enetryset()
        //map.entryset() return set of entries
        //Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for(String keys:map.keySet()){
            System.out.println(keys);
        }

        for(Integer val:map.values()){
            System.out.println(val);
        }

        // remove element associated with key 2
        int value = map.remove("two");
        System.out.println("Removed value: " + value);

        int newPrice = map.compute("four", (key, val) -> val*10);
        System.out.println("Computing Value " + newPrice);

        // print updated HashMap
        System.out.println("Updated HashMap: " + map);
    }
}
