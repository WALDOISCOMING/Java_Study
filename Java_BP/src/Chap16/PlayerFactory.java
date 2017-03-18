package Chap16;

public abstract class PlayerFactory {
	abstract Player createPlayer();
	interface Player{
		void play(String source);
		void stop();
	}
}
