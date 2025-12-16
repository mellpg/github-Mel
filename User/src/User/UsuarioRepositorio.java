package User;

public class UsuarioRepositorio {

	public void salvar(Usuario usuario) {
		System.out.println("Salvando usuário no banco...");
	}

	public Usuario buscarPorEmail(String email) {

		// Ainda não temos banco real, então devolvemos null (não achou)
		return null;
	}
}
