#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{  int segundos,min,seg,h,resto;
    printf("digite os segundos:\n");
    scanf("%d", &segundos);
    h= segundos/3600;
    resto=segundos%3600;
    min=resto/60;
    seg=resto%60;
    printf("\nRetornado: %02d: %02d: %02d",h,min,seg);
    return 0;
}
