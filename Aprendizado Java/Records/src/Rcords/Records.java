package Rcords;

public class Records {

	public static void main(String[] args) {
		var person1 = new Person("Mel",19);
		var person2 = new Person ("Aninha");
// Se quiser reapriveitar, é o mesmo processo de criar novo objeto, mas sem o var
// O erro aparece porque o Java não deixa você declarar duas vezes uma variável com o mesmo nome no mesmo escopo.
// e você quiser guardar os dois (Mel e Aninha) ao mesmo tempo, só precisa usar variáveis diferentes:
// var person1 = new Person("Mel", 19);
// var person2 = new Person("Aninha"); // aqui a idade já vem como 1
// System.out.println(person1.getInfo());
// System.out.println(person2.getInfo());

		
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	
// Se eu quisesse reaproveitar valores do meu record
// para criar um
// Criamos outra instância, outro objeto
		var newPerson = new Person(person2.name(),13);
		System.out.println(newPerson);
		
	}


}
