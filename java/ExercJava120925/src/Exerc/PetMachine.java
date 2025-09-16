package Exerc;

public class PetMachine {

    private int water = 30;     // quantidade de água disponível
    private int shampoo = 10;   // quantidade de shampoo disponível
    private Pet pet;       // pet atual dentro da máquina
    private boolean clean = true; // estado da máquina (limpa ou suja)

    // Dá banho no pet
    public void takeShowerInAPet() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }

        if (water < 2 || shampoo < 1) {
            System.out.println("Não há recursos suficientes (água/shampoo) para dar banho!");
            return;
        }

        // Consome recursos
        water -= 2;
        shampoo -= 1;

        // Deixa o pet limpo
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");

        // Após o banho, a máquina fica suja
        this.clean = false;
    }

    // Adiciona água
    public void addWater() {
        if (water >= 30) {
            System.out.println("A capacidade de água está no máximo!");
            return;
        }
        water += 2;
    }

    // Adiciona shampoo
    public void addShampoo() {
        if (shampoo >= 10) {
            System.out.println("A capacidade de shampoo está no máximo!");
            return;
        }
        shampoo += 2;
    }

    // Coloca um pet na máquina
    public void setPet(Pet pet) {
        if (this.pet != null) {
            System.out.println("Já existe um pet (" + this.pet.getName() + ") no banho!");
            return;
        }
        this.pet = pet;
        System.out.println(" O " + pet.getName() + " foi colocado na máquina.");
    }

    // Remove o pet da máquina
    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover!");
            return;
        }

        if (this.pet.isClean()) {
            System.out.println("O pet " + this.pet.getName() + " saiu limpo!");
        } else {
            System.out.println("O pet " + this.pet.getName() + " saiu sujo!");
        }

        this.pet = null; // libera a máquina
    }

    // Limpa a máquina usando água e shampoo
    public void wash() {
        if (water < 10 || shampoo < 2) {
            System.out.println("Não há recursos suficientes para limpar a máquina!");
            return;
        }

        water -= 10;
        shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }

    // Getters
    public Pet getPet() {
        return this.pet;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public boolean isClean() {
        return clean;
    }
    
}
