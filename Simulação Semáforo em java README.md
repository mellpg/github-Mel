public class SemaforoSimples {

    public static void main(String[] args) {
        while (true) {
            // Acende LED vermelho por 10 segundos
            System.out.println("🔴 Vermelho - PARE");
            dormir(10000);

            // Acende LED amarelo por 3 segundos
            System.out.println("🟡 Amarelo - ATENÇÃO");
            dormir(3000);

            // Acende LED verde por 7 segundos
            System.out.println("🟢 Verde - SIGA");
            dormir(7000);
        }
    }

    // Função auxiliar para pausar o programa
    public static void dormir(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
