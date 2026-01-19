
## 📝 Versão 1 — Usando `DecimalFormat`

```java
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

🔹 Aqui usamos DecimalFormat para controlar o número de casas decimais manualmente.


---

📝 Versão 2 — Usando NumberFormat (mais simples)

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: ");
        String entrada = sc.nextLine();

        // Converte para BigDecimal
        BigDecimal valor = new BigDecimal(entrada);

        // Garante 2 casas decimais
        valor = valor.setScale(2, RoundingMode.HALF_UP);

        // Formata como moeda brasileira (R$ + vírgula + 2 casas)
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Você sacou: " + nf.format(valor));

        sc.close();
    }
}

🔹 Aqui usamos NumberFormat com Locale pt-BR, que já traz o formato de moeda brasileiro (R$ + vírgula + 2 casas decimais).


