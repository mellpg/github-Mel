import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: R$ ");
        String entrada = sc.nextLine(); // pega como String para evitar problemas de vírgula/ponto

        // Cria BigDecimal a partir da String
        BigDecimal valor = new BigDecimal(entrada);

        // Garante que sempre terá 2 casas decimais
        valor = valor.setScale(2, RoundingMode.HALF_UP);

        // Formata o valor para exibição (com vírgula e duas casas)
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Você sacou: R$ " + df.format(valor));

        sc.close();
    }
}
