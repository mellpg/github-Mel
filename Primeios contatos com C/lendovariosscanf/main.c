#include <stdio.h>
#include <stdlib.h>
   // lendo varias variaveis com scanf
int main()
{
    int n1, n2, n3;
    printf("digite 3 numeros inteiros:\n");
    scanf("%d%d%d", &n1, &n2, &n3);
    printf("retornados: %d, %d, %d", n1, n2, n3);
    return 0;
}
