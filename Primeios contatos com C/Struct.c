#include <stdio.h>
#include <string.h>

// Struct 

// Serve para agrupar uma seleção de dados em uma estrutura

// Uso:
// Quando usar:
// Representação de objetos

// Na programação
// TODO SISTEMA usa algo parecido (banco de dados, APIs, programas grandes)

struct Pessoa {
    char nome[50];
    int idade;
    float salario;
};

int main(){
    struct Pessoa p;
    strcpy(p.nome, "Maria"); // recebe string de destino(armazenamento) e origem(conteúdo)
    p.idade = 25;
    p.salario = 3500.00;

    printf("Nome: %s\n", p.nome);
    printf("Idade: %d\n", p.idade);
    printf("Salário: %.2f\n", p.salario);

    return 0;
}
