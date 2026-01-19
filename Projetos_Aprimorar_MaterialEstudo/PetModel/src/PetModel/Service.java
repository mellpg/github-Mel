package PetModel;

// Guardando e fornecendo dados dos Pets

// Separando responsabilidades, HashMap e Service layer
import java.util.HashMap;
import java.util.Map;

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
