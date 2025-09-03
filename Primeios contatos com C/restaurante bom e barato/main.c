#include <stdio.h>
#include <stdlib.h>
   //) O restaurante "Bom e Barato" cobra R$20,00 por quilo de comida, porém sua
    //balança só marca a pesagem em gramas. Faça um algoritmo para ler o valor pesado de
 /*      //um cliente e informar o preço a pagar pelo prato
int main()
{   float k,g,valor;
    printf("Digite a quantidade de kilos:\n");
    scanf("%f", &k);
    g = k*1000;
    valor = k*20;

    printf("\nValor a pagar: %.2f  $", valor);
    return 0;
}
*/

//Faça um algoritmo para calcular a área marcada da figura abaixo. O valor de
//“a”deverá ser fornecido pelo usuário.
int main()
{  float a,areaquadrado,pi,cinscrito;
  printf("digite um valor para o a:");
  scanf("%f", &a);

  areaquadrado = (a-2)*(a-2);
  pi = 3.14;

 cinscrito = pi*(a-2)/2 * (a-2)/2;

  printf("\nArea do quadrado : %.2f\nArea do circulo inscrito: %.2f", areaquadrado, cinscrito);

  return 0;

}
