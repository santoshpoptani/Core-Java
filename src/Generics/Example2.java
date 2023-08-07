package Generics;
/***
 *
 * This the Example for Bounded Generic
 * In Example1 We can also pass numbers to the constructor but in this example we have bonded it
 * we have use 'extends Sting' at class level in type parmater which means that it will only accept
 * the String type parameter
 *
 * As seen in example we tried to give numeric parameter it thorws compile error it is because of bounded
 * type parameter
 *
 * we can apply bound at Method level as seen in example there it extends Number which mneas it wil only allow
 * the Number type parameter
 *
 *
 * ***/
class BankAccount2<T extends String> {
    private T value;

    public BankAccount2(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println(value);
    }

    public <T extends Number> void depositeMoney(T[] money) {
        for (T m : money) {
            System.out.print(m+" ");
        }
        System.out.println();
    }
}
public class Example2 {
    public static void main(String[] args) {
        BankAccount2<String> b1 = new BankAccount2<>("Santosh");
        //BankAccount2<Integer> b2 = new BankAccount2<>(44);
        b1.display();
       // b2.display();

        Integer [] m1 = {100,200,500,1000};
        Double[] m2 = {55.55,44.12,66.78,22.58};
        String[] m3 = {"abc","def"};

        b1.depositeMoney(m1);
        b1.depositeMoney(m2);
        //b1.depositeMoney(m3);


    }
}
