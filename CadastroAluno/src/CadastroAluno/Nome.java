package CadastroAluno;

public class Nome { // classe pública chamada Nome

	// Atributo privado e final
	// imutável, não pode ser alterado após criado
	private final String valor;

	// Construtor: cria o objeto Nome e aplica validações

	public Nome(String valor) {
		if (valor == null || valor.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		if (valor.length() < 2) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.valor = valor; // atribui o valor ao atributo da classe
	}

	// Retorna o valor do nome
	// Controlar acesso ao atributo, já que é privado
	public String getValor() {
		return valor;
	}

	// Melhora do texto
	@Override
	public String toString() {
		return valor;
	}

//	Explicação do fluxo e sintaxe:

//		private final → garante encapsulamento e imutabilidade

//		throw new IllegalArgumentException → impede a criação de um objeto inválido

//		this.valor → refere-se ao atributo da classe, não ao parâmetro do construtor

//		@Override → indica que estamos sobrescrevendo um método da classe Object

//		Fluxo: Quando você cria um Nome, ele já é validado e não pode ser alterado depois.

}
