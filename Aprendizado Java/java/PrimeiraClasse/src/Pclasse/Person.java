package Pclasse;
import java.time.*;  

public class Person {
	// Estão públicas, estamos dando acesso direto as propriedades, mudando para private 
//  public String name;
// public int age;
	
	// Definindo como constante para segurança
	private final String name;
	
	private  int age; 
// Criando método para liberar incremento da idade 
// Só pode incrementar a idade uma vez por ano
// Nossa regra de negócio
	private int lastYearAgeinc = OffsetDateTime.now().getYear();
	
	private static String test;
	
	// Tivemos que criar um param aleatório para exemplificar
	// Exemplificando como o Static não tem acesso as instâncias
	// Tem que usar a classe
	public static void setTest(String testParam) {
		test = testParam;
	} 
	
	public static String getTest() {
		return test;
	}
	
	// 
	//public String getTeste() {
		// Não tem como usar this no método static
	//}
	
	// Quando um atributo é privado
	// Tem que proteger com método get e set
	//public String getName() {
		//return name;
		
	//} 
	//public int getAge() {
		//return age;
	//}  
	
	// Como acessar publicamente:
	public String getName() {
		return this.name;
	} 
//   Removendo set para não ter alteração
//	public void setName(String name) {
//		this.name = name;
//	} 
	public int getAge() {
		return this.age;
	} 
	
	
	// E se quisessémos que o nome não possa ser alterado?
	// 1) Tirar o setter
	// 2) Novo construtor
	public Person (String name) {
		this.name = name;
// Iniciando a partir de quando vai ser iniciado
// se nao quisesse essa regra ai apenas ficaria
// public person (String name. int age) {
//		this.name = name;
//		this.age = age;
// Na hora de imprimir
// var male = new Person("João" , idade que quer);
		this.age = 1;
	}
// Método para identificar se passou do ano para incrementar a idade 	
    public void incAge() {
    	if (this.lastYearAgeinc >= OffsetDateTime.now().getYear()) return;
    	
    	this.age +=1;
    	this.lastYearAgeinc = OffsetDateTime.now().getYear();
    }
}
