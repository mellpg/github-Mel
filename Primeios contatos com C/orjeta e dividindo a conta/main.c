#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
//Calculando gorjeta e dividindo conta de restaurante
int main(){

   float despesa,gorjeta,despesa_final,numpessoas;
    printf("\n\tdigite o valor da despesa , gorjeta e a quantidade de pessoas:\n");
    scanf("%f%f%f", &despesa,&gorjeta,&numpessoas);
    despesa_final = (despesa+gorjeta)/numpessoas;
    printf("\n\tValor da despesa: %.2f  $\tGorjeta: %.2f  $\tDespesa final: %.2f  $",despesa,gorjeta,despesa_final);

    return 0;
}
