package IOstream;

import javax.sql.rowset.spi.SyncResolver;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.SoftReference;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x =sc.nextInt();
        System.out.println(x);

        System.out.println("Enter your name");
        String s =sc.nextLine();
        System.out.println(s);

        File file = new File("D:\\Java\\Core Java\\src\\IOstream\\TestFile.txt");
        Scanner f = new Scanner(file);
        String st =f.nextLine();
        System.out.println(st);

    }
}
