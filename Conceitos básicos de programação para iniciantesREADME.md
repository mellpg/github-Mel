# CONCEITOS BÁSICOS DE PROGRAMÇÃO
## Um guia para iniciantes, vamos lá!
# 1. Variável


## Espaço na memória do computador usado para guardar valores (números, textos, etc).

## Tem um nome e um tipo (dependendo da linguagem).
### 👉 Exemplo: int idade = 18; (a variável idade guarda o número 18).


# 2. Constante

## Igual a variável, mas não pode mudar o valor depois de definido.
### 👉 Exemplo: final double PI = 3.14;



# 3. Tipo de Dados

## Define o tipo de valor que a variável pode guardar.
## Principais:

## int → números inteiros (10, -5)

## double/float → números decimais (3.14, -0.5)

## char → um único caractere ('a', '9')

## String → texto ("Olá mundo")

## boolean → verdadeiro ou falso (true/false)



# 4. Operadores

## São usados para fazer operações com valores:

## Aritméticos: +, -, *, /, %

## Relacionais (comparações): ==, !=, <, >, <=, >=

## Lógicos: && (E), || (OU), ! (NÃO)



# 5. Entrada e Saída

## Entrada: dados que o usuário fornece (ex: digitar no teclado).

## Saída: informações que o programa mostra (ex: imprimir na tela).
### 👉 Exemplo: System.out.println("Oi"); (Java)



# 6. Estruturas de Decisão (Condicionais)

## Permitem que o programa tome decisões.
### 👉 Exemplo:

 if (idade >= 18) {
   System.out.println("Maior de idade");
} else {
   System.out.println("Menor de idade");
}



# 7. Estruturas de Repetição (Laços)

## Usadas para repetir ações.

for → repete um número definido de vezes

while → repete enquanto a condição for verdadeira
### 👉 Exemplo:


for (int i = 0; i < 5; i++) {
   System.out.println(i);
}



# 8. Função/Método

## Bloco de código que realiza uma tarefa e pode ser chamado várias vezes.
### 👉 Exemplo:

int soma(int a, int b) {
   return a + b;
}



# 9. Array (Vetor)

## Estrutura que guarda vários valores do mesmo tipo em sequência.
### 👉 Exemplo:

int[] numeros = {10, 20, 30};
System.out.println(numeros[1]); // mostra 20



# 10. Comentários

## Texto no código que não é executado, serve para explicar.
### 👉 // comentário em uma linha
