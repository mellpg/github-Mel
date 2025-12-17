package Trabalhando_Listas_Arrays;

import java.util.Objects;

public class User {

	private int code;

	// Boa prática quando a classe pode ser usada de diversas maneiras
	// para criar objeto vazio ou não, java já cria automaticamente, mas é uma boa
	// prática
	// Quando fazer isso?
	// Quando a sua classe precisa ser instanciada vazia ou quando algum recurso
	// externo depende disso
	// quando os dados serão preenchidos posteiormente, quando existem outros
	// construtores
	// Sempre bom ter um vazio e um com argumentos
	// Exemplo: public User() {}
//	public User(int code, String name) {}
// public User() {}   
// Aplicações:

//	Exemplos:

//		JPA/Hibernate

//		Spring

//		Jackson (JSON)

//		Gson

//		JavaBeans

//		Bibliotecas de XML/CSV

// Quando for opcional?
// Classes utilitárias

// Classes de lógica de negócio simples

// Classes que quase nunca são instanciadas sem valores

//  Quando NÃO colocar?
// 	Quando o  objeto não faz sentido existir sem dados.
// Exemplo: Conexão com banco, precisa String url, String usuario, String senha
// um construtor vazio seria inútil
// classes com parâmetros obrigatórios é inútil construtor vazio

	public User() {

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public User(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	// Implementando verificação Equals
	@Override
	public boolean equals(Object obj) {
		var isEqual = false;
		if (obj instanceof User user) {
			// Se estiveremos comparando objetos no mesmo endereço de memória
			// existe a possibilidade de serem diferentes?
			// Não existe, são os mesmos objetos
			// verificando se é o mesmo endereço de memória
			if (this == user)
				return true;
			// código igual e nome igual -> objetos iguais
			if (this.code == user.code && Objects.equals(this.name, user.name))
				return isEqual = true;
		}
		return isEqual;
	}

	// Método para melhorar formatação, para parar de imprimir o endereço de memória
	@Override
	public String toString() {
		return String.format("{ 'code' : %s, 'name' : %s }", this.code, this.name);
	}

}
