#include <stdio.h>

// A função recebe o endereço da variável, permitindo modificar o valor real.

// Bom uso:
// Quando é necessário a alteração do valor original
// Quando quer evitar cópia de dados grandes

// Na programação
// Sistemas que atualizam saldo, preço, idade, estoque
// Funções que precisam editar informações existentes
// Melhora desempenho (evita cópias grandes de memória)

// Função de parâmetro por referência

// A função recebe o ENDEREÇO da variável original ( &variavel ).
// Assim, ela consegue alterar o valor REAL.

void dobrar(int *n) { 
    //n guarda um endereço onde um inteiro tá guardado
    // n é um ponteiro para inteiro
    // a função quer alterar o valor original, não a cópia
    // por isso chamamos o ponteiro
    *n = (*n )* 2;
}

int main() {
    int x = 12;
    printf("Valor antes da função: %d", x);
    dobrar(&x);
    printf("Depois : %d", x);

    return 0;
}