package Java8.TypesOfFunctionaalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        //Consumer Interface
        List<String> names = Arrays.asList("Santosh","Shubham","Vedant","Arpit");
        Consumer<String> cos = name -> {
           String Uppercase = name.toUpperCase(Locale.US);
            System.out.println(Uppercase);
        };
       /*for(String str : names)
           cos.accept(str);*/

       //It can done like this also
        //as ForEach take consumer interface object
       //names.forEach(cos);

        //Using Lambda
        names.forEach(x -> System.out.println(x.toUpperCase()));

        //Predicate Interface
        System.out.println("Prdeicate Interface");
        Predicate<String> pre = x ->{
          return x.equalsIgnoreCase(new StringBuilder(x).reverse().toString());
        };
        System.out.println(pre.test("Racecar"));
        System.out.println(pre.test("Hello"));

        //Function Interface
        System.out.println("Function Interface");
        Function<Integer, Integer> fun = y ->{
            int ans = y*100;
            return ans;
        };
        System.out.println(fun.apply(2));
        System.out.println(fun.apply(4));

        //Supplier interface
        System.out.println("Supplier Interface");
        Supplier<Integer> sup = ()-> (int) (Math.random()*10);
        System.out.println(sup.get());
        System.out.println(sup.get());
    }

}
