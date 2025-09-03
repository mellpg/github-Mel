#include <stdio.h>
#include <stdlib.h>
 /*// claudio 3
int main()
{   float n1=1, n2=2, n3=3, formula;
    formula=(n1+n2+n3)*2/2;
    printf("\nValor retornado: %.1f", formula);
    return 0;
}
*/
int main()
// sucessor e antecessor exercicio
{  int x,n1,n2;
   printf("\nDigite um numero:");
   scanf("%d", &x);
   n1= x+1;
   n2=x-1;
   printf("\nSeu sucessor: %d",n1);
   printf("\nSeu antecessor: %d",n2);
   return 0;

}
