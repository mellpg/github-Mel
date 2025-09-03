#include <stdio.h>
#include <stdlib.h>
 // problema buffer
int main()
{   int idade;
    float peso;
    char letra1, letra2;

    printf("digite duas letras:\n");
    scanf("%c %c", &letra1,&letra2);
    printf(" digite sua idade e peso:");
    scanf("%d%f", &idade, &peso);


    // buffer do teclado-> espaço para o computador desconsiderar o enteder, tab e espaço
    printf("\nPrimeira: %c\nSegunda: %c \nIdade: %d\nPeso: %.1f", letra1, letra2, idade, peso);
    return 0;
}
