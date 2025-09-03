#include <stdio.h>
#include <stdlib.h>
 //criar variav e funcao fgetc
int main()
{   char letra;
    printf("digite um caractere:\n");
       letra = fgetc(stdin);         // esse f vem de FILE(ARQUIVO), pode serusada para leitura do teclado
       printf("\n\nretornado: %c", letra);
    return 0;
}
