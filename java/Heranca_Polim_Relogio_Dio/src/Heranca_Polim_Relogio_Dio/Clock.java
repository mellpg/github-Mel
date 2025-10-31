package Heranca_Polim_Relogio_Dio;

public sealed abstract class Clock permits ClockBr, ClockUs {

	public
			int
			getHour() {
		return hour;
	}

	public
			void
			setHour(int hour) {
		if(hour > 24) {
			this.hour= 24;
			return; }
		this.hour = hour;
	}

	public
			int
			getMinute() {
		return minute;
	}

	public
			void
			setMinute(int minute) {
		if(minute >= 60) {
			this.minute = 60;
			return;
		}
		this.minute = minute;
	}

	public
			int
			getSeconds() {
		return seconds;
	}

	public
			void
			setSeconds(int seconds) {
		if(seconds >= 60) {
			this.seconds = 60;
			return;
	}
		this.seconds = seconds;
	}
	// vamos concatenar
	// Concatenar significa juntar ou unir coisas — normalmente strings (textos) — uma depois da outra.
	
	private String format(int value) {
		return value < 9? "0" + value : String.valueOf(value); // método que vai retornar como String
	}
	
	public String getTime() {
		return format(hour) + ":" + format(minute) + ":" + format(seconds);
	}
	
	abstract Clock convert (Clock clock);

	protected int hour;
	
	protected int minute;
	
	protected int seconds;
}
