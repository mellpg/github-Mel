#include <stdio.h>
#include <stdlib.h>
//Fazer um programa que pergunta um número ao usuário, e mostra sua tabuada completa (de 1 até 10). O número digitado não pode ser zero. Caso seja, mensagem de erro e retorna para nova digitação.

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
