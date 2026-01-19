package ProjetoPetModel;

import java.util.HashMap;
import java.util.Map;

// Fornecer e guardar os pets

public class Service {

	private Map<String, Pet> pets = new HashMap<>();

	public void adicionar(String nome, Pet pet) {
		pets.put(nome, pet);
	}

	public Map<String, Pet> listar() {
		return pets;
	}

	public boolean estaVazio() {
		return pets.isEmpty();
	}

}
