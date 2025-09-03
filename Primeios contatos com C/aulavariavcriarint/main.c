#include <stdio.h>
#include <stdlib.h>

/* CRIANDO VARIAVEIS , INTEIRO, SCANF, LENDO


*/



int main (){


    int valor, valor2;

   //não pode começar com números, acabei de guardar um valor do tipo inteiro



    valor =50;

    // atribui o 50 a variavel

    //vamos agora apresentar essa informação

    printf("\n\ndigite um valor inteiro:");
     scanf(" %d", &valor);



    printf("\n\digite outro valor inteiro:\n\n");
    scanf( "%d", &valor2);




    // como se fosse o leia, antes da virgula, o tipo, a mascara, e depois da virgula, a variavel com antes o &




    // o 50 vai sumir porque pedimos pra ler um valor

    // o %d indica que um numero inteiro deve ser inserido pelo printf

    printf("\n\no valor da minha primeira variavel: %d\n ja o segundo: %d\n\n", valor, valor2);





    return 0;

}
