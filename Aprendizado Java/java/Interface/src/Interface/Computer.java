package Interface;

public class Computer implements VideoPlayer , MusicPlayer {
	
	@Override
	public
			void
			playVideo() {
		System.out.println("O computador está reproduzindo o video");
		
	}

	@Override
	public
			void
			pauseVideo() {
		System.out.println("O computador está pausando video");
	}

	@Override
	public
			void
			stopVideo() {
		System.out.println("O computador parou video");
		
	}

	@Override
	public
			void
			playMusic() {
		System.out.println("O computador está tocando a música");
		
	}

	@Override
	public
			void
			pauseMusic() {
		System.out.println("O computador está pausando música");
		
	}

	@Override
	public
			void
			stopMusic() {
		System.out.println("O computador está parando a música");
		
	}
	

}
