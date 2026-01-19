package Conceito;

public non-sealed class Salesman extends Employee {
    // Porcentagem do número de vendas 
    // implementação 
    private double PercentPerSold;
    private double soldAmount;

    // Super é usado pra acionar comportamento da classe pai
    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, address, age, salary); // chama o construtor da superclasse
        this.PercentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    // Construtor sem argumentos (exemplo)
    public Salesman() {
        super("", "", "", 0, 0); // Inicializa code, name, address, age e salary com valores padrão
        this.PercentPerSold = 0;
        this.soldAmount = 0;
    }

    public double getPercentPerSold() {
        return PercentPerSold;
    }

    public void setPercentPerSold(final double percentPerSold) {
        this.PercentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "sl" + super.getCode();
    }

    // Implementando o método abstrato da superclasse
    @Override
    public double getfullSalary() {
        return this.getSalary() + ((soldAmount * PercentPerSold) / 100);
    }

}

    

 
