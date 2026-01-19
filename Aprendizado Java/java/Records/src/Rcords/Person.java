package Rcords; 

// Record é nada mais que uma classe que armazena dados
// Todo atributo declarado no record é privado e usado no método dele
public record Person(String name, int age) {
	
// O construtor no Record é chamado Compacto
// Muito utilizado para validação de valores
// Rejeitar valores, não permitir nome nulo
// Quando você cria um objeto com new Person("João", 20), o Java primeiro passa os valores para o construtor 
// (seja o compacto ou o normal).
// Dentro do construtor compacto, você pode validar ou até lançar exceções antes de o objeto ser definitivamente criado.
//	Só depois que o construtor termina, o objeto existe de fato e você pode usá-lo no código principal.

	public Person {
		
	} 
	public String getInfo() {
		return "Name: " + name + " \nAge: " + age;
	}
// Podemos ter um construtor secundário
	public Person(String name) {
		this(name,1);
	}

}
