package Exerc;

public class Pet {

    private final String name; // nome do pet
    private boolean clean;     // estado de limpeza

    // Construtor: pet começa sempre sujo
    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    // Getter do nome
    public String getName() {
        return name;
    }

    // Verifica se está limpo
    public boolean isClean() {
        return clean;
    }

    // Define se o pet está limpo
    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
// 27 47