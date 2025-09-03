#include <stdio.h>
#include <stdlib.h>
 // operadores relacionais
 // maior que(a>b)/menorque(a<b)/maiorigual(a>=b)/menorigual(a<=b0/diferente(a!=b)/igual(a==b)
int main()
{
    int a=10;
    printf("digite um valor\n");
    scanf("%d", &a);
    printf("\nResultado: %d", (a,0)); //vai dar 0=falso ou 1= verdadeiro
    if(a<0)
    printf("\n\tValor negativo!");
    else{
    printf("\nValor positivo ou igual a zero!");
     printf("\n**Valor positivo ou igual a zero!");
    }
    printf("\nContinuaçao do programa...");
    return 0;
}
