import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var name = "";
        while( true ) {
         System.out.println("informe um nome:");
         name = scanner.next();
         System.out.println(name);


         if(name.equalsIgnoreCase("exit")) break;
        } 
        
        System.out.println("Fim da execução.");
        scanner.close();
    }
}
        /*ou do(condição) {
         System.out.println("informe um nome:");
         name = scanner.next();
         System.out.println(name);

        
        
        } while (name.equalsIgnoreCase("exit")) break;
         * 
        ) */ 
        
        // while e do while dentro de um for 
        /*
         * for( int i = 0; i < args.length; i++){
         * 
         * 
         * } 
         * 
         * for(var agr: args) { --> quando é so argumento, sem índices, não precisa
         *                          // de variável de controle
         * 
         * }
         * 
         *  while(false){
         * 
         *  } 
         * 
         *  do{
         * 
         * } while (true);
         * 
         */ 
        /* public static..
         * var i = 0;
         * while (args.length > i){
         *     System.out.println(args[i]);
         *     i++
         *  } 
         *     i = 0;
         *      
         *     System.out.println("==============");
         *  do { 
         *     
         *     System.out.println(args[i]);
         *     i++;
         *  } 
         * 
         *   while(args.length > i){
         *     
         * }
         */

         //formas alternativas(for é melhor)
         /*
          * O i++ normalmente vai no cabeçalho do laço:


/*
 * Você usa i++ (ou outro incremento parecido, como i += 2) sempre que quiser aumentar o valor de uma variável a cada repetição, e isso não estiver sendo feito automaticamente.

Pensando nas estruturas de repetição:

📌 1. for tradicional
O i++ normalmente vai no cabeçalho do laço:

java
Copiar
Editar
for (int i = 0; i < 5; i++) { // incremento embutido aqui
    System.out.println(i);
}
✅ Não precisa colocar i++ dentro do bloco — ele já é feito no final de cada volta.

📌 2. while e do while
Aqui não existe incremento embutido, então se você quer que a variável mude, precisa fazer manualmente:


int i = 0;
while (i < 5) {
    System.out.println(i);
    i++; // sem isso, loop infinito
}
Mesmo no do while é a mesma lógica:


int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
📌 3. Quando usar i++
Quando controla o número de repetições com uma variável contadora (ex.: i, contador).

Quando precisa percorrer posições em um array, lista ou string.

Quando quer pular para o próximo passo de um processo controlado por um número.

Quando o incremento não é automático pela estrutura de repetição (caso de while e do while).
 */