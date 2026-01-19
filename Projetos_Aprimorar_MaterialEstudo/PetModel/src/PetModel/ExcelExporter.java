package PetModel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

//Classes do Apache POI (biblioteca que cria arquivos Excel)
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Dicas importantes: depois de configurar o maven, qualquer extensão
//basta adicionar nas dependências
//Usar o pom.xml

//Para próximos projetos como esse por exemplo:

/*
* Criar novo projeto Maven

Abrir o pom.xml

Copiar:

<dependency>
 <groupId>org.apache.poi</groupId>
 <artifactId>poi-ooxml</artifactId>
 <version>5.2.5</version>
</dependency>

Salvar

Maven → Update Project
*/

public class ExcelExporter {

	// Método público para receber os dados e criar o Excel
	// Map<String, Pet> → chave = nome do pet | valor = objeto Pet
	public void exportar(Map<String, Pet> pets) throws IOException {

		// Cria o arquivo Excel ( formato .xlsx )
		Workbook workbook = new XSSFWorkbook();

		// Cria uma aba chamada "Pets"
		Sheet sheet = workbook.createSheet("Pets");

		// Cabeçalho

		// Criando a fonte para o cabeçalho
		Font headerFont = workbook.createFont();
		headerFont.setBold(true); // deixa em negrito

		// Cria um estilo de célula
		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFont(headerFont); // aplica a fonte no estilo

		// Nomes das colunas
		String[] colunas = { "Nome", "Tipo", "Idade", "Sexo", "Condição" };

		// Cria a primeira linha da planilha (linha 0)
		Row header = sheet.createRow(0);

		// Cria cada célula do cabeçalho
		for (int i = 0; i < colunas.length; i++) {
			Cell cell = header.createCell(i); // cria a célula
			cell.setCellValue(colunas[i]); // texto da coluna
			cell.setCellStyle(headerStyle); // aplica estilo
		}

		// >>>>>>> CORREÇÃO DO ERRO (criação dos estilos) <<<<<<<<
		CellStyle boa = criarEstilo(workbook, IndexedColors.LIGHT_GREEN);
		CellStyle ruim = criarEstilo(workbook, IndexedColors.LIGHT_YELLOW);
		CellStyle emergencia = criarEstilo(workbook, IndexedColors.RED);
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		// Preenchimento dos dados

		int linha = 1; // começa após o cabeçalho

		// Percorre todos os pets cadastrados
		for (String nome : pets.keySet()) {

			Pet p = pets.get(nome); // pega o Pet pelo nome
			Row row = sheet.createRow(linha++); // cria nova linha

			// Preenche as colunas
			row.createCell(0).setCellValue(nome);
			row.createCell(1).setCellValue(p.getTipo());
			row.createCell(2).setCellValue(p.getIdade());
			row.createCell(3).setCellValue(p.getSexo());

			// Coluna da condição
			Cell condicaoCell = row.createCell(4);
			condicaoCell.setCellValue(p.getCondicao().name());
			// .name() → converte ENUM para texto

			// Aplica a cor de acordo com a condição
			if (p.getCondicao() == Condicao.BOA)
				condicaoCell.setCellStyle(boa);
			else if (p.getCondicao() == Condicao.RUIM)
				condicaoCell.setCellStyle(ruim);
			else
				condicaoCell.setCellStyle(emergencia);
		}

		// Ajustando de forma automática a largura das colunas
		for (int i = 0; i < colunas.length; i++) {
			sheet.autoSizeColumn(i);
		}

		// Cria o arquivo físico pets.xlsx
		FileOutputStream out = new FileOutputStream("pets.xlsx");

		// Escreve os dados no arquivo
		workbook.write(out);

		// Fecha recursos (boa prática)
		out.close();
		workbook.close();

	}

	// Método auxiliar que cria um estilo com cor de fundo
	private CellStyle criarEstilo(Workbook workbook, IndexedColors cor) {
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(cor.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		return style;
	}

}
