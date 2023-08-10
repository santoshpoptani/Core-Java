package Collection.ComparableAndComparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This the Example using Comparable
 * we created a custom Student class which implements Comparable interface
 * that has compareTo() which compare the the students and sort the collection
 *
 * By Default the Java Class like Integer, String implements Comparable interface
 * implementing comparable is called Natural ordering
 * **/
public class Example1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Santosh",90));
        list.add(new Student("Henery",55));
        list.add(new Student("David",66));
        list.add(new Student("Jhon",75));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }


}
