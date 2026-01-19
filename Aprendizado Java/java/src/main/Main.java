package main;
import java.util.Scanner;

public class Main {
    private final static String WELCOME_MESSAGE = "Olá, informe seu nome.";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner com S maiúsculo para o tipo, minúsculo para o nome da variável
        
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();
        
        System.out.printf("Olá, %s! Sua idade é: %d\n", name, age);
        
        scanner.close(); // Boa prática: fechar o scanner
    }
}
