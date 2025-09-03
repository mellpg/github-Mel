#include <stdio.h>
#include <stdlib.h>
//3) Escreva um programa que leia o código de origem de um produto e imprima na tela a
//região de sua procedência conforme a tabela abaixo:
//• código 1 : Sul
//• código 2 : Sudeste
//• código 3 : Centro-Oeste
//• código 4 : Nordeste
//• código 5: Norte
//• Observação: Caso o código não seja nenhum dos especificados o produto deve ser
//encarado como Importado.

#include <stdio.h>                                                                    Sul (PR, SC, RS) → CEPs de 80 a 99
#include<locale.h>
#include <stdlib.h>
//Sul (PR, SC, RS) → CEPs de 80 a 99
//Sudeste (SP, RJ, MG, ES) → CEPs de 01 a 39

//Centro-Oeste (DF, GO, MS, MT) → CEPs de 70 a 79

//Nordeste (BA, SE, AL, PB, PE, RN, CE, PI, MA) → CEPs de 40 a 69

//Norte (AC, AM, AP, PA, RO, RR, TO) → CEPs de 68 a 69
/*
int main() {
    setlocale(LC_ALL,"portuguese");
    int cep;

    // Solicita o CEP ao usuário
    printf("Digite os dois primeiros dígitos do CEP: ");
    scanf("%d", &cep);

    // Verifica a região com base nos dois primeiros dígitos do CEP
    if (cep >= 90 && cep <= 99) {
        printf("Região: Sul\n");
    }
    else if (cep >= 00 && cep <= 39) {
        printf("Região: Sudeste\n");
    }
    else if (cep >= 70 && cep <= 79) {
        printf("Região: Centro-Oeste\n");
    }
    else if (cep >= 40 && cep <= 69) {
        printf("Região: Nordeste\n");
    }
    else if (cep >= 68 && cep <= 69) {
        printf("Região: Norte\n");
    }
    else {
        printf("Região: Importado\n");
    }

    return 0;
}
*/
//4) Maçãs custam R$ 0,30 se forem compradas menos que uma dúzia e R$0,25 se forem
//compradas uma dúzia ou mais. Escreva um programa em pseudocódigo que leia o número
//de maçãs compradas, calcule e escreva na tela o valor total da compra.

int main(){
  float valor;
  int num;
  printf("\nDigite a quantidade:");
  scanf("%d", &num);
  if(num<12){
  valor = num*0.30;
  }
  if(num>=12){
  valor = num*0.25;

  }
  printf("\nValor final: %.2f", valor);
 return 0;
}
