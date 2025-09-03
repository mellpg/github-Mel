#include <stdio.h>
#include <stdlib.h>

int main()
{     char sexo;
      int idade;
      float peso;
      float altura;
    printf("\nDigite sexo (F,M,f,m), idade, peso, altura\n");
    scanf("%c%d%f%f", &sexo, &idade, &peso, &altura);
    printf("sexo: %c\nIdade: %d\nPeso: %.1f\nAltura: %.2f", sexo, idade, peso, altura);


    return 0;
}
