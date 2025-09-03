#include <stdio.h>
#include <stdlib.h>
#include<ctype.h>
// Leia um número e diga se é divisível por 2, por 3 ou por 5 ou nenhum
/*
int main()
{   int num;
    printf("Digite um valor\n");
    scanf("%d",&num);
    if(num%2==0 || num%3==0 ||num%3==0 || num%4==0 ||num%5==0)
        printf("Divisivel!");
    else
        printf("divisivel por nenhum deles!");


    return 0;
}
*/
// Leia um caractere e diga se é vogal ou consoante.
/*
int main()
{  char caractere;
   printf("DIGITE UM CARACTERE:\n\t");
   scanf(" %c",&caractere);
   caractere = tolower(caractere);
   // a,e,i,o,u
   if(caractere == 'a'||caractere =='A'||caractere =='e'||caractere =='E'||caractere =='I'||caractere =='i'||caractere =='O'||caractere =='o'||caractere =='U'||caractere =='u')
    printf("VOGAL\n\t");
   else
    printf("CONSOANTE\n\t");


  return 0;


}
*/     // dinheiro,nota, essas coisas coloque float
int main()
{  char opcao;
   float nota1,nota2,nota3,peso1,peso2,peso3;
   printf("\n\tQual media voce deseja?\n\ta-Media aritmetica\n\tb-Media ponderada");
   scanf(" %c",&opcao);
   printf("Digite as notas:");
   scanf("%f%f%f",&nota1,&nota2,&nota3);
   if(opcao == 'a')
    printf("\n\tMedia aritmetica: %.2f",(nota1+nota2+nota3)/3);
   else
    if(opcao == 'b'){
    printf("Digite agora os pesos da media caso seja ponderada:");
    scanf("%f%f%f",&peso1,&peso2,&peso3);
    printf("\n\tMedia ponderada: %.2f",nota1 * peso1 +nota2 * peso2 + nota3 *peso3 /peso1 + peso2 +peso3);
   }
   else
    printf("Errado:");

 return 0;

}
