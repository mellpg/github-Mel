
#include <stdio.h>
#include <locale.h>

int main()
{
    int num, num2;
    char operador;
    setlocale(LC_ALL,"portuguese");

    printf("\t--ESCOLHA SUAS OP��ES AQUI:");
    printf("\n\t--(AC)--()--%--/\n");
    printf("\n\t--7--8--9--X\n");
    printf("\n\t--4--5--6--(-)\n");
    printf("\n\t--1--2--3--(+)\n");
    printf("\n\t--0--,--(x)--=\n");
    printf("\n\tEscolha um n�mero:\n");
    scanf("%d", &num);
    printf("\n\tEscolha outro n�mero:\n");
    scanf("%d", &num2);
    printf("Digite a opera��o (+, -, *, /): ");
    scanf(" %c", &operador);

    switch (operador){
       case '+':
          printf("=%d", num+num2);
          break;
       case '-':
          printf("=%d", num-num2);
          break;
       case '*':
          printf("=%d", num*num2);
          break;
       case '/':
          printf("%d", num/num2);
       default:
          printf("Operador inv�lido!");
    }

    return 0;
}


