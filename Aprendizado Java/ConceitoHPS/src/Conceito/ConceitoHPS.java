package Conceito;

// O Employer é a classe pai/ superclasse
// Os restantes são suas classes filhas
// Estamos definindo heranças
// E o que é Polimorfismo?
// É a capacidade de um método se comportar de maneira diferente
// Ex: Uma casa que tem 3 cachorros
// Todas têm as mesmas características mas têm comportamentos / necessidades diferentes.
// Ex: Crédito ou Débito, são diferentes, mas a máquina aceita o CARTÃO, serve para os dois
// A máquina é como se fosse um método que aplica pagamento

public class ConceitoHPS {

    public static void main(String[] args) {
        // Testando a função com objetos diferentes
        PrintEmployee(new Manager());
        PrintEmployee(new Salesman());

        Employee manager = new Manager();

        // Se fizermos:
        // Employee manager = new Manager();
        // A gente "SETOU" que ele é um gerente
        // você colocou o mais específico para o
        // mais genérico, mas o código vai tratar como genérico
        // No nosso código criamos o colaborador
        // temos gerente, vendedor, funcionário...
        // mas para o código isso é indiferente
        // Para o código gerente é gerente, colab = colab etc.
        // Para não ter problemas de restrição
        // definimos como abstrata
        // ela não pode ser instânciada

        // manager.setName("Pedro");
        // manager.setLogin("Pedro");
        // manager.setPassword("245356");

        // System.out.println(manager.getName());
        // System.out.println(manager.getLogin());
        // System.out.println(manager.getPassword());
    }

    public static void PrintEmployee(Employee employee) {
    	// O protected consegue modificar e acessar aqui:
    	employee.code = "";
    	// Mas não tínhamos acesso de fora?
    	// Acontece é que você consegue acessar propriedades
    	// quando se está no mesmo package
        // Imprime no console o nome completo da classe real do objeto em tempo de execução
        System.out.println("===================================");
        System.out.printf("Classe do objeto: %s\n", employee.getClass().getCanonicalName()); // imprime nome da classe
        System.out.println("-----------------------------------");
        
        // IMPORTANTE:
        // verifica se o objeto é uma instância de uma determinada Classe
        // if (employee instanceof Manager manager) {
            // Define o nome do colaborador (método herdado da superclasse Employee)

        switch (employee) {
        case Manager manager ->{
        	  // Define código do colaborador
            manager.setCode("123");
            
            // Define o nome do colaborador (método herdado da superclasse Employee)
            manager.setName("Pedro");

            // Define login do gerente
            manager.setLogin("Pedro");

            // Define senha do gerente
            manager.setPassword("245356");
            
            // Define salário do gerente (evita imprimir 0)
            manager.setSalary(5000); 
            
            // Define comissão do gerente
            manager.setComission(1200);

            // Imprime informações de forma organizada
            System.out.printf("====== Manager ======\n");
            System.out.printf("Nome: %s\n", manager.getName());
            System.out.printf("Login: %s\n", manager.getLogin());
            System.out.printf("Senha: %s\n", manager.getPassword());
            System.out.printf("Código: %s\n", manager.getCode());
            System.out.printf("Salário: %.2f\n", manager.getSalary());
            System.out.printf("Comissão: %.2f\n", manager.getComission());
            System.out.println(manager.getfullSalary(500));
            System.out.println("====================\n");
          } 
        case Salesman salesman ->{
        	salesman.setCode("12375");
            salesman.setName("Lucas");
            salesman.setSalary(1450);
            salesman.setPercentPerSold(10);
            salesman.setSoldAmount(1000);
            
            System.out.printf("Nome: %s\n", salesman.getName());
            System.out.println(salesman.getCode());
            System.out.println(salesman.getSalary());
            System.out.println(salesman.getPercentPerSold());
            System.out.println(salesman.getSoldAmount());
            
        }
        
        
        }
        System.out.println(employee.getfullSalary());
        // Apenas imprime uma linha de separação visual
        // O swtich não está cobrando default pq a classe é sealed
        // Só manipular as "autorizadas"
        System.out.println("===================================\n");
    }
}
// 27 59
