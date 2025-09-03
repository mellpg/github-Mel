#include <stdio.h>
#include <stdlib.h>
 //lendo caracteres com função getchar
int main()
{   char letra;
    printf("digite uma letra:\n");
    letra = getchar();
    printf("\n\nCaractere lido: %c\n", letra);
    return 0;
}
