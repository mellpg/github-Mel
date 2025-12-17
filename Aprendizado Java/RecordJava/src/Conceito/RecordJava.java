package Conceito;

public class RecordJava {
    public static void main(String[] args) {
        Person p1 = new Employee("João", 30, 5000.0);
        Person p2 = new Student("Maria", 20, "Computação");

        System.out.println(p1.greet());
        System.out.println(p2.greet());
    }
}
