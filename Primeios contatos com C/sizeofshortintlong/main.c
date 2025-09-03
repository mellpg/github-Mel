#include <stdio.h>
#include <stdlib.h>
/*
int main()
{
  int y=0;
   short  int x=45678;
   printf("tamanho de um int: %d bytes\n", sizeof (y));
   printf("tamanho de um short int:%d bytes\n", sizeof (x));
   return 0;

//Reduzindo o consumo de memória com o operador short
] */

//Somei 2 números inteiros positivos e o resultado ficou negativo  // tamanho de um int na memoria  -2147483648 - 2147483647
/*int main()
{  int x= 2147483647;
   printf("\nValor de x: %d", x);
   x++;
    printf("\nValor de x: %d", x);

   return 0;{
*/
/*
int main()
{
  int y=0;
   short  int x=45678;
   printf("tamanho de um int: %d bytes\n", sizeof (y));
   printf("tamanho de um short int:%d bytes\n", sizeof (x));
   return 0;

//Reduzindo o consumo de memória com o operador short
] */

//Somei 2 números inteiros positivos e o resultado ficou negativo  // tamanho de um int na memoria  -2147483648 - 2147483647
/*int main()
{  int x= 2147483647;
   printf("\nValor de x: %d", x);
   x++;
    printf("\nValor de x: %d", x);

   return 0;{
*/
int main()
// operador long(Como aumentar o espaço de memória para um int com o operador long)
{ long long int x= 2147483647;
   printf("\nTamanho de x em bytes: %d", sizeof x);
   printf("\nValor de x: %lld", x); // tem que imprimir com %ld ou %li    // vai dar erro pq como e long long, tem q botar dois L ali nos %
   x++;
    printf("\nValor de x: %lli", x);
   return 0;
   //4*8= 32bitsy;
return 0;
}
