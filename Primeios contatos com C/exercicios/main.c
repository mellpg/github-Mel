#include<stdio.h>
#include <locale.h>
 int main(){

   int dia;
   setlocale(LC_ALL,"portuguese");
   printf("\n\tDigite um n�mero para come�armos:");
   scanf("%d", &dia);
   switch(dia){
       case 1:
         printf("Domingo");
         break;
       case 2:
         printf("Segunda");
         break;
       case 3:
         printf("Ter�a feira");
         break;
       case 4:
         printf("Quarta feira");
         break;
       case 5:
         printf("Quinta feira");
         break;
       default:
         printf("Inv�lido!");

   }
   return 0;
}
