#include<stdio.h>
/*
int main(){
  float despesa,gorjeta,numpessoas,valorppessoa,valorfinal;
  printf("\nDigite o valor da despesa, gorjeta e a quantidade de pessoas:");
  scanf("%f%f%f",&despesa,&gorjeta,&numpessoas);
  valorfinal=(despesa*gorjeta/100)+despesa; //representar em porcentagem
  valorppessoa=valorfinal/numpessoas;
  printf("\n\tValor que cada um vai pagar: %.2f $", valorppessoa);
  return 0;
}
*/
/*
int main() {  //encanador,horas trabalhadas
   float dias,valorfinal,desconto;
   printf("\n\tDigite a quantidade de dias trabalhados pelo encanador:");
   scanf("%f", &dias);
   valorfinal=45*dias; // nao precisa por 45.00
   desconto=valorfinal*8/100;  //lembre-se: toda vez que queremos tirar um percentual da coisa e: COISA*PERCENTUAL--> COISA - COISA*PERCENTUAL
   valorfinal=valorfinal-desconto;


   printf("\n\tO Encanador vai receber: $%.2f \n\tDesconto: $%.2f porcento", valorfinal,desconto);
   return 0;

}
*/
/*
int main(){
    //convertendo real em dolar

    float real,dolar;
    printf("\nDigite um numero real:");
    scanf("%f", &real);
    dolar=real/ 5,22;
    printf("\nValor convertido: US$ %.2f", dolar);
    return 0;
}
*/
/*
int main(){     // ler a quantidade de segundos e imprmir horas,m e segundos
    int segundos,horas,minutos,s,resto;
    printf("\nDigite a quantidade de segundos:");
    scanf("%d", &segundos);
    //3672 segundos
    h = segundos/3600;   //1 hora = 3600 segundos
    resto= segundos%3600 //resto, vai sobrar 12 por ex
    m= resto/60; // o que sobrou dividido por 60, 1 m
    s= resto%60; // resto do resto, os segundos
    printf("\nConvertido: %02d", horas);
    return 0;

}
*/

/*
int main () {   // reforçando
               //Converter uma quantidade de segundos para horas, minutos e segundos.
 int segundos,h,m,s,resto,hora;
 printf("\nDigite uma quantidade de segundos:");
 scanf("%d", &segundos);
 h = segundos/3600;
 resto=segundos%3600;
 m=resto/60;
 s=resto%60;
 printf(" %02d:%02d:%02d",h,m,s);
 return 0;
}
*/
/*
int main()
{  int h,segundos,m,s,resto;
   printf("\nDigite uma quantidade de segundos:");
   scanf("%d", &segundos);
   h=segundos/3600;
   resto=segundos%3600;
   m=resto/60;
   s=resto%60;
   printf("\n %02d:%02d:%02d",h,m,s);
   return 0;

}
*/
/*
int main(){ //media de tres numeros

int n1,n2,n3,media,mediaponderada,p1,p2,p3;
printf("\nDigite 3 valores:");
scanf("%d%d%d", &n1,&n2,&n3);
printf("\nDigite os pesos:");
scanf("%d%d%d",&p1,&p2,&p3);
media= n1+n2+n3/3;
mediaponderada=(n1*p1)+(n2*p2)+(n3*p3)/p1+p2+p3;
printf("\nMedia: %d\nMedia ponderada: %d", media,mediaponderada);
return 0;
}
*/
/*
int main() //par ou impar
{  int n1,resto;
   scanf("%d", &n1);
   resto=n1%2;
   switch(resto){
   case 0:;
     printf("par!");
     break;
   case 1:;
     printf("impar!");
     break;
     default:
     printf("invalido!");
   }
   return 0;
}
*/

int main() // resto da divisao de dois numeros ser par ou impar

{ int n1,n2,valor,resto;
  scanf("%d%d",&n1,&n2);
  valor=n1/n2;
  resto=n1%n2;
  switch(resto){
  case 0:;
    printf("par!");
    break;
  case 1:;
    printf("impar!");
    break;
  default:
    printf("invalido!");

 return 0;
}
}
