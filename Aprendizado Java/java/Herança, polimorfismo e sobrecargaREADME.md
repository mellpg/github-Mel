📚 Resumo de Conceitos de Programação Orientada a Objetos

Este repositório contém um resumo simples sobre três conceitos importantes da Programação Orientada a Objetos (POO): Herança, Polimorfismo e Sobrecarga de Método.

1️⃣ Herança

A herança permite que uma classe (filha) herde características e comportamentos de outra classe (pai).

Evita repetição de código.

Permite criar hierarquias entre classes.

Exemplo em Java:

class Animal {
    void comer() {
        System.out.println("Comendo...");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Au Au!");
    }
}


Aqui, Cachorro herda o método comer() da classe Animal.

2️⃣ Polimorfismo

O polimorfismo permite que um mesmo método se comporte de formas diferentes dependendo do objeto que o utiliza.

Pode ser sobrescrita de métodos (override).

Facilita a flexibilidade e a manutenção do código.

Exemplo:

class Animal {
    void emitirSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Miau!");
    }
}


Aqui, o método emitirSom() tem comportamento diferente para Cachorro e Gato.

3️⃣ Sobrecarga de Método

A sobrecarga de método ocorre quando uma mesma função tem o mesmo nome, mas parâmetros diferentes.

Permite usar a mesma ação de formas diferentes.

Exemplo:

class Calculadora {
    int soma(int a, int b) {
        return a + b;
    }

    double soma(double a, double b) {
        return a + b;
    }
}


O método soma() funciona tanto para inteiros quanto para decimais, dependendo dos parâmetros.

✅ Resumo rápido
Conceito	O que faz
Herança	Classe filha herda métodos e atributos da classe pai
Polimorfismo	Método pode ter comportamentos diferentes dependendo do objeto
Sobrecarga	Mesma função, diferentes parâmetros
