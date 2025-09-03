#include <stdio.h>
#include <stdlib.h>
//Tendo como entrada a altura e o sexo (codificado da seguinte forma: �f�:feminino e
//�m�:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso
//ideal, utilizando as seguintes f�rmulas:
//� para homens : (72.7 * h) � 58
//� para mulheres : (62.1 * h) � 44.7
//Onde h � a altura digitada.
/*
int main()
{   float altura,pesoideal;
    char sexo;
    printf("Digite a altura e o sexo ('f' ou 'm'):\n");
    scanf("%f %c", &altura,&sexo);
    if(sexo == 'f'){
      pesoideal = (62.1 * altura) - 44.7;
    }
    if(sexo == 'm'){
      pesoideal = (72.7 * altura) - 58;
    }
    printf("\nPeso ideal : %.1f", pesoideal);

    return 0;
}
*/


int main() {
    char opcao;
    float lado, altura, raio, base_menor, base_maior, area;
    const float PI = 3.14159;

    // Exibe o menu de op��es
    printf("Escolha a forma geom�trica para calcular a �rea:\n");
    printf("q - Quadrado\n");
    printf("r - Ret�ngulo\n");
    printf("c - C�rculo\n");
    printf("t - Trap�zio\n");
    printf("Op��o: ");
    scanf(" %c", &opcao); // O espa�o antes de %c ignora espa�os em branco anteriores

    switch(opcao) {
        case 'q':
            printf("Digite o valor do lado do quadrado: ");
            scanf("%f", &lado);
            area = lado * lado;
            printf("A �rea do quadrado �: %.2f\n", area);
            break;
        case 'r':
            printf("Digite o valor da base do ret�ngulo: ");
            scanf("%f", &base_maior);
            printf("Digite o valor da altura do ret�ngulo: ");
            scanf("%f", &altura);
            area = base_maior * altura;
            printf("A �rea do ret�ngulo �: %.2f\n", area);
            break;
        case 'c':
            printf("Digite o valor do raio do c�rculo: ");
            scanf("%f", &raio);
            area = PI * raio * raio;
            printf("A �rea do c�rculo �: %.2f\n", area);
            break;
        case 't':
            printf("Digite o valor da base maior do trap�zio: ");
            scanf("%f", &base_maior);
            printf("Digite o valor da base menor do trap�zio: ");
            scanf("%f", &base_menor);
            printf("Digite o valor da altura do trap�zio: ");
            scanf("%f", &altura);
            area = ((base_maior + base_menor) * altura) / 2;
            printf("A �rea do trap�zio �: %.2f\n", area);
            break;
        default:
            printf("Op��o inv�lida!\n");
            break;
    }

    return 0;
}
