#include <stdio.h>
#include <stdlib.h>
// Elabore um algoritmo para entrar com o dia e o mês de uma data e informar quantos
 //dias se passaram desde o início do ano. Esqueça a questão dos anos bissextos e
 //considere 1 mês=30 dias.
int main()
{   int dia,mes,ano;
    printf("\nDigite um dia , mes e ano:");
    scanf("%02d%02d%02d",&dia,&mes,&ano);
    printf("\nResultado: %02d/%02d/%02d\n",dia,mes,ano);
    return 0;
}
