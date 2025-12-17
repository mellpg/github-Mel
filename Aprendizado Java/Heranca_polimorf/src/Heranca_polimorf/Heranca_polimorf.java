package Heranca_polimorf;

public class Heranca_polimorf {

	public static void main(String[] args) {
		printEmployee(new Manager());  // Passando objeto como argumento
		printEmployee(new Salesman()); // Passando objeto como argumento
	}

	// Resolvendo problema do Employee para acessar o manager
	public static void printEmployee(Employee employee) {
		// Vamos fazer uma conversão
		// um tipo para outro tipo
		// Salesman não pode ser convertida para Manager
		// Apesar de estarem na mesma cadeia de herança, só pode converter ele 
		// para um mais específico
		// é necessário uma verificação

		// 1. só imprime o tipo do objeto
		System.out.printf("=======%s=======%n", employee.getClass().getCanonicalName());

		// 2. guarda a classe do objeto em uma variável
		Class<? extends Employee> class1 = employee.getClass();

		// 3. só faz cast se for realmente Manager
		if (employee instanceof Manager) {
			Manager manager = (Manager) employee; // cast seguro

		}
		switch(employee) {
		case Manager manager ->{
			manager.setCode("4569863");
			manager.setName("João");
			manager.setSalary(5000);
			manager.setLogin("joao");
			manager.setPassword("123");
			manager.setComission(1300);

			System.out.println(manager.getCode());
			System.out.println(manager.getSalary());
			System.out.println(manager.getLogin());
			System.out.println(manager.getName());
			System.out.println(manager.getPassword());
			System.out.println(manager.getComission());
			System.out.println(manager.getFullSalary(1000));
		}
		case Salesman salesman ->{
			salesman.setCode("45698");
			salesman.setName("Pedro");
			salesman.setSalary(2000);
			salesman.setPercentPerSold(10);
			salesman.setSoldAmount(2500);
			System.out.println(salesman.getCode());
			System.out.println(salesman.getSalary());
			System.out.println(salesman.getName());
			System.out.println(salesman.getPercentPerSold());
		}
		}
		System.out.println(employee.getFullSalary(1000));
		System.out.println(employee.getSalary());
		System.out.println("=======");
	}

	// Separando as coisas, fica assim:

	// 1. só imprime o tipo do objeto
	// System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());

	// 2. guarda a classe do objeto em uma variável
	// Class<? extends Employee> class1 = employee.getClass();  

	// Cast é forçar o compilador a tratar uma variável de um tipo    // para outro tipo

	// Exemplo:
	//  double x = 10.5;
	//  int y = (int) x;  // cast: transforma double em int
	//   System.out.println(y); // imprime 10

	// Se na classe pai tivesse construtor com argumentos
	// toda cadeia de herança iria exigir
	// utilizariamos o super( sempre quando existe, está acionando 
	// comportamento da classe pai

}
