package Conceito;


public interface Person {
    String name();
    int age();

    default String greet() {
        return "Olá, meu nome é " + name() + " e tenho " + age() + " anos.";
    }
}
