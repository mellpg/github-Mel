package Base;
// Regras de negócio para Usuario

public class UsuarioService {

	// Método do negócio de verificação de login
	public boolean autenticar(String email, String senha, Usuario usuario) {
		// Validação simples ( exemplo básico)
		if (email == null || senha == null)
			return false;

		return usuario.getEmail().equals(email) && usuario.getSenha().equals(senha);
	}

	// Método que muda o nome seguindo regras específicas
	public void atualizarNome(Usuario usuario, Nome Novonome) {
		usuario.setNome(Novonome);
	}

}
