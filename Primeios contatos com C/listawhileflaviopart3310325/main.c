#include <stdio.h>
#include <stdlib.h>
//Fazer um programa que pergunta um n�mero ao usu�rio, e mostra sua tabuada completa (de 1 at� 10). O n�mero digitado n�o pode ser zero. Caso seja, mensagem de erro e retorna para nova digita��o.

int main()
{   int num,cont=1;
    printf("Digite um numero:\t\n");
    scanf("%d",&num);
    while(cont<=10)
     { printf("\n\t%d * %d = %d",num,cont,cont*num);

       cont++;
     }

 return 0;
}
// tem que colocar cont*num pra multiplicar o numero
// que voce digitou pelos numeros de 1 a 10, igual a tabuada
