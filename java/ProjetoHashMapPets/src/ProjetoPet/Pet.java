package ProjetoPet; 

import java.util.*;
import java.util.Scanner;

// Classe para representar cada Pet
class Pet {
	int idade;
	String sexo; 
	String condicaoSaude;
	
	// Construtor para inicializar Pet
	public Pet( int idade, String sexo, String condicaoSaude) {
		this.idade = idade;
		this.sexo = sexo;
		this.condicaoSaude = condicaoSaude;
	}
	// Método para imprimir objeto de forma legível
	@override
	public String toString() {
		return "idade" + idade + "sexo" + sexo + "Condição de saúde" + condicaoSaude;
	}
	
}

public class CadastroPets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// HashMap principal: chave = nome do pet, valor = objeto pet
		HashMap<String, Pet> pets = new HashMap<>();
		
		System.out.println("=== Cadastro dos Pets ===");
		// Loop para cadastrar quantos pets quiser
		while (true) {
			System.out.print("Digite o nome do pet (ou 'exit') para sair:");
			String nome = sc.nextLine();
			
			if (nome.equalsIgnoreCase("exit")) {
				break;
			}
		}
		  System.out.print("Digite a idade do pet: ");
		  int idade = sc.nextInt();
		  sc.nextLine(); // limpar buffer do Scanner
		  System.out.print("Digite o sexo do pet: ");
		  String sexo = sc.nextLine();
		  
		  System.out.print("Digite a Condição de saúde do pet: ");
		  String condicaoSaude = sc.nextLine();
		  
		  // put() adiciona o pet no hashmap ( chave = nome, valor = objeto Pet)
		pets.put(nome, new Pet(idade, sexo, condicaoSaude));  
		  }
	
	      // Mostrando todos os pets
	     System.out.println("=== Lista dos pets cadastrados ===");
	     for(String nome : pets.KeySet()) { // Retorna todas as chaves
	    	 System.out.println("Nome: " + nome +" | " + pets.get(nome)); //  get() retorna o valor da chave
	     } 
	     
	     // Consultar pet específico
	     System.out.println("Digite o nome do pet para realizar a consulta:");
	     String consulta = sc.nextLine();
	     if()
	} 


