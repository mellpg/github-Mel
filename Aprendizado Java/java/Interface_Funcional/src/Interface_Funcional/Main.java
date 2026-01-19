package Interface_Funcional;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Maria", 20),
            new User("Pedro", 47),
            new User("Leandra", 23),
            new User("Mel", 19),
            new User("Jeff", 30),
            new User("Daniel", 14),
            new User("Michael", 15)
        );
        // Simplificada, usando lambda 
        // ✅ Forma 1 — Classe anônima (precisa implementar accept)
        users.forEach( user -> {
            System.out.println(user); 
        });
    }
}

// Uma interface funcional é uma interface que tem exatamente um único método abstrato.
// Ela serve como contrato para representar uma ação, função ou comportamento — e pode ser usada com expressões lambda ou métodos de referência.
// Aplicações:
// Streams API

// Pra processar coleções de forma declarativa e elegante:

// Callbacks e ações personalizadas

// Exemplo:

// Consumer<String> printer = msg -> System.out.println("Mensagem: " + msg);
// printer.accept("Oi, Mel!");


// Você cria comportamentos e os passa como parâmetros — algo que antes era impossível sem classes anônimas grandes.

// Funções matemáticas, transformações e mapeamentos
// Function<Integer, Integer> square = n -> n * n;
// System.out.println(square.apply(5)); // 25


// Outras interfaces parecidas:

// Function<T, R> — recebe um valor e retorna outro

// Predicate<T> — recebe um valor e retorna boolean

// Consumer<T> — recebe um valor e não retorna nada

// Supplier<T> — não recebe nada e retorna um valor

// Por que isso é importante?

// Torna o código mais curto, mais expressivo e moderno

// Facilita paralelismo e processamento em streams

// Deixa o Java mais parecido com linguagens funcionais (como Kotlin e JavaScript)

// É a base do Java moderno — APIs como Stream, Optional, CompletableFuture e até frameworks como Spring usam isso o tempo todo.
	

