#include <stdio.h>
#include <stdlib.h>


//Reduzindo o consumo de memória com o operador short
 int main()
{

   int y=0;
   short  int x=45678;
   printf("tamanho de um int: %d bytes\n", sizeof (y));
   printf("tamanho de um short int:%d bytes\n", sizeof (x));
   return 0;

}


