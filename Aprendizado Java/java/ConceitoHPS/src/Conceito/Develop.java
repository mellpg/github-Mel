package Conceito;

// Records não trabalha com herança de classes abstratas
// Records não pode ter propriedades dentro dele
// a menos que sejam static
// Só que o que é static não vai entrar na cadeia de herança

public record Develop(double extra) {

}

/*
🔹 1. O que é um record em Java?

Um record é uma classe especial e imutável, criada para representar dados (tipo DTO, VO).
Ele automaticamente gera:

- Construtor
- Getters (component accessor)
- equals(), hashCode()
- toString()

Exemplo básico:

public record Pessoa(String nome, int idade) {}

Você pode instanciar:

Pessoa p = new Pessoa("Mel", 18);
System.out.println(p.nome());  // Mel
System.out.println(p.idade()); // 18
*/


/*
🔹 2. Limitações dos record

- Não pode estender classes (nem abstratas nem concretas).
- Todo record implicitamente estende java.lang.Record.

Então não pode fazer:

public record Gerente(String nome, double salario) extends Employee {} // ❌

✅ Pode implementar interfaces:

public interface Identificavel {
    String getCode();
}

public record Salesman(String nome, double salario) implements Identificavel {
    @Override
    public String getCode() {
        return "sl-" + nome.toLowerCase();
    }
}

❌ Não pode declarar instância mutável de campos.
Todos os campos definidos no cabeçalho do record são final.

Exemplo inválido:

public record Carro(String modelo, int ano) {
    private String dono; // ❌ Não permitido
}

Só pode ter atributos static adicionais.
Porque static não pertence a instâncias, e sim à classe.

Exemplo válido:

public record Produto(String nome, double preco) {
    static double TAXA = 0.15; // permitido
}
*/


/*
🔹 3. O que poderia ser static dentro de um record?

👉 Coisas comuns a todas as instâncias, não relacionadas a herança:

✅ Constantes:
public record Moeda(String nome, String simbolo) {
    static final String PAIS = "Brasil";
}

✅ Métodos utilitários:
public record Funcionario(String nome, double salario) {
    static Funcionario novoEstagiario(String nome) {
        return new Funcionario(nome, 1200.0);
    }
}

✅ Campos de configuração compartilhados:
public record Config(String chave, String valor) {
    static String VERSAO = "1.0";
}
*/


/*
🔹 4. O que não poderia dentro de um record

- Campos normais fora do cabeçalho (imutabilidade quebrada).
- Herança de classes (apenas interfaces).
- Sobrescrever atributos herdados de Record (não permitido).

👉 Resumindo:
- Pode usar static para constantes ou helpers.
- Não pode usar record para fazer herança de classes abstratas — só interfaces.
- record serve mais para dados imutáveis (tipo uma “struct”), 
  não para modelar hierarquia com comportamento, como em Employee, Manager e Salesman.
*/


// 🚩 Problema

// Hoje você tem:

// public sealed abstract class Employee permits Manager, Salesman { ... }

// public non-sealed class Manager extends Employee { ... }

// public non-sealed class Salesman extends Employee { ... }


// Isso funciona porque herança de classe abstrata permite reuso de atributos (name, code, etc).
// 👉 Mas record não pode fazer extends Employee.

// ✅ Solução: usar interface

// Interfaces não têm estado (atributos), mas têm contratos de comportamento.
//E record pode implementar interface(s).
// O que ganhamos com isso?

// Imutabilidade automática: não precisa de setters.

// Herança de comportamento via interface: qualquer Employee pode ser um Manager ou Salesman.

// Polimorfismo funciona igual:

// EXEMPLO DE INTERFACE EM UM CÓDIGO SÓ 
//Interface comum
// interface Person {
//  String name();
//  int age();

//  default String greet() {
//      return "Olá, meu nome é " + name() + " e tenho " + age() + " anos.";
//  }
// }

  //Record Employee
// record Employee(String name, int age, double salary) implements Person {
//  @Override
 // public String greet() {
 //     return "Sou o funcionário " + name() + ", tenho " + age() + " anos e ganho R$" + salary;
//  }
// }

//Record Student
// record Student(String name, int age, String course) implements Person {
 // @Override
//  public String greet() {
//     return "Sou o estudante " + name() + ", tenho " + age() + " anos e estudo " + course;
//  }
// }

// Classe principal (main)
// public class Main {
//  public static void main(String[] args) {
//     Person p1 = new Employee("João", 30, 5000.0);
//     Person p2 = new Student("Maria", 20, "Computação");

 //    System.out.println(p1.greet());
 //    System.out.println(p2.greet());
// }
//}
