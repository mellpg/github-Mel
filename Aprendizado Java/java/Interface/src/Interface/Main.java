package Interface;
public class Main {
	// classes abstratas precisam de implementação 
	public static
	void
	main(String[] args) {
		runMusic(new Computer());
		runVideo(new Computer());
		// ou usar essa primeira solução pra ficar mais simples
		// Não vai funcionar pq definimos como musicPlayer
		// Então vamos declarar direto como computer
		// MusicPlayer musicPlayer = new Computer();
		// Computer musicPlayer = new Computer();
		//runVideo();


	}

	public static  void runVideo(VideoPlayer videoPLayer) {
		videoPLayer.playVideo();
	}
	public static  void runMusic(MusicPlayer musicPlayer) {
		musicPlayer.playMusic();
	}


}




/*
//É uma classe anônima
//uma forma de criar uma classe interna que
//não tem nome, declarando e instanciando-a ao mesmo tempo
		var musicPlayer = new MusicPlayer() {
			@Override
			public void playMusic() {
				
				System.out.println("Tocando a música");				
			}
			
			@Override
			public void pauseMusic() {
				
			} 
			
			@Override
			public void stopMusic() {
				
			}
		};
		
		musicPlayer.PlayMusic();
*/


/*
Music musicPlayer = new Computer();
runMusic(musicPlayer);
Isso funciona igual, mas você está criando uma variável (musicPlayer) que só é usada uma vez.

Quando você faz:

runMusic(new Computer());


Você cria o objeto e o usa imediatamente, sem precisar guardar em uma variável.

✅ É mais enxuto e eficiente, especialmente quando o objeto não precisa ser reutilizado.
*/