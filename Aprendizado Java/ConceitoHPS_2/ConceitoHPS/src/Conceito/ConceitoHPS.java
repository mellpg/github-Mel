package Conceito;

// O Employer é a classe pai/ superclasse
// Os restantes são suas classes filhas
// Estamos definindo heranças
// E o que é Polimorfismo?
// É a capacidade de um método se comportar de maneira
// diferente 
// Ex: Uma casa que tem 3 cachorros
// Todas têm as mesmas características mas
// têm comportamentos / necessidades diferentes.
// Ex: Crédito ou Débito, são diferentes, mas a
// máquina aceita o CARTÃO, serve para os dois
// A máquina é como se fosse um método que aplica 
// pagamento

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
    	// Imprime no console o nome completo da classe real do objeto em tempo de execução (nesse caso, Manager)
        System.out.printf("======%s======/\n", employee.getClass().getCanonicalName()); // imprime nome da classe
    	// verifica se o objeto é uma instância de uma 
    	// determinada Classe
    	if (employee instanceof Manager) {
        // Define o nome do colaborador (método herdado da superclasse Employee)
        employee.setName("Pedro");
                
        // Faz o cast para Manager e define o login do gerente
        // Cast é quando você "força" o compilador a tratar um objeto de um tipo mais genérico 
        // e um tipo mais genérico como se fosse de um
        // tipo mais específico.
        ((Manager)employee).setLogin("Pedro");
                
        // Faz o cast para Manager e define a senha do gerente
        ((Manager)employee).setPassword("245356");
                
       
                
        // Imprime o nome definido no objeto
        System.out.println(employee.getName());
                    
        // Imprime o login do gerente (precisa ser Manager, por isso foi feito o cast antes)
        System.out.println(((Manager)employee).getLogin());
                    
        // Imprime a senha do gerente (mesma lógica do login)
        System.out.println(((Manager)(employee).getPassword());
      } 
    
     // Apenas imprime uma linha de separação visual
     System.out.println("============");
     
    }
}
