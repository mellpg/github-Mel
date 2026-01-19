package ProjetoHashMapPet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pet {

	// Atributos
	String tipo;
	int idade;
	String sexo;
	String condicao;

	// Construtor
	public Pet(String tipo, int idade, String sexo, String condicao) {
		this.tipo = tipo;
		this.idade = idade;
		this.sexo = sexo;
		this.condicao = condicao;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + " | Idade: " + idade + " | Sexo: " + sexo + " | Condição: " + condicao;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Pet> pets = new HashMap<>();

		System.out.println("=== Cadastro dos Pets ===");

		while (true) {
			System.out.print("Digite o nome do pet (ou 'exit'): ");
			String nome = sc.nextLine();

			if (nome.equalsIgnoreCase("exit"))
				break;

			System.out.print("Tipo: ");
			String tipo = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();

			System.out.print("Sexo: ");
			String sexo = sc.nextLine();

			String condicao;
			while (true) {
				System.out.print("Condição (Boa / Ruim / Emergência): ");
				condicao = sc.nextLine();

				if (condicao.equalsIgnoreCase("Boa") || condicao.equalsIgnoreCase("Ruim")
						|| condicao.equalsIgnoreCase("Emergência")) {
					break;
				}
				System.out.println("Opção inválida!");
			}

			pets.put(nome, new Pet(tipo, idade, sexo, condicao));
		}

		try {
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet("Pets");

			// Cabeçalho em negrito
			Font headerFont = workbook.createFont();
			headerFont.setBold(true);

			CellStyle headerStyle = workbook.createCellStyle();
			headerStyle.setFont(headerFont);

			Row header = sheet.createRow(0);
			String[] colunas = { "Nome", "Tipo", "Idade", "Sexo", "Condição" };

			for (int i = 0; i < colunas.length; i++) {
				Cell cell = header.createCell(i);
				cell.setCellValue(colunas[i]);
				cell.setCellStyle(headerStyle);
			}

			int linha = 1;
			for (String nome : pets.keySet()) {
				Pet p = pets.get(nome);
				Row row = sheet.createRow(linha++);

				row.createCell(0).setCellValue(nome);
				row.createCell(1).setCellValue(p.tipo);
				row.createCell(2).setCellValue(p.idade);
				row.createCell(3).setCellValue(p.sexo);
				row.createCell(4).setCellValue(p.condicao);
			}

			// Ajusta largura
			for (int i = 0; i < colunas.length; i++) {
				sheet.autoSizeColumn(i);
			}

			FileOutputStream out = new FileOutputStream("pets.xlsx");
			workbook.write(out);
			out.close();
			workbook.close();

			System.out.println("Arquivo Excel criado!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
