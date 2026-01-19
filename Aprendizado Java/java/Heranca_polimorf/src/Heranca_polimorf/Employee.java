package Heranca_polimorf;
// Classe pai 
// as classes filhas de uma selada
// devem ser final, non-sealed ou sealed

// Para a cadeia de herança ter acesso a esses métodos
// deve-se mudar para protected
// Condições :
// Dentro da própria classe

// Sempre pode acessar seus próprios métodos e atributos.

// Dentro das classes do mesmo pacote (package)

// Qualquer outra classe que esteja no mesmo pacote pode acessar membros protected.

// Subclasses (classes filhas), mesmo que estejam em pacotes diferentes
public sealed  abstract class Employee permits Manager, Salesman {
	protected String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		this.Adress = adress;
	}
	public int getAge() {
		return Age;
	}
	public Employee() {
		super();
	}
	public Employee(String code, String name, String adress, int age, double comission, double salary) {
		super();
		this.code = code;
		Name = name;
		Adress = adress;
		Age = age;
		Comission = comission;
		this.salary = salary;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	protected String Name;
	protected String Adress;
	protected int Age;
	protected double Comission;
	public double getComission() {
		return Comission;
	}
	public void setComission(double comission) {
		this.Comission = comission;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	protected double salary;
	public String getLogin() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	// E se quiséssemos uma propriedade que as classes calculem todo o salário delas
	// sendo que é obrigatória a implemenção?
	public double getFullSalary(double extra) {
		return this.getSalary() + extra;
	}

}
