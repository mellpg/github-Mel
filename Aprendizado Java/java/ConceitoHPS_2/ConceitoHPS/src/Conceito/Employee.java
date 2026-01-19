package Conceito;

public sealed abstract class Employee permits Manager, Salesman {
	// Atributos e métodos 
	// Boas práticas de encapsulamento
	// classe abstrata não pode ser implementada
	// as subclasses (non-sealed) são concretas
	// podem ser instanciadas, desde que sejam, ou final
	// non-sealed ou sealed
	
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

	private String name;
	
	private String code;
	
	private int age;
	
	private String Adress;
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
