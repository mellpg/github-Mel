#include <stdio.h>
#include <stdlib.h>

int main()
{  int h,segundos,m,s,resto;
   printf("\nDigite uma quantidade de segundos:");
   scanf("%d", &segundos);
   h=segundos/3600;
   resto=segundos%3600;
   m=resto/60;
   s=resto%60;
   printf("\n %02d:%02d:%02d",h,m,s);
   return 0;

}
