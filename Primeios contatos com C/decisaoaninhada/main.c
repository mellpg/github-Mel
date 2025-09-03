#include <stdio.h>
#include <stdlib.h>
/*
 //DECISAO ANINHADA
 // quando em uma condiçao tem outra possibilidade nela mesma!
int main()
{   int a = 10;
    printf("digite um valor qualquer:\n");
    scanf("%d",&a);
    printf("OPERADOR TERNARIO\n");
    a < 0 ? printf("\n\tNegativo\n:"): printf("\n\tPositivo ou = a zero:\n");
    printf("\nIF ELSE\n\n");
    if(a<0)
        printf("\tnegativo\n");
    else{
        printf("\n\tPositivo ou = a zero:\n"); // SE NAO E MAIOR OU MENOR A ZERO, ENTAO E 0
    if(a<0)
        printf("\n\tVALOR POSITIVO:");
    else
        printf("\nZERO:"); // NAO E MENOR NEM MAIOR, ENTAO E ZERO
    }
        printf("\n\tContinuacao do programa...\n");
    return 0;
}
*/
//USANDO A TABELA VERDADE(PROVA REAL)
/*
int main(){
   int a = 10;
    printf("digite um valor qualquer:\n");
    scanf("%d",&a);
    printf("OPERADOR TERNARIO\n");
    // colocando parenteses na operaçao logica
    !(a < 0) ? printf("\n\tNegativo\n:"): printf("\n\tPositivo ou = a zero:\n");
    printf("\nIF ELSE\n\n");
    if(!(a<0))
        printf("\tnegativo\n");
    else{
        printf("\n\tPositivo ou = a zero:\n"); // SE NAO E MAIOR OU MENOR A ZERO, ENTAO E 0
    if(a<0)
        printf("\n\tVALOR POSITIVO:");
    else
        printf("\nZERO:"); // NAO E MENOR NEM MAIOR, ENTAO E ZERO
    }
        printf("\n\tContinuacao do programa...\n");
    return 0;
}
*/
int main(){
    int idade;
    char sexo;
    printf("\nDigite seu sexo f-m e sua idade:");
    scanf("%c %d", &sexo,&idade);
    if(sexo =='m' && idade == 18)
        printf("ALISTAMENTO OBRIGATORIO:");
    else
        printf("DISPENSADO:");
 return 0;
}
