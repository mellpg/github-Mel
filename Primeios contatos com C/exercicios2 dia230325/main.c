#include <stdio.h>
#include <stdlib.h>
/*
int main()
//) Escreva um algoritmo para ler a idade de uma pessoa e exibir quantos dias de vida
//ela possui. Considere sempre anos "cheios" e que um ano possui 365 dias.
{  int idade, vida;
printf("\n\tDigite uma idade:");
scanf("%d", &idade);
vida = idade*365;
printf("\n\tEssa pessoa viveu: %d dias de vida!", vida);
return 0;
}
*/

int main()
//Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um
//algoritmo para ler o valor do pagamento e o preço do litro da gasolina, e exibir quantos
//litros ele conseguiu colocar no tanque.
{  float pag,plitro;
  printf("\nDigite o valor em reais de gasolina que o motorista escolheu:");
  scanf("%f",&pag);
  printf("\n %.2f",pag);
  plitro = pag/6.14;  //quantidade que quiser dividido pelo valor do litro em geral
  printf("\nValor em litros colocados no tanque: %.1f", plitro);
  return 0;

}
