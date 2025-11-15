#include <stdio.h>

// Ponteiros
// Guardam um endereço de memória

/*
 Serve para:
- acessar diretamente variáveis em outros locais
- permitir passagem por referência
- manipular arrays, textos e memória dinâmica

No mercado real:
- comunicação com hardware
- sistemas embarcados
- trabalhar com buffers de rede
*/

int main(){
    int x = 20;
    int *ponteiro = &x; // ponteiro recebe o ENDEREÇO de x

    printf("Valor de x: %d",x);
    printf("Endereço de x: %p\n", (void*)&x);
    printf("Conteúdo apontado por p: %d\n",*ponteiro);

    // Alterando x via ponteiro
    *ponteiro = 50;
    printf("Novo valor de x: %d",x);

    return 0;
}