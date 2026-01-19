package Generics_Stream2;

import java.util.ArrayList;
import java.util.List;

// Aplicação na vida real: Na vida real: Repository do Spring, DAO, JPA.
// Generic é reutilizável e seguro

public class Repositorio<T> {

	private List<T> dados = new ArrayList<>();

	public void adicionar(T item) {
		dados.add(item);
	}

	public List<T> listar() {
		return dados;
	}

	public boolean estaVazio() {
		return dados.isEmpty();
	}

	public int quantidade() {
		return dados.size();
	}

}
