#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char nome[50];
    float nota;
} Aluno;


void aumentar(Aluno * vetor, int qtd) {
    for(int i = 0; i < qtd; i++) {
       vetor[i].nota *= 1.10;
    }

}
float media(Aluno *vetor, int qtd){
    float soma = 0;

    for(int i = 0; i < qtd; i++) {
        soma += vetor[i].nota;
    }

    return soma / qtd;
}

void ordenar(Aluno vetor[], int qtd){
    for(int i = 0; i < qtd -1; i++) {
        for (int j = 0; j< qtd - 1 -i; j++) {
            if(vetor[j].nota > vetor[j+1].nota) {
                Aluno temp = vetor[j]; // tipo de variável, no caso Aluno:
                vetor[j] = vetor[j+1];
                vetor[j+1] = temp;
            }
        }
    }


}

// Função para imprimir alunos
void imprimir(Aluno vetor[], int qtd) {
    for (int i = 0; i < qtd; i++) {
        printf("Aluno: %s\n", vetor[i].nome);
        printf("Nota: %.2f\n", vetor[i].nota);
    }
    printf("-------------------------\n");
}

int main() {
    int qtd;
    printf("Quantidade de alunos e seus respectivos nomes:");
    scanf("%d",&qtd);
    getchar();
    // Recurso: malloc
    // Serve para locar um bloco de memória dinamicamente
    // ou seja, execução do programa, em vez de no momento da compilação
    // usado quando o tamanho da memória é desconhecido antes de exe.
    // Porque o vetor criado com malloc NÃO precisa de uma variável auxiliar para existir.
    // usar o malloc para CRIAR memória
    // armazenar o ENDEREÇO dessa memória dentro do ponteiro
    // Vetor é criado de forma dinâmica

    // Alocando vetor de alunos
    Aluno *turma = malloc(qtd * sizeof(Aluno));
    // É necessário usar malloc porque a quantidade de alunos só é conhecida em tempo de execução.

    // Lendo nomes e notas
    for(int i = 0; i < qtd; i++) {

        printf("Nome do aluno %d: ", i + 1);
        fgets(turma[i].nome, 50, stdin);
    // Remove \n que fica guardado no final
        turma[i].nome[strcspn(turma[i].nome, "\n")] = '\0';


        printf("Nota do aluno %d: ", i+1);
        scanf("%f", &turma[i].nota);
        while (getchar() != '\n');  // limpa todo lixo do buffer
    }

    // Imprimindo
   printf("\n===LISTA ORIGINAL===\n");
   imprimir(turma,qtd);

   aumentar(turma,qtd);
   printf("\n===LISTA COM AUMENTO===\n");
   imprimir(turma,qtd);

   ordenar(turma,qtd);
   printf("\n===LISTA ORDENADA===\n");
   imprimir(turma,qtd);

   printf("Média da turma: %.2f\n", media(turma, qtd));

   free(turma);  // Liberando memória


   return 0;


}
