package ProjetoHashmapPet;

import java.util.*;         // Importa classes utilitárias: Scanner, HashMap, List etc.
import java.io.FileWriter;  // Importa FileWriter para criar arquivos
import java.io.IOException; // Importa IOException para tratar erros de arquivo

// Declaração da classe pública Pet
public class Pet {
    // Atributos do pet
    int idade;      // Idade do pet
    String sexo;    // Sexo do pet
    String condicao;// Condição de saúde do pet
    String tipo;    // Tipo do pet (Gato, Cachorro, Pássaro, Peixe)

    // Construtor da classe: usado para criar objetos Pet
    public Pet(String tipo, int idade, String sexo, String condicao) {
        this.tipo = tipo;         // "this" se refere ao atributo da classe
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
            String nome = sc.nextLine(); // Lê o nome do pet

            if (nome.equalsIgnoreCase("exit")) { // Verifica se o usuário quer encerrar
                System.out.println("Cadastro encerrado!");
                break; // Sai do loop
            }

            // Validação do tipo
            String tipo;
            while (true) {
                System.out.print("Digite o tipo do pet (Gato / Cachorro / Pássaro / Peixe): ");
                tipo = sc.nextLine();
                if (tipo.equals("Gato") || tipo.equals("Cachorro") || tipo.equals("Pássaro") || tipo.equals("Peixe")) {
                    break; // Entrada válida
                } else {
                    System.out.println("Tipo inválido! Use exatamente: Gato, Cachorro, Pássaro ou Peixe.");
                }
            }

            // Leitura da idade
            System.out.print("Digite a idade do pet: ");
            int idade = sc.nextInt(); // Lê a idade (número inteiro)
            sc.nextLine(); // Limpa o buffer do Scanner

            // Validação do sexo
            String sexo;
            while (true) {
                System.out.print("Digite o sexo do pet (Macho / Fêmea): ");
                sexo = sc.nextLine();
                if (sexo.equals("Macho") || sexo.equals("Fêmea")) {
                    break; // Entrada válida
                } else {
                    System.out.println("Sexo inválido! Use exatamente: Macho ou Fêmea.");
                }
            }

            // Validação da condição
            String condicao;
            while (true) {
                System.out.print("Digite a condição do pet (Boa / Ruim / Emergência): ");
                condicao = sc.nextLine();
                if (condicao.equals("Boa") || condicao.equals("Ruim") || condicao.equals("Emergência")) {
                    break; // Entrada válida
                } else {
                    System.out.println("Opção inválida! Digite Boa, Ruim ou Emergência.");
                }
            }

            // Cria um objeto Pet e adiciona no HashMap
            pets.put(nome, new Pet(tipo, idade, sexo, condicao));
        }

        // Exporta os dados para um arquivo CSV
        try {
            FileWriter writer = new FileWriter("C:/Users/mel/Documents/pets_por_tipo.csv");
            // Cabeçalho do CSV (nomes das colunas)
            writer.append("Nome,Tipo,Idade,Sexo,Condição\n");

            // Percorre cada pet no HashMap
            for (String nome : pets.keySet()) {
                Pet p = pets.get(nome); // Obtém o objeto Pet
                writer.append(nome).append(",")        // Nome
                      .append(p.tipo).append(",")     // Tipo
                      .append(String.valueOf(p.idade)).append(",") // Idade
                      .append(p.sexo).append(",")     // Sexo
                      .append(p.condicao).append("\n"); // Condição
            }

            writer.flush(); // Garante que todos os dados foram escritos
            writer.close(); // Fecha o arquivo
            System.out.println("\nArquivo 'pets_por_tipo.csv' criado com sucesso! Abra no Excel.");
        } catch (IOException e) { // Trata possíveis erros de escrita de arquivo
            e.printStackTrace();
        }

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}
