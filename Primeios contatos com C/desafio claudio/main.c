#include <stdio.h>
#include <stdlib.h>

void Limpa(){
	system("cls");
}

float Verifica(float Nota){
	float N;
		printf("Nota inválida! ");
		printf("Digite a Nota: ");
		scanf("%f",&N);
		return N;
}
float Media(float N1, float N2){
	return (N1+N2)/2;
}

int main(){
	char nome[50];
	float N1,N2, Result;
	char op='S';
	while(op=='S'){
		Limpa();
		printf("Digite o nome do aluno: ");
		scanf("%s", nome); //ou gets(nome);
		printf("Digite a primeira nota: ");
		scanf("%f", &N1);
		while(N1<0 || N1>10){
			N1=Verifica(N1);
		}
		printf("Digite a segunda nota: ");
		scanf("%f", &N2);
		while(N2<0 || N2>10){
			N2=Verifica(N2);
		}
		Result=Media(N1,N2);
		if(Result>=6){
			printf("O aluno %s obteve média %.2f!\n", nome, Result);
			printf("Aprovado");
		}
		else{
			if(Result >= 4 && Result <= 5.9){
				printf("O aluno %s obteve média %.2f!\n", nome, Result);
				printf("Prova Final");
			}
			else{
				printf("O aluno %s obteve média %.2f!\n", nome, Result);
				printf("Reprovado");
			}
		}
	printf("\nDeseja continuar? S ou N");
    getchar();
	scanf(" %c", &op);

}
 return 0;
}
