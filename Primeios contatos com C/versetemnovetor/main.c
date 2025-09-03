 //Fazer um programa para calcular o prêmio proporcional de um ganhador do
//concurso, sendo que o total do prêmio é de cem mil, o primeiro ganhador recebe
//46%, o segundo 32% e o terceiro o restante. O programa só poderá aceitar opções
//para os 3 ganhadores, caso contrário exibir a mensagem de erro
#include<stdio.h>
#include<string.h>
float  opcao1(){
    float ganhador;
    ganhador  = 0.46*10000.0;
}
float opcao2 (){
    float  segundo;
    segundo = 0.32*10000.0;
}
float opcao3 (){
    float terceiro;
    terceiro = 10000.0 - (primeiro+segundo);
}
int main()
{   int escolha;
    printf("1--> VALOR DO GANHADOR\N2--> VALOR DO SEGUNDO\N-->3--> VALOR DO TERCEIRO:");
    Switch(escolha):
    case 1:
    opcao 1(escolha);
    break;
    case 2:
    opcao 2 (escolha);
    break;
    case 3:
    opcao 3(escolha);
    break;
    default:
        printf("invalido:");
return 0;
}



