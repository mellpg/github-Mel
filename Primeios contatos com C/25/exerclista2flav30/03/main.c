#include <stdio.h>
#include <stdlib.h>
#include<locale.h>
//1) Faça um programa em C para ler dois valores e mostrar “EM ORDEM” caso o primeiro seja
//menor que o segundo e “FORA DE ORDEM” no caso contrário.
/*
int main()
{   int a,b;
    printf("digite um valor:\n");
    scanf("%d%d", &a,&b);
    if(a>b){
     printf("Correto!");
     printf("Maior: %d  Menor: %d", a,b);
    }
    if(b>a){
     printf("Correto!\n");
      printf("Maior: %d  Menor: %d",b,a);
    }
    else
     printf("fora de ordem!");

    return 0;
}
*/
//2) Faça um programa em C para ler o peso e a idade do usuário e mostrar qual o risco de
//apresentar um problema cardíaco:
//• peso maior que 110 kg e idade acima de 38 anos: ALTO RISCO
//• peso menor que 110kg e idade acima de 38 anos: MÉDIO RISCO
//• peso maior que 110kg e idade abaixo ou igual a 38 anos: BAIXO RISCO
/*
int main(){
    setlocale(LC_ALL,"portuguese");
    int idade;
    float peso;
    printf("\nDigite a idade e peso em KG:");
    scanf("%d %f", &idade,&peso);
    if(peso > 110 && idade > 38){
    printf("Peso: %.2f\nIdade: %d");
    printf("\nALTO RISCO\n");
    }
    if(peso<110 && idade>38){
    printf("MÉDIO RISCO\n");
    }
    if(peso>110 && idade<=38){
    printf("BAIXO RISCO\n");
    }
    return 0;

 }
*/
