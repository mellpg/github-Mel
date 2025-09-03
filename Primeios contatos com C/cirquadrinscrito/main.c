#include <stdio.h>
#include <stdlib.h>

int main()
{  float a,areaquadrado,pi,cinscrito;
  printf("digite um valor para o a:");
  scanf("%f", &a);

  areaquadrado = (a-2)*(a-2);
  pi = 3.14;

 cinscrito = pi*(a-2/2)^2;

  printf("\nArea do quadrado : %.1f\nArea do circulo inscrito: %.1f", areaquadrado, cinscrito);

  return 0;

}
