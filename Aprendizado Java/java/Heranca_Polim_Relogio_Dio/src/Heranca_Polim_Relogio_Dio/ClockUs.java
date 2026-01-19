package Heranca_Polim_Relogio_Dio;

public non-sealed class ClockUs extends Clock {

	private String periodIndicator;

	public
	String
	getPeriodIndicator() {
		return periodIndicator;
	}

	public void setAfterMindDay() {
		this.periodIndicator = "PM";
	}
	public void setBeforeMindDay() {
		this.periodIndicator = "AM";
	}
	//	Ela é chamada antes de qualquer verificação.

	//	Isso significa que o padrão inicial é “AM”, assumindo que a hora está antes do meio-dia.

	//	Mas se depois o hour estiver entre 13 e 23, ela vai ser sobrescrita com setAfterMindDay().

	//  Em outras palavras, está lá só pra garantir um valor inicial (“AM”), caso nenhum outro if seja verdadeiro.
	public
	void
	setHour(int hour) {
		setBeforeMindDay();
		// Esse primeiro if trata dos horários entre 13h e 23h (ou seja, 1h da tarde até 11h da noite).
		// Esse trata do caso em que hour é 24 ou mais, o que em relógio normal significa meia-noite (00:00).
		if((hour > 12) && (hour <=23)) {
			setAfterMindDay();
			this.periodIndicator = "PM";
			this.hour = hour - 12;
		}
		else if(hour >= 24) {
			this.periodIndicator = "AM";
			// Passou de 24h é 00:00
			// ex: 25 -> 01h do dia seguinte
			this.hour = 0;
		} else {
			this.hour = hour;
		}
		// Você tinha colocado return this.hour;
		// e anulou tudo, pois, sobrescreveu
	}

	@Override
	public Clock
	convert(Clock clock) {
		this.seconds = clock.getSeconds();
		this.minute = clock.getMinute();
		//		Esse é o “Pattern Matching for switch”, uma funcionalidade nova do Java (a partir do Java 17–21).

		//		O que ele faz:

		//		Verifica o tipo real do objeto clock.

		//		Se for uma instância de ClockUs, ele “extrai” automaticamente para uma variável (clockUs).

		//		Se for uma instância de ClockBr, ele “extrai” para clockBr.
		switch(clock) {
		case ClockUs clockUs -> {
			this.hour = clockUs.getHour();
			this.periodIndicator = clockUs.getPeriodIndicator();
		}
		case ClockBr clockBr -> this.setHour(clockBr.getHour());
		}
		return this;

	}

	@Override
	public
	String
	getTime() {
		// TODO Auto-generated method stub
		return super.getTime() + " " + this.periodIndicator;
	}



}
