#include <locale.h>
//vamos dizer para o computador que queremos usar essa tabela, usando #include<locale.h>



//Acentua��o e a tabela ASCII
//1 byte (8bits)-> -128 ate 127
//   para aumentar a quantidade
 // unsigned 1 byte -> 0 ate 255
//9 e o caractere da tabula�ao \t
//10 e o caractere da nova linha \n enter
//65 e a letra A maiuscula
//66 e a letra B minuscula
//90 e a letra Z maiuscula
int main()
{  char letra = 'f'; // vai dar 102 , tabela asc
    //printf("\n\tRetornado: %d\n", letra);
    setlocale(LC_ALL,"");//ESTAMOS INDICANDO QUE LOCAL Q ESTAMOS USA ACENTUA�AO
    // poderia ficar tambem:
    setlocale(LC_ALL,"portuguese");
    // caso queira confirmar fa�a isso
    printf("%s\n", setlocale(LC_ALL,"portuguese"));
    printf("\n\nCora��o\n");

    return 0;
}
