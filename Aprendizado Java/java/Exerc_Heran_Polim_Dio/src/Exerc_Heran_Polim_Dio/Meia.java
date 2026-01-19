package Exerc_Heran_Polim_Dio;

public non-sealed class Meia extends Ingresso {
	
public Meia(double valor, String name, String dubLeg) {
		super(valor, name, dubLeg);
		// TODO Auto-generated constructor stub
	}

public double getFullValor() {
	return this.getValor() / 2;}
}