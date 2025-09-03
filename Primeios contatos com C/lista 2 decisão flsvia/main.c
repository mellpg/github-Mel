#include <stdio.h>
#include <stdlib.h>
//1) Faça um programa em C para ler dois valores e mostrar “EM ORDEM” caso o primeiro seja
//menor que o segundo e “FORA DE ORDEM” no caso contrário.

int main()
{   int a,b;
    printf("digite um valor:\n");
    scanf("%d%d", &a,&b);
    if(a>b){
     printf("Correto!");
     printf("Maior: %d  Menor: %d", a,b);
    }
    if(b>a){
     printf("Correto!\n");
      printf("Maior: %d  Menor: %d",b,a);
    }
    else
     printf("fora de ordem!");

    return 0;
}
