package Exceptions;

/***
 *
 * This is the example showing the use of Throw Keyword
 * ***/

public class Example1 {
    static void checkEligiblity(int age,int weight){
        if(age<18 && weight<60){
            throw new ArithmeticException("Student is not eligible for registration");
        }
        else {
            System.out.println("Student is eligible");
        }
    }

    public static void main(String[] args) {
        checkEligiblity(12,50);
        System.out.println("Have a nice day!");
    }
}
