package Exceptions;
/***
 *
 * The Throws Keyword in Method Signature will throw an error when the method is called i.e
 * the method where it is called has to handle the Exception
 * ***/
public class Example3 {
    void method1() throws ArithmeticException{
        throw new ArithmeticException("Calc Error");
    }
    void method2(){
        method1();
    }
    void method3(){
        try {
            method2();
        }catch (ArithmeticException exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        Example3 ex = new Example3();
        ex.method3();
    }
}
