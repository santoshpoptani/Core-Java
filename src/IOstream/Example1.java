package IOstream;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {
        //FileInputStream
        try {
            FileInputStream fis = new FileInputStream("D:\\Java\\Core Java\\src\\IOstream\\TestFile.txt");
            int value = 0;
            while ((value = fis.read()) != -1) {
                System.out.print((char) value + " ");
            }
            fis.close();
        } catch (IOException ioException) {
            System.out.println(ioException);
        }

        //FileOutputStream
        try {
            String path = "D:\\Java\\Core Java\\src\\IOstream\\TestFile.txt";
            FileOutputStream fos = new FileOutputStream(path, true);
            String data = "\n Santosh Developer";
            fos.write(data.getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        /*Let’s take an example program where we will understand how to read data from the keyboard
        and write it to fileout.txt file.
        Look at the program source code to understand better.*/

        DataInputStream dis = new DataInputStream(System.in);
        try {
            String path = "D:\\Java\\Core Java\\src\\IOstream\\TestFile.txt";
            FileOutputStream out = new FileOutputStream(path);
            int value = 0;
            while ((value = dis.read()) != '@') {
                char ch = (char) value;
                out.write(ch);
            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
