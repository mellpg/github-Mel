package ArrayLista2_InterfaceSet;

import java.util.Objects;

public class User {

	public User() {

	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("{ 'id' : %d, 'name' : %s }", id, name);
	}

	@Override
	public boolean equals(final Object obj) {
		// verificando se estão no mesmo endereço de memória
		if (obj == this)
			return true;

		// Se o objeto passado for null, não tem como ser igual.
		// Se o objeto não for da classe User, ele não pode ser igual.
		// instanceof User garante que é comparável.
		if (Objects.isNull(obj) || !(obj instanceof User))
			return false;

		// Fazendo cast:
		// Depois do instanceof, temos certeza de que é seguro converter para User
		// Convertendo para classe correta (User)
		var user = ((User) obj);

		// Fazendo comparação
		// Dois Users são iguais quando possuem o mesmo id e o mesmo name
		return this.id == user.getId() && Objects.deepEquals(user.getName(), this.name);
	}

	// Se dois objetos são iguais pelo equals(), eles DEVEM gerar o mesmo hash.
	// Isso garante que equals e hashCode permanecem coerentes
	@Override
	public int hashCode() {

		return Objects.hash(this.id, this.name);
	}

}
