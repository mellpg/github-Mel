package Pclasse;

public class PrimeiraClasse {
     // Método pra criar a classe 
	public static void main(String[] args) {
		// Chamando novo construtor
	    var male = new Person("João");
	    male.incAge();
	    Person.setTest("\nTestando!");
	    
	    var female = new Person("Maria");
	    female.incAge();
	    
	    // Para acessar na memória
	    // Variável + TipoDeModelo
	    System.out.println("\nName: " + male.getName() + "| age : " + male.getAge());
	    System.out.println("\nName: " + female.getName() + "| age: " + female.getAge());
	    System.out.println("\nO teste:" + Person.getTest());
	    
	    // Chamando o método estático 
	    // Um método estático é aquele que não tem acesso aos atributos 
	    // da classe 
	 //   System.out.println("\nTeste: " + Person.getTest());
	    
        
	}

}
