package Exceptions;
/***
 *
 * This is example of creating custom Exception
 * Create the class extends Exception class and define your logic for handling Custom Exception
 * ***/
public class Example4 extends Exception{
    String str;
    Example4(String str){
        this.str = str;
    }

    public String toString(){
        return ("Custom Exception Occurred " + str);
    }
}

class runner{
    public static void main(String[] args) {
        try {
            System.out.println("Starting try block");
            throw  new Example4("This is custom Exception");
        }catch (Example4 ex){
            System.out.println(ex);
        }
    }
}
