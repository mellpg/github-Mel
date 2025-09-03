#include <stdio.h>
#include <stdlib.h>

   /*lendo numeros reais


   */


int main()
{
//obs: o float vai sempre exibir um numero com 6 casas apos o .
// para alterar isso: colocando antes do % . + a quantidade de casas que voce quer
// por ex: %.2f
    float numero = 6.0;
    printf("\n\n valor da minha variavel: %.1f\n\n", numero);

    printf("\n\n digite um numero:");
    scanf("%f", &numero);
    printf("\n\n\o valor e: %3.f\n\n", numero);   // coloque sempre 3





    return 0;
}
