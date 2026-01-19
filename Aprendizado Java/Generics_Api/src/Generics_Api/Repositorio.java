package Generics_Api;

// Generic: Repositório 
import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {

	private List<T> dados = new ArrayList<>();

	// Adicionando qualquer Tipo
	public void adicionar(T item) {
		dados.add(item);
	}

	// Retorna todos
	public List<T> listar() {
		return dados;
	}

	// Verifica se está vazio
	public boolean estaVazio() {
		return dados.isEmpty();
	}

	// Quantidade de elementos
	public int quantidade() {
		return dados.size();
	}

	// Aplicação na vida real: Pode ser usado em backend, JPA e Spring por exemplo

}
