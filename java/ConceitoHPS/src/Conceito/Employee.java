package Conceito;

public sealed abstract class Employee permits Manager, Salesman {
	// Atributos e métodos 
	// Boas práticas de encapsulamento
	// classe abstrata não pode ser implementada
	// as subclasses (non-sealed) são concretas
	// podem ser instanciadas
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	protected String name;
	
	protected String code;
	
	protected int age;
	
	protected String Adress;
	
	protected double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	} 
	// Estamos informando que essa classe pra ser instanciada precisa ser a partir de um construtor
	// toda nossa herança vai exigir também
	public Employee(String code, String name, String address, int age, double salary ) {
		this.code = code;
		this.name = name;
		this.Adress = address;
		this.age = age;
		this.salary = salary;
	} 
	
	
	public Employee(String code2, String name2, String address, int age2, double salary2, double soldAmount) {
		
	}
	
	// Como acessar as propriedades diretamente na cadeia de herança?
	// já que o protected não está resolvendo
	//  COMO RESOLVER?
	// Usando o modificador de acesso protected
	// ele não permite acesso fora da classe a não ser que a classe que quer o acesso 
	// esteja herdando essa classe 
	
	// E se quiséssemos criar uma propriedade de soma todo o salário nas classes e que implementar?
	// e que seja obrigatório a implementar
	// COMO FAZER?
	// pontos a considerar:
	// 1) O salário do Salesman depende da porcentagem de vendas
	// 2) E do Manager depende da comission
	// PULO DO GATO
	// Quando a classe que queremos manipular é abstrata, ela não pode ser instânciada
	// Se a gente definir um método como abstrato, ele não tem corpo, so vamos definir ele
	// a implementação dele vai ser responsabilizado pela de quem vai herdar ele
	// teríamos que definir as classes ou como abstratas ou implementar um novo método
	// Então:
	// 
	
	public abstract  double getfullSalary();

}
