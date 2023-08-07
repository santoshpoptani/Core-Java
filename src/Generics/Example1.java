package Generics;
/***
 *
 * We Have Created the custom Generic Class here we have displayed that
 * class can take any value and without type mismatch error i.e typesafety is achived
 * and we dont need to cast the output to other types so type casting is also resolved
 *
 * Here the <T> the Parameter type and Bankaccount is base type
 *
 * For more detail example visit ot my Notion page or youtube cahnnel GreatLearning
 *
 * Here We can see that while Initializing the Bankaccount we can pass number also this type of 'Type parameter'
 * is called unbounded type parameter
 *
 * We can restrict the type parameter using extend keyword
 *
 * lets see the example of bounded type parameter in Example2
 * ***/
class BankAccount<T> {
    private T value;

    public BankAccount(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println(value);
    }

    public <T> void depositeMoney(T[] money) {
        for (T m : money) {
            System.out.print(m+" ");
        }
        System.out.println();
    }
}

public class Example1 {
    public static void main(String[] args) {
        BankAccount<String> b1 = new BankAccount<>("Santosh");
        BankAccount<Integer> b2 = new BankAccount<>(44);
        b1.display();
        b2.display();

        Integer [] m1 = {100,200,500,1000};
        Double[] m2 = {55.55,44.12,66.78,22.58};

        b1.depositeMoney(m1);
        b1.depositeMoney(m2);
    }
}
