package Java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,5,1);

        // Intermediate Mehtods
        //Map function
        System.out.println("Map Function - Intermediate Function");
        System.out.println("collect and forEach - Terminal Function");
        list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList())
                .forEach(x->System.out.println(x));


        //Filter Function
        System.out.println("Filter Function - Intermediate Function");
        System.out.println("collect and forEach - Terminal Function");
        list.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList())
                .forEach(x->System.out.print(x + " "));
        System.out.println();
        //Sorted Function
        System.out.println("Sorted Function - Intermediate Function");
        System.out.println("collect and forEach - Terminal Function");
        list.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(x-> System.out.print(x + " "));


        //reduce Function
        System.out.println();
        System.out.println("Reduce function - Terminal function");
        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);


        /*
        *
        * Terminal Operations
        * Terminal Operations are the type of Operations that return the result.
        * These Operations are not processed further just return a final result value.
        *
        * Functions like
        * Collect , forEach , reduce are the terminal Operations
        *
        * */

        // some more examples
        class person{
            String name;
            int age;

            public person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }


        List<person> list1 = Arrays.asList(
                new person("Clark",24),
                new person("Alice",20),
                new person("Alex",20),
                new person("Charlie",50)
        );

        //Grouping examples
        //Grouping objects by age and collecting names:
        Map<Integer, List<String>> age = list1.stream()
                .collect(Collectors.groupingBy(person -> person.age,
                        Collectors.mapping(person -> person.name, Collectors.toList())));

        System.out.println(age);
        /*
        * output
        * {50=[Clark], 20=[Clark, Clark], 24=[Clark]}
        * */


        List<String> names = Arrays
                .asList(
                        "John",
                        "John",
                        "Mariam",
                        "Alex",
                        "Mohammado",
                        "Mohammado",
                        "Vincent",
                        "Alex",
                        "Alex"
                );

        //Counting Occurance using Streams
        Map<String, Long> count = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);

        class Employee{
            String name;
            List<String> projects;

            public Employee(String name, List<String> projects) {
                this.name = name;
                this.projects = projects;
            }

            public List<String> getProjects() {
                return projects;
            }
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", Arrays.asList("Project A", "Project B")));
        employees.add(new Employee("Jane", Arrays.asList("Project B", "Project C")));
        employees.add(new Employee("Bob", Arrays.asList("Project D")));

        List<String> collect = employees.stream()
                .flatMap(employee -> employee.getProjects().stream()
                        .distinct())
                .collect(Collectors.toList());
        System.out.println(collect);

    }

}
