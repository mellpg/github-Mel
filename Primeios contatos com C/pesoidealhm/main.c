#include <stdio.h>
#include <stdlib.h>
//Tendo como entrada a altura e o sexo (codificado da seguinte forma: “f”:feminino e
//“m”:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso
//ideal, utilizando as seguintes fórmulas:
//– para homens : (72.7 * h) – 58
//– para mulheres : (62.1 * h) – 44.7
//Onde h é a altura digitada.
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

    // Exibe o menu de opções
    printf("Escolha a forma geométrica para calcular a área:\n");
    printf("q - Quadrado\n");
    printf("r - Retângulo\n");
    printf("c - Círculo\n");
    printf("t - Trapézio\n");
    printf("Opção: ");
    scanf(" %c", &opcao); // O espaço antes de %c ignora espaços em branco anteriores

    switch(opcao) {
        case 'q':
            printf("Digite o valor do lado do quadrado: ");
            scanf("%f", &lado);
            area = lado * lado;
            printf("A área do quadrado é: %.2f\n", area);
            break;
        case 'r':
            printf("Digite o valor da base do retângulo: ");
            scanf("%f", &base_maior);
            printf("Digite o valor da altura do retângulo: ");
            scanf("%f", &altura);
            area = base_maior * altura;
            printf("A área do retângulo é: %.2f\n", area);
            break;
        case 'c':
            printf("Digite o valor do raio do círculo: ");
            scanf("%f", &raio);
            area = PI * raio * raio;
            printf("A área do círculo é: %.2f\n", area);
            break;
        case 't':
            printf("Digite o valor da base maior do trapézio: ");
            scanf("%f", &base_maior);
            printf("Digite o valor da base menor do trapézio: ");
            scanf("%f", &base_menor);
            printf("Digite o valor da altura do trapézio: ");
            scanf("%f", &altura);
            area = ((base_maior + base_menor) * altura) / 2;
            printf("A área do trapézio é: %.2f\n", area);
            break;
        default:
            printf("Opção inválida!\n");
            break;
    }

    return 0;
}
