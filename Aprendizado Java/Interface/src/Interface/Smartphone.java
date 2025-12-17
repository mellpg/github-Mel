package Interface;
// diferente de classes abstratas, interface deixa você herdar quantas classes quiser
// as classes abstratas deixam herdar apenas 1 por vez
public class Smartphone implements VideoPlayer , MusicPlayer{

	@Override
	public
			void
			playVideo() {
		System.out.println("Play no video");
		
	}

	@Override
	public
			void
			pauseVideo() {
		System.out.println("Pausandovideo");
	}

	@Override
	public
			void
			stopVideo() {
		System.out.println("Parando video");
		
	}

	@Override
	public
			void
			playMusic() {
		System.out.println("Tocando a música");
		
	}

	@Override
	public
			void
			pauseMusic() {
		System.out.println("Pausando música");
		
	}

	@Override
	public
			void
			stopMusic() {
		System.out.println("Parando música");
		
	}
	
	
	
	

} 
// obs: ctrl + g
