import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        var  scanner = new Scanner(System.in); // Importante usar Scanner com maiúscula
        System.out.println("Informe seu nome:");
        var name = scanner.next(); // método next() sem new
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");
        // OBSERVAÇÕES:
        /* Forma de mostrar os índices e o argumento
         * for(var i =0; i < args.length; i++) {
         *     System.out.println( (i +1 )" -" + args[i]);
         *   }
         */
        /* 
        if (age >= 18) {
            System.out.printf("%s ,pode dirigir! Você tem %d anos\n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s ,Apesar de você não ser maior de idade, pode dirigir.\n", name, age);
        } else {
            System.out.printf("%s,Você não pode dirigir, pois , não é maior de idade e nem emancipado.\n",name);
        }
         */ 
        var canDrive = (age >= 18) || (age >=16 && isEmancipated);
        var message = canDrive ? name + ", você pode dirigir. \n" : name + ", você não pode dirigir.";


        System.out.println(message);
        System.out.println("Fim da execução");
         
        scanner.close();
    }
}
