package Base;

public class Main {
	public static void main(String[] args) {

		// Criando o valor-objeto Nome
		Nome nome = new Nome("Melissa");

		// Criando o usuário
		Usuario usuario = new Usuario(nome, "maria@gmail.com", "senha123");

		// Criando o service
		UsuarioService service = new UsuarioService();

		// Testando autenticação
		boolean loginOk = service.autenticar("maria@gmail.com", "senha123", usuario);

		System.out.println("Login correto? " + loginOk);

		// Alterando o nome
		Nome novoNome = new Nome("Mel pereira");
		service.atualizarNome(usuario, novoNome);

		System.out.println("Novo nome: " + usuario.getNome());
	}
}
