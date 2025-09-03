#include <stdio.h>
#include <stdlib.h>
#include<locale.h>
//| Exercício 2: Como TROCAR os valores de duas variáveis e fazendo elas voltarem ao valor inicial?
/*
int main()
{
    int a,b;

    setlocale(LC_ALL,"portuguese");
    printf("digite um número: \n");
    scanf("%d", &a);
    printf("digite outro número\n:");
    scanf("%d", &b);
    a=b;
    return 0;
}
*/
/*
int main() {// resulução

   int a,b,c;
   printf("\nDigite dois valores: ");
   scanf("%d %d", &a,&b);
   printf("\nRetornados: a:  %d  b:  %d",a,b);
  // a=35  //a=35
  //b=15   //b=15
  //c=35   //c=15
  c=a;//atribuição, ele vai deletar o que queremos, não serve
  a=b;
  b=c;// esse c é como se fosse uma cópia, um balde auxiliar de a
   printf("\nRetornados: a:  %d  b: %d",a,b);

   return 0;
}*/

//Trocar valores de duas variáveis sem usar uma variável auxiliar | aula 33
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

