package Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerClass {
    public static void main(String[] args) {

        Operation add = new Operation();
        RunnerClass runnerClass = new RunnerClass();
        System.out.println(runnerClass.Calculate(Arrays.asList(1,2,3,4), add));

        List<Integer> additionWith5 = runnerClass.Calculate(Arrays.asList(1, 2, 3, 4), new MyFunction() {
            @Override
            public int apply(int i) {
                return i + 5;
            }
        });

        //Using Anynoms Inner class
        List<Integer> MultiplyBy100 = runnerClass.Calculate(Arrays.asList(1, 2, 3, 4, 5), new MyFunction() {
            @Override
            public int apply(int i) {
                return i * 100;
            }
        });

        System.out.println(additionWith5);
        System.out.println(MultiplyBy100);

        System.out.println("Rewriting the code with lambada");

        // rewrirnt code with lambadas
        // just in two line
        // we can even further simply it as it has only one statemnne;

        runnerClass.Calculate(Arrays.asList(1,2,3,4),(x)->{
            return x+5;
        });

        //AS you can see we have written the line the whole code in one line
        // in Lambadas if there is onnly one line and one parameter as seen below example we can ommit the
        // paranthesis areound parameter and ommit cruly braces
        // if there are more than one parmater and statments we need to add the paranthesis and curly brace around the
        // statments
        runnerClass.Calculate(Arrays.asList(1,2,3,4,5), x -> x + 5 );

        // this is how we add curly brace around statment if threre are more than one statnments
        // same conditons apply to parmeters
        runnerClass.Calculate(Arrays.asList(1,2,3,4), x->{
            int y = x * 100;
            return y /5;
        });
    }

    public List<Integer> Calculate(List<Integer> list, MyFunction function) {
        List<Integer> squares = new ArrayList<>();
        for (int i : list) {
            squares.add(function.apply(i));
        }
        return squares;
    }
/*
* This the Basic way to pass function as a paramerter in java
*
* To pass a function as a parameter we need to wrap it in interface
*
* Step to do it
* 1. Create Interface with one fucntion
* 2. Create a class that imlements the interface
* 3. Implement the Method
* 4. Pass the object of the class
*
* Now here every time user want to pass the fucntion different logic he need implement the
* interface and implment the method with its own logic
*
* So we need to create som any class with the implmetationg interface
*
* another short way is to do with Anonymous class
* see example above
*
* Lambadas are just to make code more readable
* as you can see the the code looks complex to read so to make it more readale and easy lamabdas come to picture
*
* rewriting the anynomyous class with lamabadas
* */
}
