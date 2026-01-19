package Exerc_Heran_Polim_Dio;

public non-sealed class Familia extends Ingresso {
	
private int numeroDePessoas;
public Familia (double valor, String name, String dubLeg, int numeroDePessoas) {
		super(valor, name, dubLeg);
		this.numeroDePessoas = numeroDePessoas;
}
public double getFullValor() {
	double total = this.getValor() * numeroDePessoas;
	if(numeroDePessoas > 3) {
		total *= 0.95; // aplica desconto de 5%
	}
	return total;
}
int numeroDePessoas() {
	return numeroDePessoas;
}

}