#include <stdio.h>
#include <stdlib.h>
//Fazer um programa que pergunte ao usu�rio quantos alunos tem na sala dele. O n�mero digitado n�o pode ser zero e nem negativo. Caso seja, mensagem de erro e retorna para nova digita��o.
//Em seguida, atrav�s de um �while�, pede ao usu�rio para que entre com as notas de todos os alunos da sala, um por vez.
//Por fim, o programa deve mostrar a m�dia, aritm�tica, da turma.
/*
int main()
{   int alunos,cont=1;
    float nota,soma=0; //tem que falar da onde a soma vai come�ar
    printf("Digite a quantidade de alunos:\n");
    scanf("%d", &alunos);
    while(cont<=alunos)  //ate a quantidade de alunos acabar,vai executar
    {
      printf("\n\tNota do aluno:", nota);
      scanf("%f",&nota); //digitar as notas
      soma = soma+nota; //soma das notas
      cont++;
    }
      printf("\n\tM�dia da turma: %.2f", soma/alunos); // formula da MEDIA: (1+2+3+4/4)
    return 0;
}
*/
//Fazer um programa que solicite 10 n�meros ao usu�rio, atrav�s de um �while�, e ao final�mostre os dois maiores n�meros digitados pelo usu�rio.
int main()
{  int num,cont = 3,maior,segundo_maior;  // cont
   printf("\nDigite o numero 1:");
   scanf("%d",&maior);
   printf("\nDigite o numero 2:");
   scanf("%d",&num);
   if(maior > num)
      segundo_maior = num;
   else
   {
      segundo_maior = num;  // quando o numero que o uxuario pediu nao for menor que o maior
      maior = num;
   }
   while( cont<=10)
   {  printf("\nDigite um numero:");
      scanf("%d", &num);
   if(num>maior)
   {
      segundo_maior = maior;
      maior = num;
   }
   else
   {
     if(num>segundo_maior)
     segundo_maior = num;
   }
   cont++;

 }
    printf("\n\tSegundo maior: %d", segundo_maior);
    printf("\n\tMaior: %d", maior);
 return 0;

}
