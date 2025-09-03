#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    int hora,minuto,hora_convertida;
    setlocale(LC_ALL,"portuguese");
    printf("Digite a hora no formato de 24 horas (exemplo: 14 para 2 PM):\n");
    scanf("%d", &hora);
   printf("Digite os minutos (0 a 59):\n");
    scanf("%d", &minuto);
    switch(hora){
        case 0:
          printf("hora_convertida: 12:%02d   AM\n", minuto);
          break;
        case 1:
          printf("hora_convertida: 01:%02d   AM\n", minuto);
          break;
        case 2:
          printf("hora_convertida: 02:%02d   AM\n", minuto);
          break;
        case 3:
          printf("hora_convertida: 03:%02d   AM\n", minuto);
          break;
        case 4:
          printf("hora_convertida: 04:%02d   AM\n", minuto);
          break;
        case 5:
          printf("hora_convertida: 05:%02d   AM\n", minuto);
          break;
        case 6:
          printf("hora_convertida: 06:%02d   AM\n",  minuto);
          break;
        case 7:
          printf("hora_convertida: 07:%02d   AM\n", minuto);
          break;
        case 8:
          printf("hora_convertida: 08:%02d   AM\n", minuto);
          break;
        case 9:
         printf("hora_convertida:  09:%02d   AM\n", minuto);
         break;
        case 10:
         printf ("hora_convertida: 10:%02d   AM\n", minuto);
         break;
        case 11:
          printf("hora_convertida: 11:%02d   AM\n", minuto);
         break;
        case 12:
          printf("hora_convertida: 00:%02d   AM\n", minuto);
         break;
        case 13:
          printf("hora_convertida: 01:%02d   PM\n", minuto);
         break;
        case 14:
           printf("hora_convertida:02:%02d   PM\n", minuto);
         break;
        case 15:
           printf("hora_convertida:03:%02d   PM\n", minuto);
         break;
        case 16:
           printf("hora_convertida:04:%02d   PM\n", minuto);
        break;
        case 17:
           printf("hora_convertida:05:%02d   PM\n", minuto);
        break;
        case 18:
           printf("hora_convertida:06:%02d   PM\n", minuto);
        break;
        case 19:
           printf("hora_convertida:07:%02d   PM\n", minuto);
        break;
        case 20 :
           printf("hora_convertida:08:%02d   PM\n", minuto);
        break;
        case 21:
           printf("hora_convertida:09:%02d   PM\n", minuto);
        break;
        case 22:
           printf("hora_convertida:10:%02d   PM\n", minuto);
        break;
        case 23:
           printf("hora_convertida:11:%02d   PM\n", minuto);
        break;
        default:
           printf("inválido");

    }
    return 0;
}
