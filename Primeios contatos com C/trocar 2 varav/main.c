#include <stdio.h>
#include <stdlib.h>
#include<locale.h>
//| Exerc�cio 2: Como TROCAR os valores de duas vari�veis e fazendo elas voltarem ao valor inicial?
/*
int main()
{
    int a,b;

    setlocale(LC_ALL,"portuguese");
    printf("digite um n�mero: \n");
    scanf("%d", &a);
    printf("digite outro n�mero\n:");
    scanf("%d", &b);
    a=b;
    return 0;
}
*/
/*
int main() {// resulu��o

   int a,b,c;
   printf("\nDigite dois valores: ");
   scanf("%d %d", &a,&b);
   printf("\nRetornados: a:  %d  b:  %d",a,b);
  // a=35  //a=35
  //b=15   //b=15
  //c=35   //c=15
  c=a;//atribui��o, ele vai deletar o que queremos, n�o serve
  a=b;
  b=c;// esse c � como se fosse uma c�pia, um balde auxiliar de a
   printf("\nRetornados: a:  %d  b: %d",a,b);

   return 0;
}*/

//Trocar valores de duas vari�veis sem usar uma vari�vel auxiliar | aula 33
int main(){
  int a,b;
  printf("digite dois valores:");
  scanf("%d %d", &a,&b);
  printf("\nValores retornados: a: %d\t b:  %d",a,b);

  // x=10->x+y=15
  //y=5-> x-y=5
  //x=x-y
  a=a+b;
  b=a-b;
  a=a-b;
  return 0;

}

