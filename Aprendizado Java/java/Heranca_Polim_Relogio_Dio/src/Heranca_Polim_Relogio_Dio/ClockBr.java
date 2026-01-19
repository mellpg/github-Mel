package Heranca_Polim_Relogio_Dio;

public non-sealed class ClockBr extends Clock {

	@Override
	public Clock
			convert(Clock clock) {
		this.seconds = clock.getSeconds();
		this.minute = clock.getMinute();
// O switch(clock) com pattern matching
// O switch usa pattern matching pra verificar o tipo real de clock.
// Caso 1: ClockUs (americano → converter pra 24h)
// Aqui ele usa o operador ternário (?:), que é um if simplificado.
// “Se o período for PM, some 12 à hora;
// senão, use a hora como está.”
// Caso 2: ClockBr
// Se o relógio já for brasileiro (24h), ele não precisa converter nada — só copia a hora.
// Retorno: return this;
// Aqui ele retorna o objeto atual (this), que é o relógio já convertido para o formato brasileiro.
// Etapa	O que faz	Exemplo
//		Copia minutos e segundos	this.seconds = clock.getSeconds()	mantém o mesmo
//				Se for ClockUs	converte 12h → 24h com ternário	3 PM → 15
//				Se for ClockBr	copia direto	18 → 18
//				Retorna o próprio objeto	return this	devolve o novo relógio convertido
// Comparando com o anterior:
// Direção da conversão	Código anterior	Código atual
//		🇧🇷 24h → 🇺🇸 12h	ClockBr para ClockUs	Este faz o inverso
//		🇺🇸 12h → 🇧🇷 24h	—	✅ Este aqui
		switch(clock) {
		case ClockUs clockUs -> {
			int h = clockUs.getHour();
			if (clockUs.getPeriodIndicator().equals("PM") && h != 12) h += 12;
			if (clockUs.getPeriodIndicator().equals("AM") && h == 12) h = 0;
			this.hour = h;
		}
		case ClockBr clockBr -> this.hour = clockBr.getHour();
		}
		return this;
		
	}
	
}
