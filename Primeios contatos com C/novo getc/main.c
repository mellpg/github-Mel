#include <stdio.h>
#include <stdlib.h>
 // lendo caracteres com fun�ao getc
int main()
{  char letra;
    printf("digite uma letra:\n");
    letra = getc(stdin); // essa fun�ao pode tbm ser usada pra ser lida de outras fontes, tem que passar um parametro a ela, no caso queremos usar a entrada padrao, o teclado
    printf("\n\no caractere lido : %c", letra);
    return 0;
}
