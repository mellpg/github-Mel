package ProjetoHashmapPet;

import java.util.*;         // Importa classes utilitárias: Scanner, HashMap, List etc.
import java.io.FileWriter;  // Importa FileWriter para criar arquivos
import java.io.IOException; // Importa IOException para tratar erros de arquivo

// Declaração da classe pública Pet
public class Pet {
    // Atributos do pet
    int idade;         // Idade do pet
    String sexo;       // Sexo do pet
    String condicao;   // Condição de saúde do pet
    String tipo;       // Tipo do pet (Gato, Cachorro, Pássaro, Peixe)

    // Construtor da classe: usado para criar objetos Pet
    public Pet(String tipo, int idade, String sexo, String condicao) {
        this.tipo = tipo;
        this.idade = idade;
        this.sexo = sexo;
        this.condicao = condicao;
    }

    // Método toString(): define como o objeto será exibido ao imprimir
    @Override
    public String toString() {
        return "Tipo: " + tipo + " | Idade: " + idade + " | Sexo: " + sexo + " | Condição: " + condicao;
    }

    // Método main: ponto de entrada do programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria Scanner para ler dados do usuário

        // HashMap para armazenar os pets: chave = nome do pet, valor = objeto Pet
        HashMap<String, Pet> pets = new HashMap<>();
        System.out.println("=== Cadastro dos Pets ===");

        // Loop infinito para cadastro de pets
        while (true) {
            System.out.print("Digite o nome do pet (ou 'exit' para encerrar): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("exit")) {
                System.out.println("Cadastro encerrado!");
                break;
            }

            System.out.print("Digite o tipo do pet (Gato / Cachorro / Pássaro / Peixe): ");
            String tipo = sc.nextLine();

            System.out.print("Digite a idade do pet: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do Scanner

            System.out.print("Digite o sexo do pet: ");
            String sexo = sc.nextLine();

            String condicao;
            while (true) {
                System.out.print("Digite a condição do pet (Boa / Ruim / Emergência): ");
                condicao = sc.nextLine();

                if (condicao.equalsIgnoreCase("Boa") ||
                    condicao.equalsIgnoreCase("Ruim") ||
                    condicao.equalsIgnoreCase("Emergência")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Digite Boa, Ruim ou Emergência.");
                }
            }

            // Cria um objeto Pet e adiciona no HashMap
            pets.put(nome, new Pet(tipo, idade, sexo, condicao));
        }

        // Exporta os dados para um arquivo CSV
        // (CSV = Comma-Separated Values = Valores Separados por Vírgula)
        try {
            FileWriter writer = new FileWriter("pets_por_tipo.csv");

            // Cabeçalho do CSV
            writer.append("Nome,Tipo,Idade,Sexo,Condição\n");

            // Percorre cada pet no HashMap
            for (String nome : pets.keySet()) {
                Pet p = pets.get(nome);
                writer.append(nome).append(",")
                      .append(p.tipo).append(",")
                      .append(String.valueOf(p.idade)).append(",")
                      .append(p.sexo).append(",")
                      .append(p.condicao).append("\n");
            }

            writer.flush();
            writer.close();
            System.out.println("\nArquivo 'pets_por_tipo.csv' criado com sucesso! Abra no Excel.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close(); // Fecha o Scanner
    }
}
