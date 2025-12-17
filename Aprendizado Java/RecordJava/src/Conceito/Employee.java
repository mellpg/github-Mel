package Conceito;

public record Employee(String name, int age, double salary) implements Person {
    @Override
    public String greet() {
        return "Sou o funcionário " + name + ", tenho " + age + " anos e ganho R$" + salary;
    }
}
