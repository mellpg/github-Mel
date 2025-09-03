#include <stdio.h>
#include <stdlib.h>
//  Como usar as operações básicas da matemática na linguagem C
// soma + sub- multiplicaçao * divisap /
/*int main()
{
    printf("\n\nSoma: %d\n", 10+20);
    printf("\nSubtracao:%d\n", 20-10);
    printf("\nMultiplicacao:%d\n", 20*10);
    printf("\nDivisao : %d\n", 20/10);
    printf("\nDivisao : %.1f\n", 10.0/20); // vai dar 0, para concertar, tem que transformar um deles em real
    return 0;
}*/
/*int main()
//O que significa Casting ou conversão de tipos na linguagem C?
{
    int a=10, b=20;
    float pi = 3.1415;
    a = (int)pi;
    printf("\nValor de a: %d", a);
    printf("\n\nSoma: %d\n", a+b);
    printf("\nSubtracao:%d\n", a-b);
    printf("\nMultiplicacao:%d\n", a*b);
    printf("\nDivisao : %.1f\n", a/b);  // nao da pra modificar o valor va variavel inteira pra real, nao e igual ao anterior
    // entao vamos pedir para o computador converter colocando(o que vc quer) variavel
     printf("\nDivisao : %.1f\n", (float)a/b);


    return 0;
}*/

/*int main()
// Como usar o operador de resto da divisão %?
{ //20/10 r =0
    int a = 7, b = 22;

    printf("\n\n\Resto da divisao inteira:%d\n", b % 2); // % resto da divisao
    return 0;

}
*/
/*int main()
// Como funciona o operador de incremento ++? adiciona mais 1, pode colocar na esquerda

{
  int resultado,contador = 10;
  // formas de colocar
  //contador ++;  ele vai imprimir o numero depois somar ja o ++contador, faz o contrario
  //contador +=1;
  //contador=contador+1;
  resultado=contador++;
  //resultado=++contador;
  printf("\nResultado: %d", resultado);
  //printf("\nResultado: %d", resultado);
 // printf("\nValor: %d", ++contador);
  //printf("\nValor: %d", contador);

  return 0;
}*/
/*int main()
{ //Como funciona o operador de decremento --?
    int resultado,contador=10;
    //printf("retornadp:%d",contador--);
     printf("\nretornadp:%d",--contador);
     resultado=contador--;
     printf("\nResultado: %d", resultado);
// sinonimos
//contador--;
//contador -=1;
//contador= contador-1;

}*/
int main()
{                                          // // O que é operador unsigned? [número sem sinal], serve para o computador nao dar atençao ao sinal
  // vantagem e a capacidade de armazenar mais numeros positivos, todo aquele espaço de negativo foi pra positivo
   unsigned int x= 2147483647;
   unsigned short int y = 55000;// short int pode ser impresso com %d ou %hi
    // nao vai funcionar, tem q colocar o unsigned short int, usando pra imprmir %hu
    //printf("\n\n\tValor: %hi", ++y);
    printf("\nValor: %hu", ++y);

// tem que colocar %u o %d vai exigir um digito para informar o sinal
     printf("\n\n\tValor: %u", ++x);
   return 0;
}

