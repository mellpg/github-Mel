package Conceito;

public record Student(String name, int age, String course) implements Person {
    @Override
    public String greet() {
        return "Sou o estudante " + name + ", tenho " + age + " anos e estudo " + course;
    }
}
