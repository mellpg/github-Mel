#include <stdio.h>
#include <stdlib.h>
// Elabore um algoritmo para entrar com o dia e o m�s de uma data e informar quantos
//dias se passaram desde o in�cio do ano. Esque�a a quest�o dos anos bissextos e
//considere 1 m�s=30 dias.
int main()
{   int mes,dia,dias_passados;
    printf("\nDigite um valor para mes(1-12) e dias(1-30):\n");
    scanf("%d%d", &mes,&dia);

    if(mes>12) {               //obs:nao precisa ficar criando variavel pra cada situa�ao, o proprio if ja resolve isso
                               //quando algo passar, etc, sempre e questao de dividir, %, resto de algo
                               //(mes-1)*30+dia; mes que estamos, vezes 30 mais a quantidade dias
      mes=mes%12;
 }
    if(dia>30){

      dia = dia%30;
  }
    dias_passados = (mes-1)*30+dia;
    printf("\nDias passados: %d", dias_passados);
    return 0;
}
