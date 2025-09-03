#include <stdio.h>
#include <stdlib.h>
 // criando variaveis e lendo caracteres com scanf
int main()

{
    char sexo = 's'; //dando nome a ela
    printf("\nO valor da variavel: %c\n\n", sexo);
    printf("\n\nDigite seu sexo:(f,m,F,M):");
    scanf("%c", &sexo);
    printf("\n\nSeu genero e: %c\n\n", sexo);
    return 0;
}
