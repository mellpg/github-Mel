#include <stdio.h>
#include <stdlib.h>
 // double
int main() /*
{   float x=3.1415;  //precisao simples
    double y=3.12020102292; //precisao maior
    printf("um double precisa de:%d bytes\n", sizeof y);
    return 0;
} */
//operador long para double

 /*//operador long para tipo double
 //double->%lf
 //long double->
 */


#include <stdio.h>  // Certifique-se de incluir esta biblioteca

 int main() {
    float x = 3.12345;
    double y = 3.123456670753883124;

    printf("\n tamanho de y: %.10f bytes", y);
    printf("um double precisa do tamanho %d bytes", sizeof (Y));
    return 0;
}
