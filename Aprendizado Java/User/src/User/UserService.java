package User;

public class UserService {

	private final UsuarioRepositorio repositorio;
	private final ServiceEmail service;

	public UserService(UsuarioRepositorio repositorio, ServiceEmail service) {
		this.repositorio = repositorio;
		this.service = service;
	}

	public void cadastrar(Usuario usuario) {
		repositorio.salvar(usuario);
		service.enviarBoasVindas(usuario.getEmail());
	}

	public boolean login(String email, String senha) {
		Usuario usuario = repositorio.buscarPorEmail(email);

		if (usuario == null)
			return false;

		return usuario.senhaCorreta(senha);
	}
}
