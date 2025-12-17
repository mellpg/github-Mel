package Heranca_polimorf;
// classes filhas
public non-sealed class Salesman extends Employee{
	private double percentPerSold;

	private double soldAmount;
	public double getPercentPerSold() {
		return percentPerSold;
	}

	public void setPercentPerSold(final double percentPerSold) {
		this.percentPerSold = percentPerSold;
	}
	// construtor
	public Salesman(String code,
			String name,
			String adress,
			int age,
			double comission,
			double salary,
			double percentPerSold,
			double soldAmount) {
		super(code, name, adress, age, comission, salary);
		this.percentPerSold = percentPerSold;
		this.soldAmount = soldAmount;}
   public double
        getSoldAmount() {
		return soldAmount;
	}
// Forçando implementação
	@Override
public
		double
		getFullSalary() {
	return this.salary + (soldAmount * percentPerSold)/100;
}

	public
			void
			setSoldAmount(double soldAmount) {
		this.soldAmount = soldAmount;
	}

	// Como seria se quiséssemos colocar um prefixo
// para diferenciar manager e salesman?
// vamos sobrescrever
	@Override
	public String getCode() {
		// Temos que colocar a implementação antiga
		return "SL:" + super.getCode();
	}
	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}
}
