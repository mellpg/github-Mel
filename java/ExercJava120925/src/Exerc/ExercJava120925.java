package Exerc;

import java.util.Scanner;

public class ExercJava120925 {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        int option = -1;

        do {
            System.out.println("\n=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("10 - Sair");
            System.out.print("Digite a opção: ");

            option = scanner.nextInt();

            switch (option) { 
                case 1:
                	petMachine.takeShowerInAPet();
                case 2:
                	setWater();
                case 3:
                	setShampoo();
                case 4: 
                	verifyWater();
                case 5:
                    verifyShampoo();
                    break;
                case 6:
                    checkIfhasPetInMachine();
                    break;
                case 7:
                    setPetInPetMachine();
                    break;
                case 8:
                    petMachine.removePet();
                    break;
                case 9:
                    petMachine.wash();
                    break;
                case 0:
                	System.exit(0);
                default:
                	System.out.println("Opção inválida");
            }

        } while (option != 10);

        System.out.println("Programa encerrado.");
    }
    private static void setWater() {
    	System.out.println("Tentando colocar água na máquina");
    	petMachine.addWater();
    }
    private static void setShampoo() {
    	System.out.println("Tentando colocar shampoo na máquina");
    	petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + "Litro(s) de água");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + "Litro(s) de shampoo");
    }

    private static void checkIfhasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine() {
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Informe o nome do pet: ");
            name = scanner.next();
        }

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

}
