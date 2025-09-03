#include <stdio.h>
#include <stdlib.h>
//operadores relacionais
// maior que:(a>b)/ menor que:(a<b)/ maior ou igual:(a>=b)/ menor ou igual:(a<=b)/ igual:(a==b)/diferente:(a!=b)
/*
int main()
{   int a =10, b = 20;
    printf("\n\tResultado: %d\n", a == b);   // vai dar 0 ou 1 , 0 =  falso, 1 = verdadeiro, e como se estivessemos perguntando se f ou v
    return 0;
}
*/
    // Estrutura de decisao simples
// verificando se um numero e negativo
//ex: Brasilia e capital do brasil? sim=1/nao=0
int main(){
 int a=10;
 printf("\n\tDigite um valor:");
 scanf("%d", &a);
 printf("\n\tResultado logico: %d",(a<0)); // tem que ser menor que 0 para dar 1 para ser negativo e verdadeiro


/*
se (a>0) --> if
printf("verdadeiro")
senao    --> else
printf("falso")
*/
/*
 if((a<0)){
     printf("\n\tNegativo\n");
 }
 else{
    printf("\n\tO valor e positivo ou igual a zero");
      printf("\n\tContinuaçao do programa...\n");
}
 return 0;
}
*/
//  Endentação e uso das chaves na linguagem C
int main()
{
 int a=10;
 printf("\n\tDigite um valor:");
 scanf("%d", &a);
 printf("\n\tResultado logico: %d",(a<0)); // tem que ser menor que 0 para dar 1 para ser negativo e verdadeiro


 if((a<0))
     printf("\n\tNegativo\n");

 else{  //abre quando tiver mais de uma linha
    printf("\n\tO valor e positivo ou igual a zero");
    printf("\n\tO valor e positivo ou igual a zero");
 }
      //fecha quando acabar as instruçoes do mesmo
    printf("\n\tContinuaçao do programa..");
 return 0;
 }
