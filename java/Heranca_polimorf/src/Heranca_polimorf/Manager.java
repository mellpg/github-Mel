package Heranca_polimorf;
// classes filhas
// Criamos um novo tipo de colaborador
// agora para não repetir código, utilizamos extends
public non-sealed class Manager extends Employee {
	private String login;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String i) {
		this.password = i;
	}
	private String password;

	public Manager(String code,
	               String name,
	               String adress,
	               int age,
	               double comission,
	               double salary,
	               String login,
	               String password) {
		super(code, name, adress, age, comission, salary);
		this.login = login;
		this.password = password;
	
	}
	@Override
	public String getCode() {
		// Temos que colocar a implementação antiga
		return "MN:" + super.getCode();
	}
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public
			double
			getFullSalary() {
		return this.salary + this.Comission;
	}
	
// Digamos que às vezes a gente queira
// um extra no full salary
// Isso se chama sobrecarga de método
	
// SOBRESCRITA # SOBRECARGA DE MÉTODO(OVERLOADING)
// 1) PEGANDO COMPORTAMENTO DA CLASSE PAI E DEFINDO COMPORTAMENTO DIFERENTE
// USANDO CÓDIGO
// 2) Ocorre dentro da mesma classe (ou em subclasses, mas normalmente na mesma).
//	➡️ Tem o mesmo nome, porém parâmetros diferentes (ou em tipo, ou em quantidade, ou em ordem).
//	➡️ A assinatura do método muda, porque a assinatura inclui o nome + lista de parâmetros. 
	
// Exemplo:
//	class Calculadora {
//	    void somar(int a, int b) {            // método 1
//	        System.out.println(a + b);
//	    }

//	    void somar(double a, double b) {      // método 2 — sobrecarga (parâmetros diferentes)
//	        System.out.println(a + b);
//	    }

//	    void somar(int a, int b, int c) {     // método 3 — sobrecarga (quantidade diferente)
//	        System.out.println(a + b + c);
//	    }
//	}

	

}
