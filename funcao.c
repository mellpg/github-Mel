#include <stdio.h>

// Funções

// 1) Recebe uma cópia do valor da variável
// ou seja, seu valor original não muda
// usada para evitar repetições de código

// Muito usada para 
// -> Apenas ler o valor, realizar cálculos, verificações

void dobrar(int n) {
    n = n*2;
    printf("Variável dentro da função: %d\n", n);
    
}

int main() {
    int x = 10;

    printf("Antes de aplicar a função: %d\n",x);
    dobrar(x);
    printf("Depois de aplicar a função: %d\n",x);


   return 0;
}