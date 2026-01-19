package Interface;

public class  MusicBox implements VideoPlayer {
	
	@Override
	public
			void
			playVideo() {
		System.out.println("A caixa de música está reproduzindo o video");
		
	}

	@Override
	public
			void
			pauseVideo() {
		System.out.println("A caixa de música está pausando video");
	}

	@Override
	public
			void
			stopVideo() {
		System.out.println("A caixa de música parou video");
		
	}

}
