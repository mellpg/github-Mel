package Exerc_Heran_Polim_Dio;

public sealed abstract class Ingresso permits Meia,Familia{

protected double valor;
public
		double
		getValor() {
	return valor;
}
public
		void
		setValor(double valor) {
	this.valor = valor;
}
public
		String
		getName() {
	return name;
}
public
		void
		setName(String name) {
	this.name = name;
}
public
		String
		getDubLeg() {
	return DubLeg;
}
public
		void
		setDubLeg(String dubLeg) {
	DubLeg = dubLeg;
}
protected String name;
protected String DubLeg;
public Ingresso(double valor, String name, String dubLeg) {
	super();
	this.valor = valor;
	this.name = name;
	DubLeg = dubLeg;
}
}