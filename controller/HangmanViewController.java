package controller;

public interface HangmanViewController {
	 public void didStartGame();
	 public void didGuessLetter(char c);
	 public boolean hasBeenGuessed(char c);
}
