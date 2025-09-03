#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>  // Para a função tolower


// Estrutura de seleção switch case
 // 1 = cadastrar produto
 // 2 = vender produto
 // 3 = buscar produto
 // 4 = imprimir relatorio
 // 0 = sair
/*
int main()
{   int opcao;
    printf("1-Cadastrar produto\n2-Vender produto\n3-Buscar produto\n4-Imprimir relatorio\n0-Sair\n");
    scanf("%d", &opcao);
    switch(opcao){
      case 1:
        printf("Cadastrar produto:\n");
        break;
      case 2:
        printf("Vender produto:\n");
        break;
      case 3:
        printf("Buscar produto:\n");
        break;
      case 4:
        printf("Imprimir produto:\n");
        break;
      case 0:
        printf("sair:\n");
      default:
        printf("invalido:\n");
}

    return 0;
}
*/
/*
 int main()
 {
    char opcao;
    printf("a-Cadastrar produto\nb-Vender produto\nc-Buscar produto\nd-Imprimir relatorio\ne-Sair\n");
    scanf(" %c",&opcao);
    // Converte a entrada para minúscula
    opcao = tolower(opcao);
    switch(opcao){
      case 'a':
        printf("Cadastrar produto:\n");
        break; // interromper execuçao
      case 'b':
        printf("Vender produto:\n");
        break;
      case 'c':
        printf("Buscar produto:\n");
        break;
      case 'd':
        printf("Imprimir produto:\n");
        break;
      case 'e':
        printf("sair:\n");
        break;
      default:
        printf("invalido:\n");
}

    return 0;
}
*/
// encontrar o maior e o menor entre três números REFORCANDO
int main(){
    int a,b,c,maior,menor;
    printf("3 valores:\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a<b){
        if(a<c)   // esse else nao tem nada haver com o if de cima, ele e como se fosseu
        menor = a;    // segunda verificaçao
        else
        menor = c;
    }
    else{  // quando aquele if externo for falso , b e menor que a
        if(b<c)
        menor = b;
        else
        menor = c;
    }
    if(a>b){
        if(a>c)
        maior = a;
        else
        maior = c;
    }
    else{  // se o if externo for falso, ou seja, b>a
        if(b>c)
        maior = b;
        else
        maior = c;
    }
    printf("\nMENOR\t %d\nMAIOR\t %d",menor,maior);
    return 0;
}




