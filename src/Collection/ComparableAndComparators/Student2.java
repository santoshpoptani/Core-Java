package Collection.ComparableAndComparators;

import java.util.Comparator;

public class Student2 implements Comparator<Student2> {
    private String name;
    private int marks;

    public Student2() {
    }

    public Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o2.marks-o1.marks;
    }
}
