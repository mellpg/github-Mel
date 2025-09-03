#include <stdio.h>
#include <stdlib.h>

int main()
{   int idade;
    float altura;
    char letra;
    printf("idade,altura,letra:\n");
    scanf("%d%f %c", &idade, &altura, &letra);
    printf("\nIdade: %d\nAltura: %.2f\nLetra: %c", idade , altura , letra);
    return 0;
}
