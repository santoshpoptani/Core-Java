package Collection.ComparableAndComparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This the example of implementing Comparator
 * we created the Studet2 class and implemented Comparator interface
 * which has compare function for comparision
 *in Collection.sort() we need to provide collection and instance of class implementing Comparator
 *
 * we can also implement comparator without creating the class i.e by using anonymous class or using Lambada
 *
 * implemeting Comparator is called Total Ordering
 * Comparartor gives flexibility to sort collection in any pattern
 * **/
public class Example2 {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("Santosh",90));
        list.add(new Student2("Henery",55));
        list.add(new Student2("David",66));
        list.add(new Student2("Jhon",75));

        System.out.println(list);

        //Collections.sort(list,new Student2());

        // Here we are using Lambada function, it can be used without creating another class
        Collections.sort(list,(s1,s2)-> s2.getMarks()-s1.getMarks());
        System.out.println(list);
    }
}
