#include <stdio.h>
#include <stdlib.h>
 /*// operador long para double
 // double->%1f
 // long double-> %lf
 /*
int main()
{   float x = 3.1414;
    long double y = 3.141452440298192422;

    __mingw_printf("valor de y :%.15Lf\n", y);
    printf("\n um LONG double precisa de %d bytes em memoria.", sizeof (y));
    // 8*8=64 bits
    return 0;

    //o windows nao suporta um digito com 64 bits entao
    // colocando L maiusculo e usando a funçao __mingw_printf
}
*/


/*caracteres de escape
quebra de linha \n, tabulação \t, aspa dubla \", aspas simples\', contra barra \\
*/
int main()
{
    printf("\n\n\tImpresso:\n\n");
    // para deixar algo com aspas dupla e nao dar erro
    printf("impresso \"a\" para a tela"); // aspas simples serve tb
   printf("impresso \"a\" \\ para a tela");



}


