package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;


/***
 *
 * This Example Demonstrate the use of Wildcards in Generic using Wild cards we can easily deal with unknown type
 * symobil for wildcard is '?'
 *
 * There are 3 typees
 * 1. unbounded '?'
 * 2. UpperBounded '? extends someClass'
 * 3. LowerBounded '? super someClass'
 *
 * Using this three we can it makes code more flexible and specific when dealing with unknown type
 *
 * ***/
public class Example3 {
    public static void deleteBike(List<? extends Bike> l1, Bike b1){
        l1.remove(b1);
        System.out.println("Bike Removed");
    }

    public static void addBikes(List<? super Bullet> l2){
        l2.add(new Bullet("Classic 360"));
       // l2.add(new Harley("Harley DavidSon"));
        System.out.println("Bullet Added");
    }

    public static void printItems(List<?> l3){
        for(Object obj:l3){
            System.out.println(obj + " ");
        }
    }

    public static void main(String[] args) {

        List<Vehicle> v1 = new ArrayList<>();
        List<Bike> b1 = new ArrayList<>();
        addBikes(b1);
        addBikes(v1);
        printItems(v1);
        printItems(b1);
        Bike bike = b1.get(0);
        deleteBike(b1,bike);

    }
}

class Vehicle{
    private String name;

    Vehicle(String name){
        this.name = name;
    }


    public String toString(){
        return name;
    }
}

class Bike extends Vehicle{
    private String name;

    Bike(String name){
        super(name);
        this.name = name;
    }
}

class Bullet extends Bike{
    private String name;

    Bullet(String name){
        super(name);
        this.name = name;
    }
}

class Harley extends Bike{
    private String name;

    Harley(String name){
        super(name);
        this.name = name;
    }
}