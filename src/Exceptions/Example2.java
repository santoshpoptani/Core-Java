package Exceptions;

import java.io.IOException;

public class Example2 {
    void method1(int num ) throws IOException,ClassNotFoundException{
        if(num==1){
            throw new IOException("IOexception occured");
        }
        else {
            throw new ClassNotFoundException("ClassNotFound Exception Occurred");
        }
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        try{
            ex.method1(1);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
