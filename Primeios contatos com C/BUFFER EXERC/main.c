#include <stdio.h>
#include <stdlib.h>

int main()
{   int idade;
    float peso, altura;
    char sexo, letra;
    printf("insira sua idade,peso,altura,sexo(f,m,F,M),letra:\n");
    scanf("%d%f%f %c %c",&idade,&peso,&altura,&sexo,&letra);
    printf("\n\Idade: %d\nPeso: %.1f\nAltura: %.2f\nSexo: %c\nLetra: %c", idade,peso,altura,sexo,letra);
    return 0;
}
