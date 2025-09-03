#include <stdio.h>
#include <stdlib.h>
// Como descobrir o tamanho em memória de cada tipo de dado?   // sizeof e uma constante, nao uma funçao
// sizeof x sizeof(int)
/*
int main()
{   float x = 1.0;
    float y = 78;
       printf("tamanho de ym float: %d bytes\n", sizeof(y));
       printf("tamanho de um float: %d bytes\n", sizeof(x));  // sempre vai retornar um valor int, por isso usar %d
       printf("tamanho de um int: %d bytes\n", sizeof(int));
    // 4 * 8 = 32 bits , afinal 1 byte = 8 bits
    return 0;
}
*/
int main()
{

   int y=0;
   short  int x=45678;
   printf("tamanho de um int: %d bytes\n", sizeof (y));
   printf("tamanho de um short int:%d bytes\n", sizeof (x));
   return 0;

}



