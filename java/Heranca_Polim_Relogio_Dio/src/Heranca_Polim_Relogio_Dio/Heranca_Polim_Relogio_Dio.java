package Heranca_Polim_Relogio_Dio;

// Por estar no mesmo package
// a classe main possui acesso aos atributos
// protected das classes que usam herança
// O modificador protected permite acesso de duas formas diferentes:
//
// 1. Por herança → qualquer subclasse (mesmo que esteja em outro pacote) pode acessar o membro protected da classe-pai.
// 2. Por pacote (package) → qualquer classe do mesmo pacote também pode acessar membros protected, mesmo que não seja subclasse.

public class Heranca_Polim_Relogio_Dio {
	public static void main(String[] args) {
		Clock brclock = new ClockBr();
		brclock.setSeconds(0);
		brclock.setMinute(0);
		brclock.setHour(25);

		System.out.println(brclock.getTime());
		System.out.println(new ClockUs().convert(brclock).getTime());
	}
}
